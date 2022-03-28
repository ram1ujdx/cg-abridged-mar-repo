class StringMethods{
	public static void main(String []args){
		
		String str1 = new String("hello");
		String str2 = "   hello      ";

		boolean output;

		output = str1.equalsIgnoreCase(str2);

		System.out.println(str1.length());
		
		// Changing cases
		
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());

		// How get the character at a specified position?

		char ch = str1.charAt(1);
		System.out.println(ch);

		// How to get the position of any char

		int position = str1.indexOf("x");

		System.out.println(position);

		// How to compare two strings

		// "B">"A"
		// "a">"A"

		System.out.println(str1.compareTo(str2));

		System.out.println(str2.trim().length());
		
	}
}