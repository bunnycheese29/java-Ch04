public class App {

  public static void main(String[] args) throws Exception {
    Circle circle = new Circle(); //instnace

    Circle circle02 = new Circle(5);
    Circle circle03 = new Circle("ball", 30);

    circle.name = "나만의 원";
    circle.radius = 3;
    circle.width = 10;
    double area = circle.getArea();
    System.out.println(area);
    System.out.println(circle.name);

    Circle hodduk = new Circle();
    Circle pizza = new Circle();
    hodduk.name = "호떡";
    pizza.name = "피자";

    Rectangle rect = new Rectangle();
    rect.name = "네모";
    rect.width = 4;
    rect.height = 10;
    double area02 = rect.getArea();
    int bound = rect.getBound();
    System.out.println(rect.name);
    System.out.println(area02);
    System.out.println(bound);
  }
}
