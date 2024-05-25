package rentHouseApp.models;

public class house {
	// 一个house对象表示一个房屋，存储该房屋的所有信息
	private int no;
	private String name;
	private String tel;
	private String address;
	private int rent;
	private String status;

	public house(int no, String name, String tel, String address, int rent, String status) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.address = address;
		this.rent = rent;
		this.status = status;
	}

	@Override
	public String toString() {
		return no + 
				"\t\t" + name + 
				"\t\t" + tel + 
				"\t\t" + address + 
				"\t\t" + rent + 
				"\t\t" + status;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
