package designpatterns.decorator;

//concrete class implementing interface Shape
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape : Rectangle");
    }
}
