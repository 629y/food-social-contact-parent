package com.imooc.diners.mapper;

import com.imooc.commons.model.pojo.Diners;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 食客Mapper
 */
public class DinersMapper {
    //根据手机号查询食客信息
    @Select("select id, username, phone, email, is_vaild " +
            "from t_diners where phone = #{phone}")
    Diners selectByPhone(@Param("phone") String phone);
}
