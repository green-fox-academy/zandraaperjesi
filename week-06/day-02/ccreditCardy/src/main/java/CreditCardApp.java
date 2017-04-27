import com.greenfox.bx.*;

import java.util.ArrayList;
import java.util.List;

public class CreditCardApp{

  public static void main(String[] args) {
    List<CreditCard> cards = new ArrayList<>();
    String name = "ABC";

    for (int i = 0; i < 10; i++) {
      String nameBuffer = name + Integer.toString(i);
      cards.add(new CreditCard(nameBuffer));
    }

    for(CreditCard card : cards) {
      System.out.println(card.toString());
    }

  }
}