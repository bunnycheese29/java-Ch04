public class Book {

  //속성
  private String title;
  private String author;

  //getter / setter
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  //생성자
  public Book() {
    //객체를 가리키는 this
    title = "제목 미상";
    author = "작가 미상";
  }

  public Book(String title) {
    this.title = title;
    this.author = "작가 미상";
  }

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  //메서드
  public void showInfo() {
    System.out.println("책의 제목은 " + title + ", 저자는 " + author);
  }
}
