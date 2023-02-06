public class Rectangle {

  //속성
  public String name;
  public int width;
  public int height;

  //초기화, 생성자 함수
  public Rectangle() {
    width = 1;
    height = 1;
  }

  //메서드
  public double getArea() {
    return width * height;
  }

  public int getBound() {
    return width * 2 + height * 2;
  }
}
