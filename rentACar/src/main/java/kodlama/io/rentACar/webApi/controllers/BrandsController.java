package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController //annotation for spring framework pointing this is an access point.
@RequestMapping("/api/brands") //adressing
public class BrandsController {
	private BrandService brandService;

	@Autowired//check parameter brandService and scan which class implements 
	//brandservice. then get a Newed instance from that class.
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	
	@GetMapping("/getall")//www.kodlama.io/api/brands/getAll 
	public List<Brand> getAll() {
		return brandService.getAll();
	}
	
	
}
