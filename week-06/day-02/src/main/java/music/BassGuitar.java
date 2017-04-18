package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    this.name = "Bass guitar";
    this.numberOfStrings = 4;
    this.sound = "Duum-duum-duum";
  }

  public BassGuitar(int i) {
    this.name = "Bass guitar";
    this.numberOfStrings = i;
    this.sound = "Duum-duum-duum";
  }

  @Override
  public void play() {
    System.out.printf(FORMAT_FOR_PLAY, this.name, this.numberOfStrings, this.sound);
  }
}
