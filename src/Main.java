public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(3,4);
        Point p2 = new Point(0,0);
        Point p3 = new Point(4,3);

//        Circle c = new Circle();
//        try {
//            c.setRadius(-10);
//        }
//        catch(IllegalArgumentException e){
//            System.out.println("Oops");
//            //System.out.println(e.getMessage());
//        }
//
//        p1.display();
//        p2.display();
//        System.out.println(p1.toString());
//        System.out.println(p1);
//        System.out.println(c);
//
//
//        Rectangle r = new Rectangle(p1,p2);
//        System.out.println("r: ");
//        System.out.println(r);
//        r.display();
//        Rectangle r2 = new Rectangle(p1,p3);
//        System.out.println("r2: ");
//        System.out.println(r2);
//        r2.display();
//        Rectangle r3 = r.getOverlap(r2);
//        System.out.println("r3: ");
//        System.out.println(r3);
//        r3.display();

        Square s = new Square(p1, 5);
        System.out.println(s.getArea());
        Rectangle r = new Rectangle(p1, 5,6);
        System.out.println(r.getArea());

        Rectangle r2 = new Square(p1, 3);
        System.out.println(r2.getArea());
    }

}