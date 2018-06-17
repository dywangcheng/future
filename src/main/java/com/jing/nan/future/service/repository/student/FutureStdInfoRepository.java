package com.jing.nan.future.service.repository.student;

import com.jing.nan.future.service.domain.student.FutureStdInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface FutureStdInfoRepository extends JpaRepository<FutureStdInfo, Integer> {

    FutureStdInfo findFutureStdInfoByNameAndSex(@Param("name")String name, @Param("sex")String sex);

    FutureStdInfo findByName(String name);
}
