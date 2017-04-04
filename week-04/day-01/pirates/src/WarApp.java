public class WarApp {
  public static void main(String[] args) {
    Armada arma1 = new Armada();
    Armada arma2 = new Armada();

    Ship ship1 = new Ship();
    ship1.fillShip();
    Ship ship2 = new Ship();
    ship2.fillShip();
    Ship ship3 = new Ship();
    ship3.fillShip();
    Ship ship4 = new Ship();
    ship4.fillShip();
    Ship ship5 = new Ship();
    ship5.fillShip();
    Ship ship6 = new Ship();
    ship6.fillShip();
    Ship ship7 = new Ship();
    ship7.fillShip();
    Ship ship8 = new Ship();
    ship8.fillShip();

    arma1.ships.add(ship1);
    arma1.ships.add(ship3);
    arma1.ships.add(ship7);
    arma1.ships.add(ship6);
    arma2.ships.add(ship2);
    arma2.ships.add(ship8);
    arma2.ships.add(ship5);
    arma2.ships.add(ship4);

    arma1.war(arma2);
  }
}
