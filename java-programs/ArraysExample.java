import java.util.Scanner;
class ArraysExample{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the size of the array : ");
		int size = scan.nextInt();
		int []arr = new int[size];
		System.out.print("Enter the values : ");
		for(int idx=0; idx<arr.length; idx++){
			arr[idx] = scan.nextInt();
		}
		System.out.println("Entered values are : ");
		// Enhanced for loop

		for(int value:arr){
			System.out.print(value+"\t");
		}


	}
}