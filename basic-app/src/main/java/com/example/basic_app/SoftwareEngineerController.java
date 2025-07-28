package com.basic-app

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
	
	@GetMapping
	public List<SoftwareEngineer> getEngineers(){

	}

}
