package com.bbm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bbm.entity.Procedure;
import com.bbm.repo.ProcedureRepository;
import com.bbm.service.ProcedureService;

@RestController
public class ProcedureController {
	
	@Autowired
	ProcedureService procedureService;
	
	@Autowired
	ProcedureRepository procedureRepository;
	
	@GetMapping("/welcomeProcedure")
	public String helloAppln() {
		return "Hey Procedure!!!";
	}
	
	@PostMapping("/procedure")
	public Procedure createProcedure(@RequestBody Procedure proc) {
		return procedureService.createProcedure(proc);
	}
	
	@GetMapping("/procedure")
	public List<Procedure> listAllProcedure() 
	{
		return procedureService.listAllProcedure();
	}
	
	@GetMapping("/procedure/{OID}")
	public Optional<Procedure> searchByProcedureId(@PathVariable Long OID) 
	{
		return procedureService.searchByOID(OID);
	}

}
