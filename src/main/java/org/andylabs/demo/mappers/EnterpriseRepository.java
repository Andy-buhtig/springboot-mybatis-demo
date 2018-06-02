package org.andylabs.demo.mappers;

import org.andylabs.demo.domain.Enterprise;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnterpriseRepository {
    List<Enterprise> findAllEnterprise();

    List<Enterprise> findEnterprise(@Param("mycode") String code);
}
