package com.kangyong.test04.mapper;

import com.kangyong.test04.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【users】的数据库操作Mapper
* @createDate 2023-05-23 22:41:01
* @Entity generator.pojo.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




