package BT_1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
//        circle.display();
//        circle.getArea();
//        circle.display();
//        System.out.println("====================================");
//        Circle circle1 = new Circle(5,"blue");
//        circle1.display();
//        circle1.getArea();
//        System.out.println("----------------------------------------------------");
//        circle1.display();
//        circle.display();
        System.out.println(circle);
        circle.getArea();
        System.out.println(circle);
        System.out.println("----------------------------------------------------------------");
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("-------------------------------------------------------------------------------------");
        Cylinder cylinder1 = new Cylinder(3,"black",5);
        System.out.println(cylinder1);
        cylinder1.getArea();
        System.out.println(cylinder1);
        cylinder1.getCylindricalVolume();
        System.out.println(cylinder1);
    }
}
