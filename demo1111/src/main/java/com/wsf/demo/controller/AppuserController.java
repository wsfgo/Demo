package com.wsf.demo.controller;

import com.wsf.demo.entity.AppUser;
import com.wsf.demo.mapper.AppUserMapperDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by WangShuFa on 2018/9/27.
 */
@RestController
@Api("swaggerDemoController相关的api")
@RequestMapping("/appUser")
public class AppuserController {
    @Autowired
    private AppUserMapperDao dao;


    @ApiOperation(value = "列表查询所有用户信息", notes = "列表查询所有用户信息")
    @ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "Integer")
    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    public List<AppUser> findAllUsers(){
        return dao.selectAll();
    }
}
