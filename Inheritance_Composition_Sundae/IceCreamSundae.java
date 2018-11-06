// IceCreamSundae.java
// Main Method
// The Composition/Inheritance Graphics Program
/* Program Description:

   Two Examples of Inheritance:
   1. A Chocolate Chip Ice Cream Scoop is-a Ice Cream Scoop
   2. Multi-Level Inheritance - A Sundae with a Cherry and Sprinkles is-a Sundae With a Cherry
                              - A Sundae with a Cherry is-a sundae
      (The parameters of the Graphics class, Scoop x-position, Scoop y-position, and the Scoop Dimension/Size are passed from the
       subclass to the top superclass: Passed from SundaeWithCherryAndSprinkles to Sundae)
   
   Three Examples of Composition:
   1. A Cherry Sundae With Sprinkles has Sprinkles
   2. A Cherry Sundae has a Cherry
   3. A Chocolate Chip Ice Cream Scoop has Chocolate Chips
*/

import java.awt.*;
import java.applet.*;

public class IceCreamSundae extends Applet
{   
   public void paint(Graphics g)
   {
      //Background
      Background.drawBackground(g);
   
      //Instantiate Sundae
      SundaeWithCherryAndSprinkles s1 = new SundaeWithCherryAndSprinkles(g,400,150,300,80);  //Parameters are graphics, x-value and y-value of ice cream, ice cream scoop dimensions and cherry dimensions
      
      //Call to draw Bowl
      Bowl.drawBowl(g);   
   }
}