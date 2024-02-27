package com.sample.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sample.model.BasicData;
import com.sample.service.BasicdataService;

@CrossOrigin("*")
@RestController  
public class BasicdataController 
{
	@Autowired
	BasicdataService basicDataService;
    
	/* AUTHOR : GUNASEKARAN
	 * DATA   : 27-02-2024 */
    @RequestMapping("/list")
	public List<BasicData> getAllData() {
		return basicDataService.findAll();   
	}
}
