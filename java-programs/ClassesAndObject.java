class Phone{
	private long imei;
	private int ram;
	private String brand;
	private int storage;
	

	public Phone(){
		System.out.println("Phone object created using Default Constructor..");
	}

	public Phone(long imei, int ram, String brand, int storage){
		System.out.println("Phone object created using parameterized constructor..");
		this.imei = imei;
		this.ram=ram;	
		this.brand=brand;
		this.storage=storage;
		
	}

	public long getImei(){
		return imei;
	}

	public void setImei(long imei){
		this.imei = imei;
	}

	public void call(){
		System.out.println("Making a call..");
	}
	
	public void playMusic(){
		System.out.println("Playing Music..");
	}

	public void showPhoneInfo(){
		System.out.println("IMEI : "+imei);
		System.out.println("Brand : "+brand);
		System.out.println("RAM : "+ram+"GBs");
		System.out.println("Storage : "+storage+"GBs");
	}
	
}

class ClassesAndObject{
	public static void main(String []args){
		
		Phone phone1 = new Phone();
		phone1.setImei(2728278268292901L);
		
		phone1.call();
		phone1.playMusic();
		phone1.showPhoneInfo();

		
		Phone phone2 = new Phone(2728278268226726701L,8,"Samsung",256,6.55);
		phone2.showPhoneInfo();
		
		
	}
}