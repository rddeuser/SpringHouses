/**
 * @author Becca Deuser - rddeuser
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;

/**
 * @author bdeus
 *
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class House {
	@Id
	@GeneratedValue
	private long id;
	private int bedrooms;
	private double bathrooms;
	private String street;
	private double sqFeet;

	public House(String street) {
		this.street = street;
	}//end street constructor

	public House(int bedrooms, double bathrooms, String street, double sqFeet) {
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.street = street;
		this.sqFeet = sqFeet;
	}//end constructor w/o id
	
}//end House
