package arquivos;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = -8058879038979362506L;
	String street;
	String country;
	
	public Address() {
		this.street = "";
		this.country = "";
	}

	public Address(String street, String country) {
		this.street = street;
		this.country = country;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreet() {
		return this.street;
	}

	public String getCountry() {
		return this.country;
	}

	@Override
	public String toString() {
		return new StringBuffer("Address[street : ")
			.append(this.street)
			.append(", country : ")
			.append(this.country)
			.append("]\n")
			.toString();
	}

}