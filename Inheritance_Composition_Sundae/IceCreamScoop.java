//IceCreamScoop.java

import java.awt.*;
import java.applet.*;

public class IceCreamScoop  // The IceCreamScoop Class
{
   private int x1;
   private ChocolateChipIceCreamScoop chipScoop1;
   
   public IceCreamScoop()  //Empty Constructor
   {
   }
   
   public IceCreamScoop(Graphics g, int xPosScoop, int yPosScoop, int ScoopSize)  //IceCreamScoop Constructor with Parameters
   {   
      drawIceCreamScoop(g,xPosScoop,yPosScoop,ScoopSize);
      x1 = xPosScoop;
   }

   //Ice Cream
   public void drawIceCreamScoop(Graphics g, int xPosScoop, int yPosScoop, int ScoopSize)  //draws the Ice Cream Scoop
   {
      g.setColor(Color.WHITE);  //Set the color as white
      g.fillOval(xPosScoop,yPosScoop,ScoopSize,ScoopSize);
      
      chipScoop1 = new ChocolateChipIceCreamScoop(g,xPosScoop);  //has chocolate chips
   }
}
