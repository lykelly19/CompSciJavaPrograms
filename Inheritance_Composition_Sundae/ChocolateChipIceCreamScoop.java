// ChocolateChipIceCreamScoop.java

import java.awt.*;
import java.applet.*;

public class ChocolateChipIceCreamScoop extends IceCreamScoop   //A Chocolate Chip Ice Cream Scoop is-a Ice Cream Scoop
{
   private ChocolateChips chocolatechips1;

   public ChocolateChipIceCreamScoop(Graphics g, int xPosScoop)
   {
      ChocolateChips chocolatechips1 = new ChocolateChips(g,xPosScoop);
   }
}
