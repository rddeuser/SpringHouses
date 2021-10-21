/**
 * @author Becca Deuser - rddeuser
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author bdeus
 *
 */
@Entity
public class House {
	@Id
	@GeneratedValue
	private long id;
	private int bedrooms;
	private double bathrooms;
	private String street;
	private double sqFeet;

	public House() {
		
	}//end default constructor

	public House(String street) {
		this.street = street;
	}//end street constructor

	public House(int bedrooms, double bathrooms, String street, double sqFeet) {
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.street = street;
		this.sqFeet = sqFeet;
	}//end constructor w/o id

	public House(long id, int bedrooms, double bathrooms, String street, double sqFeet) {
		this.id = id;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.street = street;
		this.sqFeet = sqFeet;
	}//end complete constructor

	public long getId() {
		return id;
	}//end getId

	public void setId(long id) {
		this.id = id;
	}//end setId

	public int getBedrooms() {
		return bedrooms;
	}//end getBedrooms

	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}//end setBedrooms

	public double getBathrooms() {
		return bathrooms;
	}//end getBathrooms

	public void setBathrooms(double bathrooms) {
		this.bathrooms = bathrooms;
	}//end setBathrooms

	public String getStreet() {
		return street;
	}//end getStreet

	public void setStreet(String street) {
		this.street = street;
	}//end setStreet

	public double getSqFeet() {
		return sqFeet;
	}//end getSqFeet

	public void setSqFeet(double sqFeet) {
		this.sqFeet = sqFeet;
	}//end setSqFeet

	@Override
	public String toString() {
		return "House [id=" + id + ", bedrooms=" + bedrooms + ", bathrooms=" + bathrooms + ", street=" + street
				+ ", sqFeet=" + sqFeet + "]";
	}//end toString
	
}//end House
