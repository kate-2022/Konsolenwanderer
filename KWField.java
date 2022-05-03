
public class KWField {

		
		// Zweidimensionaler Array!!!!!!! Hendrik..
		
		private char [][] fieldArr;
		
		KWField(){
			fieldArr = new char [10][10];
		}
		
		 // Getter/Setter
		
		public char[][] getFieldArr() {
			return fieldArr;
		}

		public void setFieldArr(char[][] fieldArr) {
			this.fieldArr = fieldArr;
		}

		// Visualisierung, Print on console (Hendrik)
		
		public void printField() {
		
          for (int i=0; i< fieldArr.length; i++) {		
			for (int j=0; j< fieldArr[i].length; j++) {		
			System.out.print(fieldArr[i][j]);
			}
			
			System.out.println();
		
		}
		}
          // Spielfeld erstellen, natürlich von Hendrik!
          
	public void buildField () {
					
         // links und rechts Abgrenzung mit # Stein (Hendrik!)
		 
		    for (int i=0; i< fieldArr.length;i++) {
		    	fieldArr[i][0] = '#';
		    	fieldArr[i][9] = '#';
		    	for(int t=1; t< (fieldArr.length-1); t++) {
		    		fieldArr[i][t] = ' ';
		    	}
		    }
	
  // Begrenzung oben (Hendrik!)
		    
		    for(int i = 0; i < fieldArr[0].length; i++)
		    	if (i>0 && i<(fieldArr[0].length-1)) {
		    		fieldArr[0][i] = '#';
		    	}
	
		   
// Begrenzung unten (Hendrik!)
		    
		    for(int i = 0; i < fieldArr[9].length; i++)
		    	if (i>0 && i<(fieldArr[9].length-1)) {
		    		fieldArr[9][i] = '#';
		    	}
		}	
	
}
		

	
    
    

