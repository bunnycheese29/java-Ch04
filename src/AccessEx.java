import practice.Tv;

/**
 * InnerAccessEx
 */
//클래스 새로 만들거면 public을 지워줘야함
class InnerAccessEx {

  public int a;
  private int b;
  int c; //지정 안 해도 같은 패키지 안에 있으니까 접근 가능

  //기본 생성자 자동 생성됨
  public InnerAccessEx() {}
}

public class AccessEx {

  public static void main(String[] args) {
    InnerAccessEx test = new InnerAccessEx();
    test.a = 10;
    test.c = 20;
  }

  private void aa() {
    System.out.println("aa를 출력합니다.");
  }
}
