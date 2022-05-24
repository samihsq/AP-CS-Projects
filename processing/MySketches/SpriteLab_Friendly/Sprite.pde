/* Complete this Sprite class as indicated by the comments. */

public class Sprite{
  PImage image;
  float center_x, center_y;
  float change_x, change_y;
  float w, h; // width and height of Sprite(note that w and h are used because
              // width and height are reserved variables for window size.)
  
  public Sprite(String filename, float scale, float x, float y){
    // inititalize variables in this constructor.
    image = loadImage(filename);
    w = image.width * scale;
    h = image.height * scale;
    center_x = x;
    center_y = y;
    change_x = 0;
    change_y = 0;
  }
  public Sprite(String filename, float scale){
    // use this() to call the previous constructor.
    image = loadImage(filename);
    w = image.width * scale;
    h = image.height * scale;
    center_x = width/2;
    center_y = height/2;
    change_x = 0;
    change_y = 0;
}
  
  public void display(){
    // use image(image_file, x, y, width_image, height_image) to draw image.
    image(image, center_x, center_y, w, h);
}
  public void update(float cx, float cy){
    // update position by adding velocity.
    center_x += cx;
    center_y += cy;

  }
}
