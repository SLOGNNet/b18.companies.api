package com.bridge18.company.v1.dto.company;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class LocationDTO {
    public String name;
    public AddressDTO address;
    public List<ContactInfoDTO> contactInfo;
}