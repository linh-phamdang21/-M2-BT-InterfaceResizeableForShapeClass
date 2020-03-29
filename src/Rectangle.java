public class Rectangle implements IResizeable {
    private double width;
    private double height;

    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    @Override
    public void resize(double percent) {
        this.width = this.width + this.width * percent /100;
        this.height = this.height + this.height * percent / 100;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area= " + this.getArea() +
                '}';
    }
}
