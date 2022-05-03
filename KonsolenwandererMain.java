
import java.util.Scanner;

   import java.lang.Object;
      import java.util.regex.Pattern;
     
public class KonsolenwandererMain {
	
	public static void main(String[] args) {
	
		int temp = 0;
	
		KWField pitch = new KWField();
		
		pitch.buildField();
		//pitch.printField();
	
		Player player1 = new Player(pitch);
		pitch.printField();
		
		// player1.rotateRight(pitch);
		// player1.rotateRight(pitch);
		
		// player1.rotateLeft(pitch);
	
		// player1.goForward(pitch);
		
		 Flower fleur1 = new Flower (pitch);
	     fleur1.getFleurShape();
	    // fleur1.blossum (pitch);
		
		String choice = "hi";
		Scanner scan = new Scanner (System.in);
	       
	       while (temp == 0) {
		
	      System.out.println("Was moechten Sie tun? Verfuegbare Aktionen: ");
          System.out.println("g = vorwaerts gehen, l = nach links drehen, r = nach rechts drehen,");
          System.out.println("f = eine Blume zum Blühen bringen, q = beenden ");
		
       choice = scan.next();
 
	   switch (choice) {
	   case "g": player1.goForward(pitch); break;
	   case "l": player1.rotateLeft(pitch); break;
	   case "r": player1.rotateRight(pitch);break;
	   case "f": fleur1.blossum (pitch); break;
	   case "q": temp =1; System.out.println(" Das Spiel ist beendet!"); break;
	   default: System.out.println("Sie haben eine falsche Eingabe gemacht!");
	   }
       }

	    
	              
	} 		
	
}



