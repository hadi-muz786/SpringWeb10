package pacck9;

public class HouseRqo {
	private String address;
	private String number;
	private String rooms;
	private String flour;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getRooms() {
		return rooms;
	}

	public void setRooms(String rooms) {
		this.rooms = rooms;
	}

	public String getFlour() {
		return flour;
	}

	public void setFlour(String flour) {
		this.flour = flour;
	}

	@Override
	public String toString() {
		return "HouseRqo [address=" + address + ", number=" + number + ", rooms=" + rooms + ", flour=" + flour + "]";
	}

}
