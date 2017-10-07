package se01.task06;

/**
 * Реализация класса <p>Записи</p>.
 * Методы:
 * 1. Создание;
 * 2. Изменение;
 * 3. Очистка;
 * 4. Получение;
 * Поля:
 * 1. Тело;
 * @author olegik1719
 */
public class Note {
    private String noteBody;

    /**
     * Создание пустой записи
     */
    public Note(){
        noteBody = "";
    }

    /**
     *
     */
    public Note(String body){
        this();
        noteBody = body;
    }

    public Note(Note original){
        this(original.noteBody);
    }

    public String getNoteBody() {
        return noteBody;
    }

    public Note setNotebody(String newBody){
        noteBody = newBody;
        return this;
    }

    @Override
    public Note clone(){
        return new Note(this);
    }

    public Note cleanNote(){
        setNotebody("");
        return this;
    }

    @Override
    public String toString(){
        return getNoteBody();
    }

}
