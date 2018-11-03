import java.util.*;
public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int elementLength,searchElement,elementArray[],count;
		Scanner sc = new Scanner(System.in);
		// get the array length
		System.out.println("Enter a Element Length");
		elementLength = sc.nextInt();
		System.out.println("element length is :"+elementLength);
		elementArray = new int[elementLength];
		// get one by one array value 
		System.out.println("Enter a Array Value");
		if(elementLength != 0){
			for (int i = 0;i < elementLength; i++ ){
				elementArray[i] = sc.nextInt();
			}
		}
		else
			System.out.println("Length should not be 0");
		// get search element value
		System.out.println(Arrays.toString(elementArray));
		System.out.println("Enter Search element value");
		searchElement = sc.nextInt();
		// call searchValue() method
		count = BinarySearch.searchValue(elementArray,searchElement);
		if(count>=0)
			System.out.println("Got search element at position: "+count);
		else 
			System.out.println("Searching Element is not present ");
	}

	public static int searchValue(int [] array, int searchElement){
		int count = 0;
		for (int i = 0;i < array.length;i++ )
		{
			if(searchElement == array[i])
				count = i;
			else
				count = -1;
		}
		return count;
	}
}
