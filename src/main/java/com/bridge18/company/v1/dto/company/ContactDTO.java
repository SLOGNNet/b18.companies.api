package com.bridge18.company.v1.dto.company;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.List;

@AllArgsConstructor
@EqualsAndHashCode
public class ContactDTO {
    public String id;
    public String firstName;
    public String middleName;
    public String lastName;
    public List<ContactInfoDTO> contactInfo;
    public String position;
    public AddressDTO address;
}
