package Figure;

public class Square extends Rectangle {

    protected int a;

    public Square(int a) {
        super(a, a);
        this.area = super.getArea();
        this.perimeter = super.getPerimeter();
    }
}
