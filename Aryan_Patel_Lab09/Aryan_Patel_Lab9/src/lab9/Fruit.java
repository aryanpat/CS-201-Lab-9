package lab9;

public class Fruit {
	
	public String shape;
	public String taste;
	
	public Fruit(String shape, String taste) {
		
	        this.shape = shape;
	        this.taste = taste;
	        
	}
	
	public void eat(){
	        
		System.out.println("Fruit is yummy!");
	    
	}
	    
	public String getShape() {
	        
	       return shape;
	    
	}
	    
	public String getTaste() {
	        
		return taste;
	    
	}
	    
	public void setShape(String newshape) {
	        
		shape = newshape;
	    
	}
	    
	public void setTaste(String newtaste) {
	        
		taste = newtaste;
	    
	}
	    
	public boolean equals(Object anotherFruit) {
	        
		return true;
	    
	}
	
	
}
	
