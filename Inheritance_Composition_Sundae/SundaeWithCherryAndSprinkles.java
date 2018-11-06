// SundaeWithCherryAndSprinkles.java

import java.awt.*;
import java.applet.*;

public class SundaeWithCherryAndSprinkles extends SundaeWithCherry  //A Sundae with Cherry and Sprinkles is a Sundae With a Cherry
{
   private Sprinkles sprinkles1;

   public SundaeWithCherryAndSprinkles(Graphics g, int xPosScoop, int yPosScoop, int ScoopSize, int CherrySize)  //constructor
   {  
      super(g,xPosScoop,yPosScoop,ScoopSize,CherrySize);  //Pass parameters to superclass SundaeWithCherry
      sprinkles1 = new Sprinkles(g,xPosScoop);  //has-a cherry
   }
}
