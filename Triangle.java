public class Triangle extends Shape {

    private double height;
    private double base;


    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double calculateArea() {
        return  0.5*getBase()*getHeight() ;
    }

    public double calculateCircumference(){

        return getBase() * 3 ;

    }





}