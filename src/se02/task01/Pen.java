package se02.task01;

import lombok.Getter;

public class Pen {
    @Getter
    private EColor color;
    @Getter
    private EWidth width;
    public Pen(){
        this(EColor.BLACK, EWidth.THINK);
    }

    public Pen(EColor color, EWidth width){
        this.color = color;
        this.width = width;
    }
    /**
     * Simple function for hashcode:
     * We use some prime numbers
     * If we need more, we may use big prime in division.
     * @return hashCode
     */
    public int hashCode(){
        int number = 31 * color.ordinal() + 67 * width.ordinal();
        return number;
    }

    /**
     * Changed param's type to Object for override;
     * @param pen
     * @return equals
     */
    public boolean equals(Object  pen){
        if (this.getClass()!=pen.getClass()) {
            return false;
        } else {
            return (this.color == ((Pen) pen).color)
                    & (this.width == ((Pen) pen).width);
        }
    }

    public String toString(){
        return (color.toString() + " " + width.toString() + " pen").toLowerCase();
    }

    public static void main(String[] args) {

    }
}
