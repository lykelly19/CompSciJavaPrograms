//Sundae.java

import java.awt.*;
import java.applet.*;

public class Sundae    //The Sundae Class
{
   public Sundae(Graphics g, int xPosScoop, int yPosScoop, int ScoopSize)  //Sundae Constructor
   {
      getIceCreamScoop(g,xPosScoop,yPosScoop,ScoopSize);    
   }
   
   public void getIceCreamScoop(Graphics g, int xPosScoop, int yPosScoop, int ScoopSize)  //A Sundae has-a ice cream scoop
   {
      IceCreamScoop scoop1 = new IceCreamScoop(g,xPosScoop,yPosScoop,ScoopSize);
   }
}
