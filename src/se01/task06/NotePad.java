package se01.task06;

/**
 * Реализация класса <p>Блокнот</p>
 * 1. Создание блокнота;
 * 2. Добавление записи;
 * 3. Удаление записи;
 * 4. Печать списка записей;
 *
 * @author olegik1719
 */
public class NotePad {
    private Note[] notes;

    /**
     * показывает текущее количество реальных записей(вместе с удаленными).
     * <p>При удалении записей сдвига не происходит.</p>
     */
    private int capacity;

    public NotePad() {
        this(10);
    }

    private NotePad(int expected) {
        notes = new Note[expected];
    }

    public NotePad addNote() {
        Note note = new Note();
        addNote(note);
        return this;
    }

    public NotePad addNote(String body) {
        Note note = new Note(body);
        addNote(note);
        return this;
    }

    public NotePad addNote(Note note) {
        if (capacity >= notes.length)
            setSize(2 * capacity);
        notes[capacity++] = note.clone();
        //sizeOfList++;
        return this;
    }

    private NotePad setSize(int newSize) {
        Note[] newNotes = new Note[newSize];
        // заменить на arrayCopy!!!
        for (int i = 0, j = 0; i < capacity && j < newSize; i++, j++) {
            newNotes[j] = newNotes[i];
        }
        return this;
    }

 /*   public NotePad removeNotes(int[] removeSeries){
        // Проверка входных данных;
        boolean paramCorrect = true;
        for (int i = 0; i < removeSeries.length; i++) {
            paramCorrect &= removeSeries[i] < sizeOfList;
            if(!paramCorrect){
                System.out.println("remove index is not correct!");
                break;
            }
        }
        if (paramCorrect) {
            for (int remInd :removeSeries) notes[remInd] = null;
            for (int i = 0, j = 0; j < notes.length; i++,j++) {
                while (isNull(notes[j])){
                    j++;
                }
                notes[i] = notes[j];
            }
            sizeOfList -= removeSeries.length;
        }
        return this;
    }*/

    public NotePad removeNote(int remIndex) {
        if (remIndex < capacity) {
            System.arraycopy(notes, remIndex,
                    notes, remIndex + 1,
                    capacity - remIndex - 1);
            capacity--;
        }
        return this;
    }

    public NotePad outToPrint(int noteToPrint) {
        if (noteToPrint < capacity)
            System.out.printf("Запись номер %d:\n %s \n",
                    noteToPrint, notes[noteToPrint]);
        return this;
    }

    public NotePad outToPrint() {
        for (int i = 0; i < capacity; i++)
            outToPrint(i);
        return this;
    }

    public Note getNoteAt(int index) {
        return notes[index];
    }

    public int getSizeOfList() {
        return capacity;
    }

    public NotePad editNoteAt(int index, String newBody) {
        notes[index].setNotebody(newBody);
        return this;
    }

    public NotePad cleanNoteAt(int index) {
        notes[index].cleanNote();
        return this;
    }

}