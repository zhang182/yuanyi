package com.yioi.Service;

import com.yioi.Mapper.UserSafeMapper;
import com.yioi.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    UserSafeMapper userSafeMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
     User  user=userSafeMapper.selectone(username);
     if (user==null){
         throw new UsernameNotFoundException("用户名错误！！");
     }
        //获取用户权限，并把其添加到GrantedAuthority中
        List<GrantedAuthority> grantedAuthorities=new ArrayList<>();
        GrantedAuthority grantedAuthority=new SimpleGrantedAuthority(user.getRole());
        grantedAuthorities.add(grantedAuthority);

        //方法的返回值要求返回UserDetails这个数据类型，  UserDetails是接口，找它的实现类就好了
        //new org.springframework.security.core.userdetails.User(String username,String password,Collection<? extends GrantedAuthority> authorities) 就是它的实现类
        return new org.springframework.security.core.userdetails.User(username,user.getPassword(),grantedAuthorities);
    }



}
