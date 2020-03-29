public class Circle implements IResizeable {
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius + this.radius * percent / 100;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area= " + this.getArea() +
                '}';
    }
}
