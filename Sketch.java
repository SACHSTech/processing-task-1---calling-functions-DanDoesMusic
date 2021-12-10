import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(247, 247, 47);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() 
  {  
    fill (30);
    rect(20, 125 , 70, 350);
    fill (30);
    rect(90, 205 , 190, 400);
    fill (30);
    rect(190, 250 , 70, 350);
    fill(70, 232, 0);
    triangle(280,250,80,250,220,180);
    fill (66, 135, 245);
    rect(0, 325 , 400, 390);
    fill (225);
    ellipse(280, 25 , 80, 50);
    fill (225);
    ellipse(240, 29 , 88, 55);
    fill (225);
    ellipse(250, 32 , 92, 58);    
  }
}