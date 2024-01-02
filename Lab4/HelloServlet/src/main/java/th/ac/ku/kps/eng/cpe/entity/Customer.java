package th.ac.ku.kps.eng.cpe.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
	@JsonProperty("aha")
	private String name;

	public Customer() {

	}

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
