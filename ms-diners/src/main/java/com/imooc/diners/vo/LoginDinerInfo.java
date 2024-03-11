package com.imooc.diners.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 视图对象实体类
 */
@Getter
@Setter
public class LoginDinerInfo implements Serializable {
    private String nickname;
    private String avatarUrl;
    private String token;
}
