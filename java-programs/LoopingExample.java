class LoopingExample{
	public static void main(String []args){
		
		/*
		// while loop
		
		int num=100;
		while(num<=10){
			System.out.println(num);
			num++;
		}
		*/		

		/*
		// do-while loop
		int num = 100;
		do{
			System.out.println(num);
			num++;
		}while(num<=10);
		*/

		// for loop

		for(int num=100; ; num++){
			System.out.println(num);
			if(num>=10){
				break;
			}
		}

	}
}