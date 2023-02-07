package practice;

public class Rectangle {

  private int x;
  private int y;
  private int width;
  private int height;

  public Rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public int square() {
    return width * height;
  }

  public void show() {
    System.out.println(
      "좌표 : " +
      "(" +
      x +
      "," +
      y +
      ")" +
      " 넓이 : " +
      width +
      " 높이 : " +
      height
    );
  }

  public boolean contains(Rectangle r) {
    if (
      (r.x + r.width < this.x + this.width && r.x > this.x) &&
      (r.y + r.width < this.y + this.width && r.y > this.y)
    ) {
      return true;
    } else {
      return false;
    }
  }
}
