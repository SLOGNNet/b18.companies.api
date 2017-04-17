package com.bridge18.company.v1.dto.company;

public class CompanySummaryDTO {
    public String id;
    public String name;
    public String mc;
    public String taxId;
    public String companyType;

    public CompanySummaryDTO(String id, String name, String mc, String taxId, String companyType) {
        this.id = id;
        this.name = name;
        this.mc = mc;
        this.taxId = taxId;
        this.companyType = companyType;
    }
}