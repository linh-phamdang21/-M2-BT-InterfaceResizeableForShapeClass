public class Square implements IResizeable {
    private double size;

    public Square(){

    }

    public Square(double size){
        this.size = size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public double getArea(){
        return this.size * this.size;
    }

    @Override
    public void resize(double percent) {
        this.size = this.size + this.size * percent / 100;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                ", area= " + this.getArea() +
                '}';
    }
}
