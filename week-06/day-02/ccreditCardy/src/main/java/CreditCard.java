import com.greenfox.bx.*;

public class CreditCard implements CreditCardy {
  private String cardholder;
  private String code;
  int sumCCV;

  public CreditCard(String name) {
    this.cardholder = name;
    this.code = createNumber();
    this.sumCCV = cumeSumCVV(this.code);
  }

  public int getSumCVV() {
    return this.sumCCV;
  }

  public String getNameCardholder() {
    return this.cardholder;
  }

  public String getCodeAccount() {
    return this.code;
  }

  public int cumeSumCVV(String codeAccount) {
    int toReturn = 0;
    for (int i = 0; i < codeAccount.length(); i++) {
      toReturn += Character.getNumericValue(codeAccount.charAt(i));
    }
    return toReturn;
  }

  public String createNumber() {
    String toReturn = "";
    for (int i = 0; i < 16; i++) {
      toReturn += Integer.toString((int)(Math.random()*10));
    }
    return toReturn;
  }

  @Override
  public String toString() {
    return String.format("Name=%s CC#=%s CVV=%d", this.cardholder, this.code, this.sumCCV);
  }
}
