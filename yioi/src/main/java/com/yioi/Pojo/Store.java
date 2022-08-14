package com.yioi.Pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
/*
*  仓位信息表  进行承载仓位信息的读取
*
*
*
* */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Store {

    private String store_belong;//仓位所属总仓
    private String store_name;//仓位名称
    private String store_number;//仓位编号
    private String store_type;//仓位类型
    private Integer store_state;//仓位状态
    private String store_detail;//仓位详细信息描述
//

}
