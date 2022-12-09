package Figure;

public class Triangle extends Polygon {
    protected int a;
    protected int b;
    protected int c;

    protected double area;
    protected double perimeter;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimeter = this.getPerimeter();
        this.area = this.getArea();

    }


    @Override
    public double getPerimeter() {
        return this.a + this.b + this.c;
    }

    @Override
    public double getArea() {
        return Math.sqrt(this.perimeter*(this.perimeter-a)*(this.perimeter-b)*(this.perimeter-c));
    }
}
