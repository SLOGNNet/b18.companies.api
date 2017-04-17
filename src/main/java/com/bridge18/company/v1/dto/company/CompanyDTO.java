package com.bridge18.company.v1.dto.company;

import com.bridge18.company.entities.CompanyRequestStatus;
import com.bridge18.company.entities.CompanyType;

import java.util.List;

public class CompanyDTO {
    public String id;
    public String name;
    public String mc;
    public String taxId;
    public CompanyType companyType;
    public List<ContactDTO> contacts;
    public List<LocationDTO> locations;

    public CompanyRequestStatus requestStatus;
}