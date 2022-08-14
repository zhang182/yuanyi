package com.yioi.Mapper;

import com.yioi.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserSafeMapper {

    User selectone(String account);

}
