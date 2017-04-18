package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    this.name = "Electric guitar";
    this.numberOfStrings = 6;
    this.sound = "Twang";
  }

  public ElectricGuitar(int i) {
    this.name = "Electric guitar";
    this.numberOfStrings = i;
    this.sound = "Twang";
  }

  @Override
  public void play() {
    System.out.printf(FORMAT_FOR_PLAY, this.name, this.numberOfStrings, this.sound);
  }
}
