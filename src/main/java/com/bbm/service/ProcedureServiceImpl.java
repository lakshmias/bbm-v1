package com.bbm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Service;

import com.bbm.entity.Procedure;
import com.bbm.repo.ProcedureRepository;

@Service
public class ProcedureServiceImpl implements ProcedureService {
	
	@Autowired
	ProcedureRepository procedureRepository; 
	@Override
	public List<Procedure> listAllProcedure() {
		return (List<Procedure>) procedureRepository.findAll();
	}
	@Override
	public Optional<Procedure> searchByOID(Long OID) {
		return procedureRepository.findById(OID);
	}
	@Override
	public Procedure createProcedure(Procedure procedure) {
		return procedureRepository.save(procedure);
	}
	
	@Override
	public Procedure updateProcedure(Procedure procedure)
	{
		return procedureRepository.save(procedure);
	}


}
