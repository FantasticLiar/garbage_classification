package com.imlegend.gccore.service.impl;

import com.imlegend.gccore.domain.Users;
import com.imlegend.gccore.mapper.UsersDao;
import com.imlegend.gccore.service.UsersService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author imlegend
 * @since 2019-11-16
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersDao, Users> implements UsersService {

}
