package com.bridge18.company.v1.dto.member;

import com.bridge18.company.entities.MemberStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "Member")
public class MemberDTO extends MemberInvitationDTO {
    @ApiModelProperty(value = "Member id", dataType = "String")
    public String id;
    @ApiModelProperty(value = "Created at", dataType = "Date")
    public Date createdAt;
    @ApiModelProperty(value = "Verified at", dataType = "Date")
    public Date verifiedAt;

    @ApiModelProperty(value = "Status", dataType = "String")
    public MemberStatus status;
}