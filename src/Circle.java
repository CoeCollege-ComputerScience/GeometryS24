public class Circle {
    private double radius;
    private Point center;

    public Circle() {
        this.radius = 0;
        this.center = new Point();
    }

    public Circle(double radius) {
        setRadius(radius);
        this.center = new Point();
    }

    public Circle(double radius, Point center) {
        setRadius(radius);
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0){
            // Negative radius is not supported
            // The program(mer) using this method did something wrong
            // ... let them decide how to handle their mistake.
            throw new IllegalArgumentException();
        }
        else {
            this.radius = radius;
        }
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }















}
