import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
class Room {
	int roomId;
	int roomNumber;
	String roomType;
	int roomCapacity;
	String roomAc;
	String roomWifi;
	String roomCabel;
	String roomLaundry;
	boolean availability;
	
	public Room()
	{
		this.roomId=0;
		this.roomNumber=0;
		this.roomType="";
		this.roomCapacity=0;
		this.roomAc="";
		this.roomWifi="";
		this.roomCabel="";
		this.roomLaundry="";
		this.availability=false;
	}
	
	public Room(int roomId, int roomNumber, int roomType, int roomCapacity, String roomAc, String roomWifi, String roomCabel, String roomLaundry) {
		this.roomId=roomId;
		this.roomNumber=roomNumber;
		switch(roomType) {
			case 1: this.roomType="Normal"; break;
			case 2: this.roomType="Delux"; break;
			case 3: this.roomType="Super Delux"; break;
			default: this.roomType="";
		}
		this.roomCapacity=roomCapacity;
		this.roomAc=roomAc;
		this.roomWifi=roomWifi;
		this.roomCabel=roomCabel;
		this.roomLaundry=roomLaundry;
		this.availability=true;
	}
}
class Hotel {
	int hotelId;
	String name;
	String address;
	ArrayList<Room> roomList = new ArrayList<Room>();
	
	public Hotel() {
		hotelId=0;
		name="";
		address="";
	}
	
	public Hotel(String name, int hotelId, String address) {
		this.hotelId=hotelId;
		this.name=name;
		this.address=address;
	}
	
	public void addRoom(Room room)
	{
		roomList.add(room);
	}
	
	public void display()
	{
		System.out.println("The rooms Details in " + name + " :");
		System.out.println("Hotel Name:" + name + ".");
		System.out.println("Hotel ID:" + hotelId + ".");
		System.out.println("Hotel Address:" + address + ".\n");
		
		System.out.println("\nRoom Details:");
		
		for(Room room : roomList) {
			String services = "";
			System.out.println("\n\nRoom Number :" + room.roomNumber);
			System.out.println("Room Type :" + room.roomType);
			System.out.print("Services Available:");
			services += (room.roomAc.equalsIgnoreCase("true")) ? "\nAC" : "";
			services += (room.roomWifi.equalsIgnoreCase("true")) ? "\nWi-Fi" : "";
			services += (room.roomCabel.equalsIgnoreCase("true")) ? "\nCable Connection" : "";
			services += (room.roomLaundry.equalsIgnoreCase("true")) ? "\nLaundry" : "";
			System.out.println(services);
		}
	}
}
class Customer {
	
	static int id=0;
	int custID;
	String fName;
	String lName;
	String contactNumber;
	String eMail;
	String proofType;
	String proofId;
	
	public Customer(){
		
	}
	
	public Customer(int custID, String fName, String lName,
			String contactNumber, String eMail, String proofType, String proofId) {
		this.custID = custID;
		this.fName = fName;
		this.lName = lName;
		this.contactNumber = contactNumber;
		this.eMail = eMail;
		this.proofType = proofType;
		this.proofId = proofId;
	}

	public void registerCustomer(String fName, String lName, String contactNumber, String eMail, String proofType, String proofId) {
		this.fName=fName;
		this.lName=lName;
		this.contactNumber=contactNumber;
		this.eMail=eMail;
		this.proofType=proofType;
		this.proofId=proofId;
		this.custID=++id;
	}
	
	public void display() {
		if(id>1)
			System.out.println("\n");
		System.out.println("The customer details are as follows");
		System.out.println("The customer details are:");
		System.out.println("First Name : " + fName);
		System.out.println("Last Name : " + lName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("E-Mail : " + eMail);
		System.out.println("Proof Type : " + proofType);
		System.out.println("Proof ID : " + proofId);
		System.out.println("\n");
	}
	
	public void updateEmail(String eMail) {
		this.eMail=eMail;
		System.out.println("Email updated.");
	}
}
public class Main {
	
	static ArrayList<Reservation> reservationList = new ArrayList<Reservation>();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Hotel details:");
		System.out.println("Enter the Hotel Name:");
		String hotelName = reader.readLine();
		System.out.println("Enter the Hotel ID:");
		int hotelId = Integer.parseInt(reader.readLine());
		System.out.println("Enter the Hotel Address");
		String hotelAddress = reader.readLine();
		
		Hotel hotel = new Hotel(hotelName, hotelId, hotelAddress);
		
