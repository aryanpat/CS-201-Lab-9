package lab9;

public class Lemon extends Fruit {
	
	public String variety = "Avalon";
	public String color;
	
	public Lemon(String variety, String color, String shape) {
		
		super(variety, shape);
		color = color;
		
	}

	public void Advantage() {
		
		System.out.println(variety + " lemon is " + shape + ", it is sour and can be eaten directly. ");
		
	}
	
	public void Advantage(String color) {
		
		System.out.println(variety + " lemon is " + color + " color!");
		
	}
	
	public String getVariety() {
		
		return variety;
	}
	
	public void setVariety(String newVariety) {
		
		variety = newVariety;
		
	}
	
	 public String getColor() {
	    	
	    	return color;
	    	
	    }
	    
	    public void setColor(String newColor) {
	    	
	    	color = newColor;
	    	
	    }
	
	public String toString() {
		
		return ("Lemons variety is " + variety + ", its color is " + color + ", its shape is " + shape + "!");
		
	}
	
	
	
}
