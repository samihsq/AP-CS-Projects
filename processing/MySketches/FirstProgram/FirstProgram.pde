//declare global variables.
PImage img;
float center_x, center_y;

//initialize them in setup().
void setup(){
  size(800, 600);
  img = loadImage("data/ball.png");
  center_x = 100;
  center_y = 300;
}

//modify and update them in draw().
void draw(){
  background(255);
  image(img, center_x, center_y);
  center_x += 5;
}
