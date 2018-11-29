package com.wsf.demo.mapper;

import com.wsf.demo.entity.AppUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by WangShuFa on 2018/9/27.
 */
@Repository
public interface AppUserMapperDao {

    List<AppUser> selectAll();
}
