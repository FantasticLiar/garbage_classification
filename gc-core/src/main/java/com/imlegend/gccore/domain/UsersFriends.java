package com.imlegend.gccore.domain;

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
@TableName("users_friends")
public class UsersFriends extends Model<UsersFriends> {

    private static final long serialVersionUID = 1L;

    private String uuid;
    private String username;
    @TableField("uuid_f")
    private String uuidF;
    /**
     * 用户好友表
     */
    @TableField("username_f")
    private String usernameF;


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

    public String getUuidF() {
        return uuidF;
    }

    public void setUuidF(String uuidF) {
        this.uuidF = uuidF;
    }

    public String getUsernameF() {
        return usernameF;
    }

    public void setUsernameF(String usernameF) {
        this.usernameF = usernameF;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "UsersFriends{" +
        ", uuid=" + uuid +
        ", username=" + username +
        ", uuidF=" + uuidF +
        ", usernameF=" + usernameF +
        "}";
    }
}
