package com.bridge18.company.v1.dto.company;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.List;

@AllArgsConstructor
@EqualsAndHashCode
public class LocationDTO {
    public String name;
    public AddressDTO address;
    public List<ContactInfoDTO> contactInfo;
}