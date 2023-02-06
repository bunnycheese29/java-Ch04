package practice;

public class Song {

  public String title;
  public String artist;
  public int year;
  public String country;

  public Song() {
    title = "제목 미상";
    artist = "가수 미상";
    country = "국적 미상";
  }

  public Song(String title, String artist, int year, String country) {
    this.title = title;
    this.artist = artist;
    this.year = year;
    this.country = country;
  }

  public void show() {
    System.out.println(
      year + "년 " + country + "국적의 " + artist + "가 부른 " + title
    );
  }
}
