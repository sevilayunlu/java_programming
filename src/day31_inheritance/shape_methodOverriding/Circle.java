package day31_inheritance.shape_methodOverriding;

public final class  Circle extends Shape{

    private double radius;


    public Circle(double radius) {
      setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius*radius*3.14;
    }

    @Override
    public double perimeter() {
        return radius*2*3.14;
    }

    @Override
    public void draw() {
        super.draw();
        //code fragments that can draw a circle
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" +getName() + '\'' +
                "radius='" +radius + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
//2 more subclasses of shape class. Triangle and rectangle. They should draw the correct shapes.
// Override the draw method and toString