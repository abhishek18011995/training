public class Seller extends User 
{
		//fill the code
	String description;
	public Seller(String name, String username, String password,
				String email, String phonenumber, String description,
				Double rating) {
			super(name, username, password, email, phonenumber);
			this.description = description;
			this.rating = rating;
		}

	Double rating;
		
		public void displayDetails()
		{
			
			//fill the code
		
			System.out.println(this.description);
			System.out.println(String.format("Rating %.2f",this.rating));
			

		}
}

