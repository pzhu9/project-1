package cse360assignment02;

public class main 
{
	   public static void main(String[] args) 
	   {
	       AddingMachine myCalculator = new AddingMachine();
	       myCalculator.add (4);
	       myCalculator.subtract (2);
	       myCalculator.add(5);
	       System.out.println(myCalculator.toString());
	       System.out.println("Total = "+ myCalculator.getTotal() + "\n");
	       myCalculator.clear();
	       System.out.println(myCalculator.toString());
	       System.out.println("Total After Clear = "+ myCalculator.getTotal() + "\n");
	   }
}