		while(true) {
			
			System.out.println("Enter the Room Details:");
			System.out.println("Enter the Room Id:");
			int roomId = Integer.parseInt(reader.readLine());
			System.out.println("Enter the Room Number:");
			int roomNumber = Integer.parseInt(reader.readLine());
			System.out.println("Enter the Room Type:\n1)Normal\n2)Delux\n3)Super Delux");
			int roomType = Integer.parseInt(reader.readLine());
			System.out.println("Enter the Room Capacity:(1/2/3/4)");
			int roomCapacity = Integer.parseInt(reader.readLine());
			System.out.println("AC Service (true/false):");
			String ac = reader.readLine();
			System.out.println("Wi-Fi Service (true/false):");
			String wifi = reader.readLine();
			System.out.println("Cable Service (true/false):");
			String cable = reader.readLine();
			System.out.println("Laundry Service (true/false):");
			String laundry = reader.readLine();
			
			Room tempRoom = new Room(roomId, roomNumber, roomType, roomCapacity, ac, wifi, cable, laundry);
			hotel.addRoom(tempRoom);
			
			System.out.println("Do you want to add Another Room (yes/no):");
			if (reader.readLine().equalsIgnoreCase("no")) break;
		}
		
		System.out.println("Thank you for booking !!");
		hotel.display();
		
		while(true) {
			System.out.println("Reservation\n\n");
			System.out.println("Customer Registration:\n\n");
			
			System.out.println("Enter the customer details:");
			System.out.println("Enter the first name:");
			String fName=reader.readLine();
			System.out.println("Enter the last name:");
			String lName=reader.readLine();
			System.out.println("Enter the contact number:");
			String contactNumber=reader.readLine();
			System.out.println("Enter the e-mail id:");
			String eMail=reader.readLine();
			System.out.println("Enter the proof type:");
			String proofType=reader.readLine();
			System.out.println("Enter the proof id:");
			String proofId=reader.readLine();
			
			Customer customer = new Customer();
			customer.registerCustomer(fName, lName, contactNumber, eMail, proofType, proofId);
			customer.display();
			
			while(true) {
				System.out.println("Enter the room requirements:");
				System.out.println("Enter the Room Type:\n1)Normal\n2)Delux\n3)Super Delux");
				int roomType = Integer.parseInt(reader.readLine());
				String roomTypeString;
				switch(roomType) {
					case 1: roomTypeString="Normal"; break;
					case 2: roomTypeString="Delux"; break;
					case 3: roomTypeString="Super Delux"; break;
					default: roomTypeString="";
				}
				System.out.println("Enter the Room Capacity:(1/2/3/4)");
				int roomCapacity = Integer.parseInt(reader.readLine());
				System.out.println("AC Service (true/false):");
				String ac = reader.readLine();
				System.out.println("Wi-Fi Service (true/false):");
				String wifi = reader.readLine();
				System.out.println("Cable Service (true/false):");
				String cable = reader.readLine();
				System.out.println("Laundry Service (true/false):");
				String laundry = reader.readLine();
				
				Room room = null;
				
				for(Room tempRoom : hotel.roomList) {
					if(tempRoom.roomType.equals(roomTypeString) && tempRoom.roomCapacity<=roomCapacity && tempRoom.roomAc.equals(ac) && tempRoom.roomWifi.equals(wifi) && tempRoom.roomCabel.equals(cable) && tempRoom.roomLaundry.equals(laundry) && tempRoom.availability) {
						room = tempRoom;
						room.availability=false;
						break;
					}
				}
				
				if(room != null) {
					System.out.println("Please take room number " + room.roomNumber);
					System.out.println("\n\nEnter the Booking date"); 
					String bookingDate = reader.readLine();
					System.out.println("Enter the check-in date"); 
					String checkInDate = reader.readLine();
					System.out.println("Enter the check-out date"); 
					String checkOutDate = reader.readLine();
					reservationList.add(new Reservation(customer, room, bookingDate, checkInDate, checkOutDate));
					break;
				}
				else {
					System.out.println("No rooms of specified requirements\nPlease re-enter\n\n\n\n");
				}
			}
			
			System.out.println("Do you want to perform another reservation?(y/n)");
			String ch = reader.readLine();
			if (ch.charAt(0)=='n') break;
		}
		
		System.out.println("The reservation details are as follows:\n\n");
		for(Reservation reservation : reservationList) {
			System.out.println(reservation.customer.fName + " - " + reservation.room.roomNumber + " - " + reservation.bookingDate + " - " + reservation.checkInDate + " - " + reservation.checkOutDate);
		}
	}
}
class Reservation {
	Customer customer;
	Room room;
	String bookingDate;
	String checkInDate;
	String checkOutDate;
	
	public Reservation() {
		this.customer=null;
		this.room=null;
		this.bookingDate="";
		this.checkInDate="";
		this.checkOutDate="";
	}
	
	public Reservation(Customer customer, Room room, String bookingDate, String checkInDate, String checkOutDate) {
		this.customer=customer;
		this.room=room;
		this.bookingDate=bookingDate;
		this.checkInDate=checkInDate;
		this.checkOutDate=checkOutDate;
	}
	
	
}

