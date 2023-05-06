package com.bbm.service;

import com.bbm.entity.Specimen;
import java.util.*;

public interface SpecimenService {
	public Specimen addSpecimen(Specimen bbmSpecimen);
	public Specimen findSpecimentByOID(Long OID);
	public List<Specimen> getAllSpecimen();
}
