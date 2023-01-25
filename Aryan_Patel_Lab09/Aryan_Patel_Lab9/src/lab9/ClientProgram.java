package lab9;

public class ClientProgram {

	public static void main(String[] args) {
		
		Fruit kiwi = new Fruit("round", "sweet");
        Fruit watermelon = new Fruit("round", "sweet");
        
        kiwi.eat();
        watermelon.eat();
        
        System.out.println("The two Fruits being equal is: " + kiwi.equals(watermelon) + "!");
        
        Apple apple = new Apple("round", "sweet", "red");
        
        apple.intro();
        apple.eat();
        apple.toString();
        
        Lemon lemon = new Lemon("round", "yellow", "sour");
        
        lemon.Advantage();
        lemon.Advantage("yellow");
		
	}

}
