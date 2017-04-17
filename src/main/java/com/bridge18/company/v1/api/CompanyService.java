package com.bridge18.company.v1.api;

import akka.Done;
import akka.NotUsed;
import com.bridge18.company.v1.dto.company.CompanyDTO;
import com.bridge18.company.v1.dto.company.CompanySummaryDTO;
import com.bridge18.v1.dto.PaginatedSequence;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import com.lightbend.lagom.javadsl.api.transport.Method;

import java.util.Optional;

import static com.lightbend.lagom.javadsl.api.Service.named;
import static com.lightbend.lagom.javadsl.api.Service.restCall;

public interface CompanyService extends Service {
  ServiceCall<CompanyDTO, CompanyDTO> createCompany();

  ServiceCall<NotUsed, PaginatedSequence<CompanySummaryDTO>> getCompanies(Optional<String> pagingState,
                                                                          Optional<Integer> pageSize);

  ServiceCall<CompanyDTO, CompanyDTO> updateCompany(String id);

  ServiceCall<NotUsed, CompanyDTO> getCompany(String id);

  ServiceCall<NotUsed, Done> deleteCompany(String id);

  @Override
  default Descriptor descriptor() {
    return named("/v1/api/companies").withCalls(
            restCall(Method.POST, "/", this::createCompany),
            restCall(Method.GET, "/?pagingState&count", this::getCompanies),
            restCall(Method.PUT, "/:id", this::updateCompany),
            restCall(Method.GET, "/:id", this::getCompany),
            restCall(Method.DELETE, "/:id", this::deleteCompany)
    ).withAutoAcl(true);
  }
}