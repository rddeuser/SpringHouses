/**
 * @author Becca Deuser - rddeuser
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.House;

/**
 * @author bdeus
 *
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public House house() {
		House bean = new House(4, 3, "210 Parkview Dr", 2500);
		return bean;
	}//end house

}//end BeanConfiguration
