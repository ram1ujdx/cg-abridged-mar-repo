import java.util.Scanner;
class ArraysOfString{
	public static void main(String []args){
		
		String []names = new String[5];
		Scanner scan = new Scanner(System.in);
		for(int idx=0; idx<names.length; idx++){
			System.out.print("Enter name : ");
			names[idx]=scan.nextLine();
		}
		
		System.out.println("Entered names are : ");
		for(String name:names){
			System.out.print(name+"\t");
		}
	}
}