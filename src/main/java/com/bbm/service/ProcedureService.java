package com.bbm.service;

import java.util.List;
import java.util.Optional;

//import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.web.bind.annotation.PathVariable;

import com.bbm.entity.Procedure;


public interface ProcedureService {
	
	public Procedure createProcedure(Procedure procedure);
	public List<Procedure> listAllProcedure();
	public Optional<Procedure> searchByOID(@PathVariable Long pid);
}
