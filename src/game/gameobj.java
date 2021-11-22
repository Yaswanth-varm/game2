package game;

public abstract class gameobj {
 
	public abstract void draw();
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Player play = new Play();
             play.someMethod();
               
             gameobj menu = new Menu();
             gameobj [] gameobj = new gameobj[2];
             gameobj [0] = play;
             gameobj [1] = menu;
              for(gameobj obj : gameobj) {
            	  
            	  obj.draw();
            	  
              }
              
             
              
	}

}
