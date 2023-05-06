package com.bbm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbm.entity.Specimen;
import com.bbm.repo.SpecimenRepository;

@Service
public class SpecimenServiceImpl implements SpecimenService{
	
	@Autowired
	SpecimenRepository bbmSpecimenRepository;

	@Override
	public Specimen addSpecimen(Specimen bbmSpecimen) {
		return bbmSpecimenRepository.save(bbmSpecimen);
	}

	@Override
	public Specimen findSpecimentByOID(Long OID)
	{
		return bbmSpecimenRepository.findByOID(OID);
	}

	@Override
	public List<Specimen> getAllSpecimen()
	{
		return (List<Specimen>)bbmSpecimenRepository.findAll();
	}
}
