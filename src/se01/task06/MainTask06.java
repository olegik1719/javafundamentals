package se01.task06;

/**
 * Программа проверки классов <p>блокнот</p> и <p>запись блокнота</p>
 * @author olegik1719
 */
public class MainTask06 {
    public static void main(String[] args) {
        System.out.println("Hello!..");
        NotePad myNotes = new NotePad().
                addNote().
                addNote("test").
                addNote("3rd").
                outToPrint(2).
                removeNote(2).
                outToPrint();
        System.out.println(myNotes.getSizeOfList());
    }
}
