/**
 * @author Becca Deuser - rddeuser
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.House;
import dmacc.repository.HouseRepository;

@Controller
public class WebController {
	@Autowired
	HouseRepository repo;
	
	//view all the houses if houses to view
	@GetMapping({ "/", "viewAll" })
		public String viewAllHouses(Model model) {
			if (repo.findAll().isEmpty()) {
				return addNewHouse(model);
			}//end if
			
			model.addAttribute("houses", repo.findAll());
			return "allHouses";
		}//end viewAllHouses
	
	//add a new house
	@GetMapping("/addHouse")
		public String addNewHouse(Model model) {
			House h = new House();
			model.addAttribute("newHouse", h);
			return "newHouse";
		}//end addNewHouse
	
	//after a new house is added
	@PostMapping("/addHouse")
		public String addNewHouse(@ModelAttribute House h, Model model) {
			repo.save(h);
			return viewAllHouses(model);
		}//end addNewHouse
	
	//edit an existing house
	@GetMapping("/edit/{id}")
		public String editHouse(@PathVariable("id") long id, Model model) {
			House h = repo.findById(id).orElse(null);
			model.addAttribute("newHouse", h);
			return "newHouse";
		}//end editHouse
	
	//after a house is edited
	@PostMapping("/update/{id}")
		public String updateHouse(House h, Model model) {
			repo.save(h);
			return viewAllHouses(model);
		}//end updateHouse
	
	//delete a house
	@GetMapping("/delete/{id}")
		public String deleteHouse(@PathVariable("id") long id, Model model) {
			House h = repo.findById(id).orElse(null);
			repo.delete(h);
			return viewAllHouses(model);
		}//end deleteHouse
}//end WebController
