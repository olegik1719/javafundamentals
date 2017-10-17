package se02.task01;

public class Pen {
    private EColor color;
    private EWidth width;
    public Pen(){
        color = EColor.BLACK;
        width = EWidth.THINK;
    }

    /**
     * Effective numeration,
     * (n,m) -> (2^((m+1)+n)+2^n).
     * int n>=0; m>=0
     * @return hashCode
     */
    public int hashCode(){
        int hashcode=1;
        int numColor = color.ordinal();
        int numWidth = width.ordinal();
        hashcode <<= numWidth+1;
        hashcode++;
        hashcode <<= numColor;
        return hashcode;
    }

    public EWidth getWidth(){
        return width;
    }

    public Pen setWidth(EWidth width){
        this.width = width;
        return this;
    }

    public EColor getColor(){
        return color;
    }

    public Pen setColor(EColor color){
        this.color = color;
        return this;
    }

    public boolean equals(Pen pen){
        return (width == pen.width)&&(color == pen.color);
    }

    public String toString(){
        return (color.toString() + " " + width.toString() + " pen").toLowerCase();
    }

    public static void main(String[] args) {
        Pen pen = new Pen();
        System.out.println(pen.color+" "+ pen.color.ordinal());
        System.out.println(1<<5);
        //Integer a = 8;
        System.out.println(Integer.toBinaryString(pen.hashCode()));
        Pen pen1 = new Pen();
        System.out.println(pen.equals(pen1));
        System.out.println(pen.toString());
    }
}
