class Printer{

	static String printerType;
	String brand;

	public void print(){
		System.out.println("Type : "+printerType);
		System.out.println("Brand : "+brand);
	}

}

class StaticExample{

	public void main(String []args){
		
		Printer p1 = new Printer();
		Printer.printerType = "InkJet";
		p1.brand = "HP";
		Printer p2 = new Printer();
		p2.brand = "Canon";

		p1.print();
		p2.print();
		

		
	}
}