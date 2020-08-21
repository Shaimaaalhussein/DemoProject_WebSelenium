package testdata;

import java.util.Date;

public class Admin {

	// New Admin Data
//Public for demo now if we need to encapsulate data will create accessories methods
	public String fName;
	public String lName;
	public String email;
	public String password;
	public String mobile;
	public String country;
	public String address;

	private Admin() {
	}

	private Admin(String fName, String lName, String email, String password,
			String mobile, String country, String address) {
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.country = country;
		this.address = address;

	}

	// region Admin builder
	public static Admin buildRootAdmin() {
		String adminUN = "admin@phptravels.com";
		String adminPW = "demoadmin";
		return new Admin(null, null, adminUN, adminPW, null, null, null);
	}

	/**
	 * Build new Admin with default values 
	 * @return
	 */
	public static Admin buildNewAdmin() {
		String fName = "Test";
		String lName = String.valueOf(new Date().getTime());
		String email = fName + "_" + lName + "@test.com";
		String password = "12345678";
		String mobile = "01122332217";
		String country = "Egypt";
		String address = "Address123";
		return new Admin(fName, fName, email, password, mobile, country,
				address);
	}

}
