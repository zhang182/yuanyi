package com.yioi.Mapper;

import com.yioi.Pojo.Store;

import java.util.List;

public interface StoreMapper {

    //增加仓位
    int addstoreinfo();
    //查询仓位信息
    List<Store> selectstore(Store store);
    //改动仓位信息
    int updatestoreinfo(Store store);
    //删除仓位信息
    int deletestore(String number);


}
