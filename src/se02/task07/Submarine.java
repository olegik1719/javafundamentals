package se02.task07;

@AnnoSubmarine(
        author = "Oleg Mihaylov",
        project = "Home works",
        taskNumber = 7
)
public class Submarine{
    private String name;

    private Turbine leftTurbine;
    private Turbine rightTurbine;
    private Turbine centerTurbine;

    class Turbine {
        public Turbine start() {
            System.out.printf("We all live in %s, %s, %s \n", name, name, name);
            return this;
        }
    }

    public Submarine(String name) {
        this.name = name;
        System.out.printf("In the town where I was born\nLived a man, who sailed to sea\nAnd he told us of his life\nIn the land of submarines\n");
        leftTurbine = new Turbine();
        rightTurbine = new Turbine();
        centerTurbine = new Turbine();
    }

    public Submarine letsGo() {
        System.out.printf("So we sailed up to the sun\nTill we found the sea of green\nAnd we lived beneath the waves\nIn our %s\n", name);
        leftTurbine.start();
        rightTurbine.start();
        centerTurbine.start();
        return this;
    }

    public static void main(String[] args) {
        Submarine yellowSubmarine = new Submarine("Yellow Submarine");
        yellowSubmarine.letsGo();
    }
}
