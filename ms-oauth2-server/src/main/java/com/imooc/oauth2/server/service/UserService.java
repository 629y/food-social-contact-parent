package com.imooc.oauth2.server.service;

import com.imooc.commons.model.pojo.Diners;
import com.imooc.commons.utils.AssertUtil;
import com.imooc.oauth2.server.mapper.DinersMapper;
import io.swagger.annotations.Authorization;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * 登录校验
 */
@Service
public class UserService implements UserDetailsService {

    @Resource
    private DinersMapper dinersMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AssertUtil.isNotEmpty(username,"请输入用户名");
        Diners diners = dinersMapper.selectByAccountInfo(username);
        if (diners == null){
            throw new UsernameNotFoundException("用户名或密码错误，请重新输入");
        }
        return new User(username, diners.getPassword(), AuthorityUtils.commaSeparatedStringToAuthorityList(diners.getRoles()));
    }
}