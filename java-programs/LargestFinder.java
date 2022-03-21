class LargestFinder{

	public static void main(String []args){
		int a,b,c;
		a=10;
		b= 5;
		c=18;
		if(a>b){
			if(a>c){
				System.out.println(a);
			}
			else{
				System.out.println(c);
			}
		}
		else if(b>c){
			System.out.println(b);
		}
		else{
			System.out.println(c);
		}
	}
}
	
	