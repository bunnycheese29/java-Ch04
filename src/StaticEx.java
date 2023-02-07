/**
 * StaticSample
 */
class StaticSample {

  public static int m;
  public int n;

  public void g() {
    System.out.println("나는 static 메서드가 아닙니다.");
  }

  public static void f() {
    System.out.println("나는 static 입니다.");
  }
}

public class StaticEx {

  public static void main(String[] args) {
    StaticSample s1 = new StaticSample();
    s1.g();
    StaticSample.m = 10;
    StaticSample.f();
  }
}
