package se01.task06;

/**
 * Реализация класса <p>Записи</p>.
 * Методы: <br>
 * 1. Создание; <br>
 * 2. изменение; <br>
 * 3. Очистка; <br>
 * 4. Получение; <br>
 * Поля: <br>
 * 1. Тело; <br>
 *
 * @author olegik1719
 */
public class Note {
    private String noteBody;

    /**
     * Создание пустой записи
     */
    public Note() {
        noteBody = "";
    }

    /**
     * Создание записи с заданным текстом
     *
     * @param body  Текст новой записи
     */
    public Note(String body) {
        this();
        noteBody = body;
    }

    /**
     * Создание записи через копирование существующей
     *
     * @param original данная запись
     */
    public Note(Note original) {
        this(original.noteBody);
    }

    /**
     * Возвращает текст записи.
     *
     * @return текст записи
     */
    public String getNoteBody() {
        return noteBody;
    }

    /**
     * Меняет текст записи.
     * Возвращает сам объект. Возможно серийное использование.
     *
     * @param newBody новое тело
     * @return запись с измененным телом
     */
    public Note setNotebody(String newBody) {
        noteBody = newBody;
        return this;
    }

    /**
     * Создает копию записи.
     *
     * @return  копию записи
     */
    @Override
    public Note clone() {
        return new Note(this);
    }

    /**
     * Очищает запись. Возвращает сам объект.
     *
     * @return очищенную запись
     */
    public Note cleanNote() {
        return setNotebody("");
        //return this;
    }

    @Override
    public String toString() {
        return getNoteBody();
    }

}
