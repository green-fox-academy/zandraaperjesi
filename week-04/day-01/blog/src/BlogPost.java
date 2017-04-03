public class BlogPost {
  public String authorName;
  public String title;
  public String text;
  public String publicationDate;

  public void print() {
    System.out.println(this.title);
    System.out.println();
    System.out.println(this.text);
    System.out.println();
    System.out.println(this.publicationDate);
    System.out.println(this.authorName);
  }
}