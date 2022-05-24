/* Controlling the Sprite Lab 
   
   There are two versions of this lab:
   1) Friendly Version. More helper code is provided in lab template.
   2) More Challenging Version. Less helper code is provided.
   
   This is the friendly version.
   For more detail, see the tutorial: https://youtu.be/OAjyunGPW_s
   
   Complete the code as indicated by the comments.
   Do the following:
   1) Implement keyPressed and keyReleased below to control the Sprite
      In the video, I used the variable "keyCode" and the arrow keys(UP,DOWN,LEFT,RIGHT).
      In this lab, use the variable "key" and characters 'a', 's', 'd' and 'w' to move
      the character. 
*/

final static float MOVE_SPEED = 5; 

//declare global variables
Sprite s1;


//initialize them in setup().
void setup(){
  size(800, 600); 
  imageMode(CENTER); 
  // width = 800, height = 600 (reserved variables for window dimensions)
  s1 = new Sprite("player.png", 1.0, width/2, height/2);

}

// modify and update them in draw().
void draw(){
  background(255);
  s1.display();
  s1.update();
  
} 

void keyPressed(){
// move character using 'a', 's', 'd', 'w'. Also use MOVE_SPEED above.
  if(key == 'a'){
    s1.change_x = -MOVE_SPEED; 
  }
  if(key == 'd'){
    s1.change_x = MOVE_SPEED; 
  }
  if(key == 's'){
    s1.change_y = MOVE_SPEED; 
  }
  if(key == 'w'){
    s1.change_y = -MOVE_SPEED; 
  }
}

void keyReleased(){
// if key is released, set change_x, change_y back to 0
  if(key == 'a' || key == 'd'){
    s1.change_x = 0; 
  }
  if(key == 's' || key == 'w'){
    s1.change_y = 0; 
  }
}
