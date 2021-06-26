
public class Contact {
	private String name;
	private String phoneNum;
	private String email;
	private String address;
	private String birthday;
	private String group;
	
	public Contact() {

	}

	public Contact(String name, String phoneNum, String email, String address, String birthday, String group) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	
	
	
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNum=" + phoneNum + ", email=" + email + ", address=" + address
				+ ", birthday=" + birthday + ", group=" + group + "]";
	}

	public void ShowInfo() {
		Contact contact = new Contact();
		contact.toString();
	}
	
}
