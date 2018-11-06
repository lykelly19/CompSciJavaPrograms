//SundaeWithCherry.java

import java.awt.*;
import java.applet.*;

class SundaeWithCherry extends Sundae    //A sundae with a cherry is-a sundae
{
   private Cherry cherry1;

   public SundaeWithCherry(Graphics g, int xPosScoop, int yPosScoop, int ScoopSize, int CherrySize)  //constructor
   {
      super(g,xPosScoop,yPosScoop,ScoopSize);  //pass parameters to superclass Sundae
      drawCherry(g,xPosScoop,yPosScoop,ScoopSize,CherrySize);
   }

   public void drawCherry(Graphics g, int xPosScoop, int yPosScoop, int ScoopSize, int CherrySize)  //A sundae with a cherry has-a cherry
   {
      cherry1 = new Cherry(g,xPosScoop,yPosScoop,ScoopSize,CherrySize);
   }
}

