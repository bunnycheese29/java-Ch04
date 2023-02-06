/**
 * Circle
 */
public class Circle {

  //속성
  public int radius;
  public String name;
  public int width;

  //여러개 만들 수 있다 - 오버로딩
  //생성자에는 type을 붙이지 않는다.
  //반드시 만들어야 하고 안 만들면 기본 생성자가 만들어져서 삽입 된다.
  //함수 (생성자 함수 - 초기화 시키고 싶을 때 사용함 / 클래스 이름이랑 같음) new 를 생성하는 동시에 실행 시키고 싶을 때
  public Circle() {
    System.out.println("나는 Circle");
  }

  public Circle(int _radius) {
    radius = _radius;
  }

  public Circle(String _name, int _radius) {
    name = _name;
    radius = _radius;
  }

  //메서드
  public double getArea() {
    return 3.14 * radius * radius;
  }
}
