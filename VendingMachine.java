import java.util.*;
public class VendingMachine 
{
	 static Scanner sc;
	 static {
		sc = new Scanner(System.in);
	 }

	// checkCoin(-) method
	 public static boolean checkCoin(int coin){
		 if(coin == 1 || coin == 5 || coin == 10 || coin ==0)
			 return true;
		 else
			 return false;
	 }// end checkCoin(-) method
	

	// getProductList(-) method
	public static void getProductList(int amount) {
		String status;
		int productOption=0;
		System.out.println("Choose product to press 1 Biscutt 2 water & 3 Energy Bar");
		productOption = sc.nextInt();
		if(productOption == 1){
			if(amount == 25){
				System.out.println("Please Take your Biscutt product Thank you for purchesing");
				VendingMachine.repetedCode();
			}
			else if(amount > 25){
				VendingMachine.purchesProduct(amount,25);
			}
			else {
				System.out.println("Insufficant Fund Please insert a coin");
				System.out.println("Please take your money of"+amount+" Rupes  Thank You Visiting");
				VendingMachine.repetedCode();

			}
		
		}
		else if(productOption == 2){
			if(amount == 18){
				System.out.println("Please Take your Water product Thank you for purchesing");
				VendingMachine.repetedCode();
			}
			else if(amount > 18){
				VendingMachine.purchesProduct(amount,18);
			}
			else {
				System.out.println("Insufficant Fund Please insert a coin");
				System.out.println("Please take your money of "+amount+" Rupes  Thank You Visiting");
				VendingMachine.repetedCode();
			}
		
		}
		else if(productOption == 3){
		if(amount == 45){
				System.out.println("Please Take your Energy Bar product Thank you for purchesing");
				VendingMachine.repetedCode();
			}
			else if(amount > 45){
				VendingMachine.purchesProduct(amount,45);
			}
			else {
				System.out.println("Insufficant Fund Please insert a coin");
				System.out.println("Please take your money of "+amount+" Rupes Thank You Visiting");
				VendingMachine.repetedCode();
			}	
		}
		else {
			System.out.println("Please select Option only i for Biscut, 2 for Water & 3 for Energy Bar");
			//VendingMachine.insertCoin();
		}

	}// end getProductList(-) method
	

	// purchesProduct(-,-) method
	public static void purchesProduct(int amount, int productPrice){
		String status;
		int returnAmmount = amount - productPrice;
		System.out.println("Please Take your product & your money return is :"+returnAmmount);
		System.out.println("Thank you for purchesing product");
		VendingMachine.repetedCode();
	}// end purchesProduct(-,-) method
	
	// repetedCode() method
	public static void repetedCode(){
		String status;
		System.out.println();
		System.out.println();
		System.out.println("You want to more product [yes/no]");
		status = sc.next();
		if(status.equals("yes"))
			VendingMachine.insertCoin();	
		else if(status.equals("no"))
			System.exit(0);
	}// end repetedCode() method

	// insertCoin() method
	public static void insertCoin(){
		Integer [] arr = new Integer[10];
		//ArrayList al = new ArrayList();
		int coin = 0;
		boolean flag;
		int amount = 0;
		System.out.println("Insert a coin to purchese product");
		for(int i = 0;i<=arr.length;i++){
			coin = sc.nextInt();
			flag = VendingMachine.checkCoin(coin);
			if(!flag){
				System.out.println("Please drop coin only 1,5,10 rupees only");
			}
			else if(coin == 0){
				break;
			}
			else {
				//arr = new Integer[i];
				//al.add(coin);
				amount = amount+coin;
				System.out.println("Your Total Amount is :"+amount+" or Stop insert coin press 0");

			}
		}
		VendingMachine.getProductList(amount);
	} // end insertCoin() method

	// main() method
	public static void main(String[] args) 
	{
		// call insertCoin() method to insert coin
		VendingMachine.insertCoin();

	}//end  main() method
} // end class
