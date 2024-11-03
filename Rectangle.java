public class Rectangle{
    float length;
    float width;

public Rectangle(){
    length = 1.0f;
    width = 2.0f;
}
public Rectangle (float length, float width){
    this.length = length;
    this.width = width;
}
public float getLength(){
    return length;
}
public float getWidth(){
    return width;
}
public void setLength(float newlength){
    this.length = newlength;
}
public void setWidth(float newwidth){
    this.width = newwidth;
}
public double findArea(){
    return length*width;
}
public double findPerimeter(){
    return 2*length + 2*width;
}
@Override
public String toString(){
    return "The length = " + length + "\n" +
    "The width = " + width + "\n" +
    "The area = " + findArea()+ "\n" +
    "The perimeter = " + findPerimeter();
}
}