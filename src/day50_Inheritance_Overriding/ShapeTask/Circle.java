package day50_Inheritance_Overriding.ShapeTask;
/*
2. create sub classes of Shape:
                        Circle
                        Rectangle
                        Square

 */
public class Circle extends Shape {
    /*
    variable: area, perimeter
    methods: calculator, calculatorPerimeter()

     */


    public double radius;
    public double diameter;
    public static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
        diameter = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }
    public double calculateArea(){
        return radius*radius*PI;
    }

    public double calculatePerimeter(){
        return diameter*PI;

    }

}
