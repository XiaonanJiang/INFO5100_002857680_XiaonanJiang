public class Main {
    public static void main(String[] args) {
        System.out.println("Since not required, nothing being Instantiate here.");
    }
}
abstract class Shape{
    static String Name;
    static String Color;
    double Area;
    double Perimeter;
    abstract public void calculateArea();
    abstract public void calculatePerimeter();
}

class Triangle extends Shape{
    double bottom_edge_length;
    double edge_length_1;
    double edge_length_2;
    double The_corresponding_height_of_the_above_bottom_edge;
    public void calculateArea(){
        Area=bottom_edge_length*The_corresponding_height_of_the_above_bottom_edge/2;
    };
    public void calculatePerimeter(){
        Perimeter=bottom_edge_length+edge_length_1+edge_length_2;
    };


}

class Rectangle extends Shape{
    double bottom_edge_length;
    double Hight;

    public void calculateArea(){
        Area=bottom_edge_length*Hight;
    };
    public void calculatePerimeter(){
        Perimeter=2*(bottom_edge_length+Hight);

    };

}

class Circle extends Shape{
    double radius;
    public void calculateArea(){
        Area=Math.PI*0.5*radius*radius;
    };
    public void calculatePerimeter(){
        Perimeter=Math.PI*2*radius;
    };

}

class Square extends Shape{
    double Side_length;
    public void calculateArea(){
        Area=Side_length*Side_length;
    };
    public void calculatePerimeter(){
        Perimeter=4*Side_length;
    };

}