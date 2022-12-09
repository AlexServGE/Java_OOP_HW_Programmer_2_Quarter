package Figure;

public class Rectangle extends Polygon {

    protected int a;
    protected int b;

    public Rectangle(int a, int b) {
        super();
        this.a = a;
        this.b = b;
        this.area = this.getArea();
        this.perimeter = this.getPerimeter();
    }


    @Override
    public double getPerimeter() {
        return 2 * (this.a + this.b);
    }

    @Override
    public double getArea() {
        return this.a * this.b;
    }



}