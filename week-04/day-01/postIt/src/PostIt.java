public class PostIt {
  public String backgroundColor;
  public String textColor;
  public String text;

  public void show() {
    System.out.println(this.backgroundColor + " colored Post-it, with " + this.textColor + "text that reads: " + this.text);
  }
}