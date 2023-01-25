package lab9;

public class Apple extends Fruit {
	
    public String color;
    
    public Apple(String shape, String taste, String color) {
        
    	super(shape, taste);
        color = color;
        
    }
    
    public void eat() {
    	
        System.out.println("Apples Are Yummy!");
        
    }
    
    
    public void intro() {
    	
        System.out.println("Apple is " + shape + " it tastes " + taste + "!");
        
    }
    
    public String getColor() {
    	
    	return color;
    	
    }
    
    public void setColor(String newColor) {
    	
    	color = newColor;
    	
    }
    

    public String toString() {
        
    	return ("Apple's shape is " + shape + ", its color is " + color + ", and its taste is " + taste + "!");
    	
    }
    
}
