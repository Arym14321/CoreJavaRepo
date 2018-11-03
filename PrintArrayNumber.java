import java.util.*;
class PrintArrayNumber 
{
	public static void main(String[] args) 
	{
		int arrayLength = 0;
		int [] arr;
		int value = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of Arra");
		arrayLength = sc.nextInt();
		if(arrayLength != 0){
			arr = new int[arrayLength];
			System.out.println("Enter A Arrya Element");
			for (int i =0;i< arrayLength ; i++ )
			{
				arr[i] = sc.nextInt();
			}
			PrintArrayNumber.printNumber(arr);

		}
		else {
			System.out.println("Array Length should not be 0");
		}

	}

	public static void printNumber(int [] num){
		System.out.println(Arrays.toString(num));
	}
}
