package com.jorden.li.commons.bean;

/**
 * Created by ace on 2017/9/10.
 */
public interface IJWTInfo {
    /**
     * 获取用户登录名
     *
     * @return
     */
    String getUserName();

    /**
     * 获取用户ID
     *
     * @return
     */
    String getAdminId();

    /**
     * 获取名称
     *
     * @return
     */
    String getName();

    /**
     * 应用id
     */
    String getAppId();
}
