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
     * Создание записи с заданным текстом
     * @param body -- Текст новой записи
     */
    public Note(String body){
        this();
        noteBody = body;
    }

    /**
     * Создание записи через копирование существующей
     * @param original
     */
    public Note(Note original){
        this(original.noteBody);
    }

    /**
     * Возвращает текст записи.
     * @return body
     */
    public String getNoteBody() {
        return noteBody;
    }

    /**
     * Меняет текст записи.
     * Возвращает сам объект. Возможно серийное использование.
     * @param newBody
     * @return
     */
    public Note setNotebody(String newBody){
        noteBody = newBody;
        return this;
    }

    /**
     * Создает копию записи.
     */
    @Override
    public Note clone(){
        return new Note(this);
    }

    /**
     * Очищает запись. Возвращает сам объект.
     * @return
     */
    public Note cleanNote(){
        return setNotebody("");
        //return this;
    }

    @Override
    public String toString(){
        return getNoteBody();
    }

}
