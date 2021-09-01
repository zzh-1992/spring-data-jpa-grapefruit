/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.itstyle.jpa.web;

import com.itstyle.jpa.model.Grape;
import com.itstyle.jpa.repository.GrapeRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * grape 测试入口
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2021-09-01 7:48 下午
 */
@Api(tags = "Grape JPA test API")
@RestController
@RequestMapping("/grape")
public class GrapeController {
    @Autowired
    private GrapeRepository grapeRepository;

    @GetMapping("/grape")
    public List<Grape> queryList() {
        Grape grape = grapeRepository.findGrape("1");
        System.out.println(grape);
        return grapeRepository.findAll();
    }

    @PostConstruct
    public void init() {
        Grape grape = grapeRepository.findGrape("24065365864070827807");
        System.out.println(grape);
    }
}
