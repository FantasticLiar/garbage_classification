package com.imlegend.gccore.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author imlegend
 * @since 2019-11-16
 */
public class Users extends Model<Users> {

    private static final long serialVersionUID = 1L;

    private String uuid;
    private String username;
    private String passwd;
    /**
     * 用户登录表

     */
    @TableField("create_at")
    private Date createAt;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
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
        return "Users{" +
        ", uuid=" + uuid +
        ", username=" + username +
        ", passwd=" + passwd +
        ", createAt=" + createAt +
        "}";
    }
}
