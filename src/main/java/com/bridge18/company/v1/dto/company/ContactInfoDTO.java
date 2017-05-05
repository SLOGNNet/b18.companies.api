package com.bridge18.company.v1.dto.company;

import com.bridge18.company.entities.ContactInfoType;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class ContactInfoDTO {
    public String label;
    public String value;
    public ContactInfoType type;
}
