package com.bridge18.company.v1.dto.company;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ContactDTO {
    public String id;
    public String firstName;
    public String middleName;
    public String lastName;
    public List<ContactInfoDTO> contactInfo;
    public String position;
    public AddressDTO address;
}
