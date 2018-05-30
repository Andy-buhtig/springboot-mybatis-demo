package org.andylabs.demo.mappers;

import org.andylabs.demo.domain.Enterprise;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnterpriseMapper {
    List<Enterprise> findAllEnterprise();
}
