package main.java.music;

public class Violin extends StringedInstrument{

  public Violin() {
    this.name = "Violin";
    this.numberOfStrings = 4;
    this.sound = "Screech";
  }

  public Violin(int i) {
    this.name = "Violin";
    this.numberOfStrings = i;
    this.sound = "Screech";
  }

  @Override
  public void play() {
    System.out.printf(FORMAT_FOR_PLAY, this.name, this.numberOfStrings, this.sound);
  }
}
