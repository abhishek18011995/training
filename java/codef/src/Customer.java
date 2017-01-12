public class Customer extends User {

		//fill the code
	private String deliveryAddress,creditDetails;
	private int bonusPoints;
	
		public Customer(String name, String username, String password,
			String email, String phonenumber, String deliveryAddress,
			String creditDetails, int bonusPoints) {
	//public Customer(String deliveryAddress,String creditDetails, int bonusPoints){
		super(name, username, password, email, phonenumber);
		this.deliveryAddress = deliveryAddress;
		this.creditDetails = creditDetails;
		this.bonusPoints = bonusPoints;
	}

		public void displayDetails()
		{
		  	//fill the code
			
			System.out.println("Cred"+this.creditDetails);
			System.out.println(this.deliveryAddress);
			System.out.println(this.bonusPoints);
			
		}
}

