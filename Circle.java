public class Circle{
    public static void main(String[] args) {
        
    }
    double radius;
    String color;

public Circle(){
    radius = 1.0;
    color = "Red";
}
public Circle (double radius, String color){
    this.radius = radius;
    this.color = color;
}
public double getRadius(){
    return radius;
}
public String getColor(){
    return color;
}
public void setRadius(double newradius){
    this.radius = newradius;
}
public void setColor(String newcolor){
    this.color = newcolor;
}
public double findArea(){
    return Math.PI*radius*radius;
}
@Override
public String toString(){
    return "The radius = " + radius + "\n" +
    "The color = " + color + "\n" +
    "The area = " + findArea();
}
}