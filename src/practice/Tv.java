package practice;

public class Tv {

  //속성
  public String brand;
  public int year;
  public int inch;

  //생성자
  public Tv() {}

  public Tv(String brand, int year, int inch) {
    this.brand = brand;
    this.year = year;
    this.inch = inch;
  }

  //메서드
  public void show() {
    System.out.println(
      brand + "에서 만든 " + year + "년형 " + inch + "인치 TV"
    );
  }
}
