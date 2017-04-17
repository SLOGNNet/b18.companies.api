package com.bridge18.company.v1.dto.member;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "Member invitation request")
public class MemberInvitationDTO {
    @ApiModelProperty(value = "Member email", dataType = "String")
    public String email;

    @ApiModelProperty(value = "Member roles")
    public List<String> roles;
}