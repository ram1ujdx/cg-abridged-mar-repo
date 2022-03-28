class MinFinder{
	public static void main(String []args){
		int []values = {10,5,20,2,78,19,45,34,12};
		int min = values[0];
		for(int num:values){
			if(num<min){
				min=num;
			}
		}
		System.out.println("Min = "+min);
	}
}