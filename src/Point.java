public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point p){
        return Math.sqrt((Math.pow((x-p.getX()),2)) + Math.pow((y-p.getY()),2));
    }

    public void display(){
        System.out.println("("+x+","+y+")");
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
