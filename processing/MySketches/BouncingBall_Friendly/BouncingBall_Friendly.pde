/* Bouncing Ball Lab
   There are two versions of this lab:
   1) Friendly Version. More helper code is provided in lab template.
   2) More Challenging Version. Less helper code is provided.
   
   This is the friendly version.
   
   Complete the code as indicated by the comments.
   The ball moves in a diagonal direction and bounces when
   it collides with any of the four sides of the screen.
*/

PImage ball;
float center_x, center_y;
float change_x, change_y;
float radius;

void setup(){
  size(800,600);
  imageMode(CENTER); // position of image is its center
  
  // load ball image "ball.png"
  ball = loadImage("data/ball.png");
  
  // initialize position, velocity and radius of ball.
  center_x = 100;
  center_y = 300;
  change_x = 5;
  change_y = 10;
  radius = 100;
}

void draw(){
  background(255);
  
  // draw image by calling image(image_variable, x, y, width, height)
  
  image(ball, center_x, center_y, radius, radius);

  // update ball by adding its velocity to its position
  center_x += change_x;
  center_y += change_y;

  
  /* if ball passes right side of screen, fix center_x to 
     align the ball exactly at the right side of the screen. 
     Then negate change_x to change direction. 
     
     else if ball passes left side of screen, fix center_x to 
     align the ball exactly at the left side of the screen. 
     Then negate change_x to change direction.
     
     There should be four conditional: 
     if and else if for horizontal direction
     if and else if for vertical direction
     The first conditional is given to you.
  */
  if(center_x >= width - radius){
    center_x = width - radius;
    change_x *= -1;
    
  } else if (center_x <= radius) {
    center_x = radius;
    change_x *= -1;
  }
  
  if(center_y >= height - radius) {
    center_y = height - radius;
    change_y *= -1;
  }
  
  if(center_y <= radius) {
    center_y = radius;
    change_y *= -1;
  }
  // add in code for the else if conditional
  
  
  
  // now add if and else if for vertical direction(center_y, change_y)
    

}
