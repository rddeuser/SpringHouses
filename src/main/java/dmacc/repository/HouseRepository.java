/**
 * @author Becca Deuser - rddeuser
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.House;

/**
 * @author bdeus
 *
 */
@Repository
public interface HouseRepository extends JpaRepository<House, Long> {

}//end HouseRepository
