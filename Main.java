//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Circle c1 = new Circle(5) ;

        Triangle t1 = new Triangle(2,4) ;

        Rectangle r1 = new Rectangle(4,6);


        c1.setRadius(8);

        System.out.println(c1.getRadius());

        t1.setBase(6);

        System.out.println(t1.getBase());

        t1.setHeight(10);
        System.out.println(t1.getHeight());

        r1.setWidth(6);

        System.out.println(r1.getWidth());





        System.out.println("Area of Circle : " + c1.calculateArea());
        System.out.println("Circumference of Circle : " + c1.calculateCircumference());
        System.out.println("Area of Triangle : " + t1.calculateArea());
        System.out.println("Circumference of Triangle : " + t1.calculateCircumference());
        System.out.println("Area of Rectangle : " + r1.calculateArea());
        System.out.println("Circumference of Rectangle : " + r1.calculateCircumference());


    }
}