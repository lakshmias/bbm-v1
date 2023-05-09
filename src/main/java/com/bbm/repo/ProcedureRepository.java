package com.bbm.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bbm.entity.Procedure;

@Repository
public interface ProcedureRepository extends CrudRepository<Procedure, Long>{
	public Procedure findByOID(Long OID);
	
}
