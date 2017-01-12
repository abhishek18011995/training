  public class User {
    
	//fill the code
	  String name,username,password,email,phonenumber;
	  public User(String name, String username, String password, String email,
			String phonenumber) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phonenumber = phonenumber;
	}

	
	public void displayDetails()
	{
		//fill the code
	
		System.out.println("Name : "+this.name);
		System.out.println("Username :"+this.username);
		System.out.println(this.password);
		System.out.println(this.email);
		System.out.println(this.phonenumber);
	}

}


