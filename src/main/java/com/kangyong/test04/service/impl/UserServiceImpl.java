package com.kangyong.test04.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kangyong.test04.pojo.User;
import com.kangyong.test04.service.UserService;
import com.kangyong.test04.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【users】的数据库操作Service实现
* @createDate 2023-05-23 22:41:01
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




