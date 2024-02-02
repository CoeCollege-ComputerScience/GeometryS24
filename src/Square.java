public class Square extends Rectangle{


    public Square(Point upperLeft, double w) {
        super(upperLeft, w, w);
    }

    public double getArea(){
        System.out.println("Getting Area");
        return getWidth()* getHeight();
    }
}
