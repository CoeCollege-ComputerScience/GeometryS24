import org.w3c.dom.css.Rect;

public class Rectangle {
    private final Point upperLeft;
    private Point lowerRight;

    public Rectangle(Point p1, Point p2) {

        double minX = Math.min(p1.getX(),p2.getX());
        double maxX = Math.max(p1.getX(),p2.getX());
        double minY = Math.min(p1.getY(),p2.getY());
        double maxY = Math.max(p1.getY(),p2.getY());
        upperLeft = new Point(minX, minY);
        lowerRight = new Point(maxX,maxY);
    }

    public Rectangle(Point upperLeft, double w, double h) {
        if (w <= 0){
            throw new IllegalArgumentException("Width must be positive");
        }
        if (h <= 0){
            throw new IllegalArgumentException("Height must be positive");
        }

        this.upperLeft = upperLeft;
        this.lowerRight = new Point(upperLeft.getX() + w, upperLeft.getY() + h);
    }

    public double getWidth(){
        return lowerRight.getX() - upperLeft.getX();
    }
    public double getHeight(){
        return lowerRight.getY() - upperLeft.getY();
    }

    public void setWidth(double w){
        if (w <= 0){
            throw new IllegalArgumentException("Width must be positive");
        }
        this.lowerRight = new Point(upperLeft.getX() + w, upperLeft.getY());
    }

    public void setHeight(double h){
        if (h <= 0){
            throw new IllegalArgumentException("Height must be positive");
        }
        this.lowerRight = new Point(upperLeft.getX(), upperLeft.getY()+h);
    }



    private boolean isBetween(double x, double min, double max){
        return x >= min && x <= max;
    }
    private double getLeft(){
        return upperLeft.getX();
    }
    private double getRight(){
        return lowerRight.getX();
    }
    private double getTop(){
        return upperLeft.getY();
    }
    private double getBottom(){
        return lowerRight.getY();
    }

    public boolean isOverlap(Rectangle r){
        return (isBetween(this.getLeft(), r.getLeft(),r.getRight()) && isBetween(this.getTop(), r.getTop(),r.getBottom()))||
                (isBetween(r.getLeft(), this.getLeft(),this.getRight()) && isBetween(this.getTop(),r.getTop(),r.getBottom()));
    }

    public Rectangle getOverlap(Rectangle r){
        Rectangle result = null;

        if (this.isOverlap(r)) {
            Point tl = new Point(Math.max(this.upperLeft.getX(), r.upperLeft.getX()), Math.max(this.upperLeft.getY(), r.upperLeft.getY()));
            Point lr = new Point(Math.min(this.lowerRight.getX(), r.lowerRight.getX()), Math.min(this.lowerRight.getY(), r.lowerRight.getY()));
            result = new Rectangle(tl, lr);
        }
        return result;
    }

    public void display(){
        System.out.println("Rectangle: ");
        System.out.print("\t");
        upperLeft.display();
        System.out.print("\t");
        lowerRight.display();

    }
@Override
    public String toString() {
    return "Rectangle{" +
            "upperLeft=" + upperLeft +
            ", lowerRight=" + lowerRight +
            '}';
    }

    public double getArea(){
        return getWidth() * getHeight();
    }
    public double getPerimeter(){
        return getWidth()* 2 + getHeight()*2;
    }

}
