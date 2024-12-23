package JAVArebound;

class Shape{
    public void area(){
        System.out.println("Area of shape is not defined");
    }
}
class Rectangle extends Shape{
    public void area(int l,int b){
        System.out.println(l*b);
    }
}
class Triangle extends Shape{
    public void area(int r,int h){
        System.out.println(0.5*r*h);
    }
} 
public class OOps2 {
    public static void main(String[] args) {
        Shape s=new Shape();
        s.area();
        Rectangle r=new Rectangle();
        r.area(10,20);
        Triangle t=new Triangle();
        t.area(10,20);


    }
}
