package com.bbm.repo;

import org.springframework.data.repository.CrudRepository;
import com.bbm.entity.Procedure;

public interface ProcedureRepository extends CrudRepository<Procedure, Long> {
	
	public Procedure findByOID(Long OID); 

}
