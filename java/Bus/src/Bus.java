
public class Bus {
	
	
	String color,number,route,busType;
	int noOfSeats;
	public String getColr() {
		return color;
	}
	public void setColr(String colr) {
		this.color = colr;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String toString() {
		return "Details are: \n Color:" + color + "\n Number:" + number + "\nroute:"
				+ route + "\nbusType=" + busType + "\nnoOfSeats=" + noOfSeats
				+ "\n";
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	

}
