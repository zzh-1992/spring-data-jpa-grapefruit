/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.itstyle.jpa.repository;

import com.itstyle.jpa.model.Grape;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * 相关描述
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2021-09-01 7:36 下午
 */
public interface GrapeRepository extends JpaRepository<Grape, Long> {
    //Grape findByName(String name);

    //Grape findByAge(Integer age);

    //Grape findByNameAndAge(String name, Integer age);

    //List<Grape> findByNameLike(String name);

    @Query("from Grape g where g.uid=:uid")
    Grape findGrape(@Param("uid") String uid);
}
