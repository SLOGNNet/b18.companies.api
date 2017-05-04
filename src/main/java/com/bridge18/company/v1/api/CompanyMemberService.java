package com.bridge18.company.v1.api;

import akka.Done;
import akka.NotUsed;
import com.bridge18.company.v1.dto.member.MemberDTO;
import com.bridge18.company.v1.dto.member.MemberInvitationDTO;
import com.bridge18.company.v1.dto.member.MemberRoleDTO;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import com.lightbend.lagom.javadsl.api.transport.Method;

import java.util.List;

import static com.lightbend.lagom.javadsl.api.Service.named;
import static com.lightbend.lagom.javadsl.api.Service.restCall;

public interface CompanyMemberService extends Service {
    ServiceCall<MemberInvitationDTO, Done> inviteMember();
    ServiceCall<NotUsed, Done> removeMember(String memberId);
    ServiceCall<NotUsed, List<MemberDTO>> getMembers();
    ServiceCall<NotUsed, MemberDTO> getMember(String memberId);
    ServiceCall<MemberRoleDTO, Done> addMemberRole(String memberId);
    ServiceCall<MemberRoleDTO, Done> removeMemberRole(String memberId);

    @Override
    default Descriptor descriptor() {
        // @formatter:off
        return named("company-members").withCalls(
                restCall(Method.POST, "/v1/api/company-members", this::inviteMember),
                restCall(Method.GET, "/v1/api/company-members", this::getMembers),
                restCall(Method.GET, "/v1/api/company-members/:id", this::getMember),
                restCall(Method.DELETE, "/v1/api/company-members/:memberId", this::removeMember),
                restCall(Method.POST, "/v1/api/company-members/:id/roles", this::addMemberRole),
                restCall(Method.DELETE, "/v1/api/company-members/:id/roles", this::removeMemberRole)
        ).withAutoAcl(true);
        // @formatter:on
    }
}