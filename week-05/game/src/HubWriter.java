import java.awt.*;
import java.util.List;

public class HubWriter {
  public void writeHub(List<int[]> stringsToPrint, Graphics g) {
    for (int i = 0; i < stringsToPrint.size() - 1; i++) {
      g.drawString("Monster (Level " + stringsToPrint.get(i)[3] + ") HP: " + stringsToPrint.get(i)[0] + " | DP: " + stringsToPrint.get(i)[1] + " | SP: " + stringsToPrint.get(i)[2], 750, 50 + i * 20);
    }
    g.drawString("Hero (Level " + stringsToPrint.get(stringsToPrint.size() - 1)[3] + ") HP: " + stringsToPrint.get(stringsToPrint.size() - 1)[0] + " | DP: " + stringsToPrint.get(stringsToPrint.size() - 1)[1] + " | SP: " + stringsToPrint.get(stringsToPrint.size() - 1)[2], 750, 100);
  }
}
