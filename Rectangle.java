package odev1;
public class Rectangle {
    double height = 1;
    double width = 1;   

public Rectangle(){
    }
public Rectangle(double newWidth, double newHeight){
    
    width = newWidth ;
    height = newHeight;
}
public double getArea (){
    return height * width ;
    
}
public double getPerimeter (){
    return 2* (height + width);
    
}
}