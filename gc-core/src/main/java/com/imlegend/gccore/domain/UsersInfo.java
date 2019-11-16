package com.imlegend.gccore.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author imlegend
 * @since 2019-11-16
 */
@TableName("users_info")
public class UsersInfo extends Model<UsersInfo> {

    private static final long serialVersionUID = 1L;

    private String uuid;
    private String position;
    @TableField("avator_url")
    private String avatorUrl;
    private String auth;
    private String name;
    private String sex;
    /**
     * 用户信息表
     */
    private Date birthday;
    @TableField("create_at")
    private Date createAt;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAvatorUrl() {
        return avatorUrl;
    }

    public void setAvatorUrl(String avatorUrl) {
        this.avatorUrl = avatorUrl;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "UsersInfo{" +
        ", uuid=" + uuid +
        ", position=" + position +
        ", avatorUrl=" + avatorUrl +
        ", auth=" + auth +
        ", name=" + name +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", createAt=" + createAt +
        "}";
    }
}
