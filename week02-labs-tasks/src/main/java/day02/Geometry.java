package day02;

public class Geometry {
    public static void main(String[] args) {
        System.out.println("\r\nGeometry 1.0\r\n");
        Rectangle rectangle = new Rectangle(10.254, 5.2);
        System.out.println("A téglalap \"A\" oldala: " + rectangle.getSideA() + " cm");
        System.out.println("A téglalap \"B\" oldala: " + rectangle.getSideB() + " cm");
        System.out.println("A téglalap területe: " + rectangle.getSideA() + " x " + rectangle.getSideB() + " = " + rectangle.calculatorArea() + " cm\u00b2");
    }
}
