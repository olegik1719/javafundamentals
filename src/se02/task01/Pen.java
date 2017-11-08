package se02.task01;

public class Pen {
//    private static int count = 0;
//    private int number;
    private EColor color;
    private EWidth width;
    public Pen(){
        //number = count++;
        this(EColor.BLACK, EWidth.THINK);
    }

    public Pen(EColor color, EWidth width){
        this.color = color;
        this.width = width;
    }
    /**
     * @return hashCode
     */
    public int hashCode(){
        int number = 31 * color.ordinal() + width.ordinal();
        return number;
    }

    public EWidth getWidth(){
        return width;
    }

//    public Pen setWidth(EWidth width){
//        this.width = width;
//        return this;
//    }

    public EColor getColor(){
        return color;
    }

//    public Pen setColor(EColor color){
//        this.color = color;
//        return this;
//    }

    public boolean equals(Pen pen){
        return (this.color == pen.color)&(this.width == pen.width);
    }

    public String toString(){
        return (color.toString() + " " + width.toString() + " pen").toLowerCase();
    }

    public static void main(String[] args) {

    }
}
