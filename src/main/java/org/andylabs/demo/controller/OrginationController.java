package org.andylabs.demo.controller;

import org.andylabs.demo.domain.Enterprise;
import org.andylabs.demo.mappers.EnterpriseMapper;
import org.andylabs.demo.mappers.UserAnnotationMapper;
import org.andylabs.demo.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "root")
public class OrginationController
{
    @Autowired
    private UserMapper userMapper;

    @Autowired private UserAnnotationMapper userAnnotationMapper;

    @Autowired
    private EnterpriseMapper enterpriseMapper;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String retrieve(@RequestParam(value = "parkSet", required = false) String parkSet,
                                                                               @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
                                                                               @RequestParam(value = "size", required = false, defaultValue = "10") Integer size) {
        var list = userMapper.findAllUsers();
        var list2 = userAnnotationMapper.findAllUsers();
        var list3 = enterpriseMapper.findAllEnterprise();
        return "123";
    }
}
