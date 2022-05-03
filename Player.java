
public class Player {
	
	private char[]playerSign;
	private int currentRow;
	private int currentColumn;
	private int counter;
	
	Player (KWField pitch){
		
		playerSign = new char[4];
	
		playerSign[0] ='˄';   
		playerSign[1] ='˃'; 
		playerSign[2] ='˅';                
		playerSign[3] ='˂'; 
		currentRow = 3;
		currentColumn = 3;
		counter = 0;
        pitch.getFieldArr()[currentRow][currentColumn]= playerSign[counter];
	 
	}
		
	public void rotateRight (KWField pitch) {
		if (counter  == 0) {counter  = 1; }
		else if (counter  == 1) {counter  = 2; }
		else if (counter  == 2){counter  = 3;}
		else if (counter  == 3) {counter  = 0;}
		
		else { System.out.println("Fehler bei Drehung nach rechts.. ");}
		
		pitch.getFieldArr()[currentRow][currentColumn]= playerSign[counter];
		pitch.printField();
	}
	
	public void rotateLeft(KWField pitch) {
	if (counter  == 0) {counter  = 3; }
	else if (counter  == 1) {counter  = 0; }
	else if (counter  == 2) {counter  = 1;}
	else if (counter  == 3) {counter  = 2;}
	
	else { System.out.println("Fehler bei Drehung nach links.. ");}
	
	pitch.getFieldArr()[currentRow][currentColumn]= playerSign[counter];
	pitch.printField();
	}
		
	public void goForward(KWField pitch) {
		
		pitch.getFieldArr()[currentRow][currentColumn]=' ';
	
		 // geradeaus gehen
			if (counter == 0 && pitch.getFieldArr()[currentRow-1][currentColumn]!= '#' ) {
				pitch.getFieldArr()[currentRow-1][currentColumn]= playerSign [counter];
				currentRow -=1;}			                     
	    	else if (counter == 1 && pitch.getFieldArr()[currentRow][currentColumn+1]!='#') { 
		    	pitch.getFieldArr()[currentRow][currentColumn+1]= playerSign [counter];
			    currentColumn +=1;} 
	        else if (counter == 2 && pitch.getFieldArr()[currentRow+1][currentColumn]!='#'){
	        	pitch.getFieldArr()[currentRow+1][currentColumn]= playerSign [counter];
	        	currentRow +=1;} 
		    else if (counter == 3 && pitch.getFieldArr()[currentRow][currentColumn-1]!='#') { 
		    	pitch.getFieldArr()[currentRow][currentColumn-1]= playerSign [counter];
		    	currentColumn-=1;} 
		    else {System.out.println("Schritt nach vorne nicht möglich!");
		    pitch.getFieldArr()[currentRow][currentColumn]= playerSign [counter];
		    }
			    pitch.printField();
		}	
	
	
	public char[] getPlayerSign() {
		return playerSign;
	}


	public void setPlayerSign(char[] playerSign) {
		this.playerSign = playerSign;
	}


	public int getCurrentRow() {
		return currentRow;
	}


	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}


	public int getCurrentColumn() {
		return currentColumn;
	}


	public void setCurrentColumn(int currentColumn) {
		this.currentColumn = currentColumn;
	}


	public int getCounter() {
		return counter;
	}


	public void setCounter(int counter) {
		this.counter = counter;
	}

	 public int movePlayer() {
	
			
	 return counter;
	
}

}
