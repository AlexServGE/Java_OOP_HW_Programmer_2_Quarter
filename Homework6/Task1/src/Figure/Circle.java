package Figure;

public class Circle extends Figure implements ILengthable{

    protected double radius;
    protected double length;


    public Circle(double radius) {
        super();
        this.radius = radius;
        this.area = this.getArea();
        this.length = this.getLength();
    }

    @Override
    public double getLength() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }
}
