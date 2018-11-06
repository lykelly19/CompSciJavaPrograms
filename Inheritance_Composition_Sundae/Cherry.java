//Cherry.java
   
import java.awt.*;
import java.applet.*;

public class Cherry   //Cherry Class
{
   public Cherry(Graphics g, int xPosScoop, int yPosScoop, int ScoopSize, int CherrySize)  //constructor
   {
      drawCherry(g,xPosScoop,yPosScoop,ScoopSize,CherrySize);
   }

   public void drawCherry(Graphics g, int xPosScoop, int yPosScoop, int ScoopSize, int CherrySize)  //A sundae with a cherry has-a cherry
   {
      g.setColor(Color.RED);
      g.fillOval((ScoopSize/2)+xPosScoop-(CherrySize/2),yPosScoop-CherrySize+20,CherrySize,CherrySize);
   }
}
