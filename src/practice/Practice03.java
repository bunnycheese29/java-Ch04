package practice;

public class Practice03 {

  public static void main(String[] args) {
    // Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
    // song.show();
    Song abba = new Song();
    abba.title = "Dancing Queen";
    abba.artist = "ABBA";
    abba.country = "스웨덴";
    abba.year = 1978;
    abba.show();
  }
}
