package th.ac.ku.kps.eng.cpe.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneNumber {
	
	private String number;

	public PhoneNumber() {

	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
