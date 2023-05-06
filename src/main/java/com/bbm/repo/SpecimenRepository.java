package com.bbm.repo;

import org.springframework.data.repository.CrudRepository;
import com.bbm.entity.Specimen;

public interface SpecimenRepository extends CrudRepository<Specimen,Long>  {
	public Specimen findByOID(Long OID);
}
