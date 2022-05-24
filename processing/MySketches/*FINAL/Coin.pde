// Implement this class. You just need to implement the constructor
// the three inherited methods from AnimatedSprite will work as is.

public class Coin extends ASprite{
  // call super appropriately
  // initialize standNeutral PImage array only since
  // we only have four coins and coins do not move.
  // set currentImages to point to standNeutral array(this class only cycles
  // through standNeutral for animation).
  public Coin(PImage img, float scale){
    super(img, scale);
    standNeutral = new PImage[6];
    standNeutral[0] = loadImage("gold1.png");
        standNeutral[1] = loadImage("gold2.png");
    standNeutral[2] = loadImage("gold3.png");
    standNeutral[3] = loadImage("gold4.png");
    standNeutral[4] = loadImage("gold3-modified.png");
        standNeutral[5] = loadImage("gold2-modified.png");

    currentImages = standNeutral;


  }
  
}
