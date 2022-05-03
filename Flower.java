
public class Flower {
	
	private char[]fleurShape;
	private int rowFlower;
	private int columnFlower;
	private int counterF;
	
	private char shape;

	Flower (KWField pitch) {
	
	    fleurShape = new char [3];
	    
		fleurShape[0]= 'I';
		fleurShape[1]= '+';
		fleurShape[2]= '*';
	
		rowFlower = 7;
	    columnFlower = 2;
		counterF = 1;
		pitch.getFieldArr()[rowFlower][columnFlower]= fleurShape[counterF];
	}
	

	public void blossum (KWField pitch) {
			if (counterF  == 0) {counterF  = 1; }
			else if (counterF  == 1) {counterF  = 2; }
			else if (counterF  == 2){counterF  = 0;}

			else { System.out.println("So blüht die Blume nicht auf.. ");}
			
			pitch.getFieldArr()[rowFlower][columnFlower]= fleurShape[counterF];
			pitch.printField();
		}
		
	
	public char[] getFleurShape() {
		return fleurShape;
	}

	public void setFleurShape(char[]fleurShape) {
		this.fleurShape = fleurShape;
	}

	public int getRowFlower() {
		return rowFlower;
	}

	public void setRowFlower(int rowFlower) {
		this.rowFlower = rowFlower;
	}

	public int getColumnFlower() {
		return columnFlower;
	}

	public void setColumnFlower(int columnFlower) {
		this.columnFlower = columnFlower;
	}

	public int getCounterF() {
		return counterF;
	}

	public void setCounterF(int counterF) {
		this.counterF = counterF;
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		this.shape = shape;
	}

}	