class DiceGame{
    public static void main(String[] args){
	int a=(int)(Math.random()*6)+1;
	int b=(int)(Math.random()*6)+1;
	int c=a+b;
	System.out.println("Rolling dice...");
	System.out.println("Die 1: "+a);
	System.out.println("Die 2: "+b);
	System.out.println("Total value: "+c);
	if(c>7){
	    System.out.println("You won!");
	}else{
	    System.out.println("You lost.");
	}
    }
}
