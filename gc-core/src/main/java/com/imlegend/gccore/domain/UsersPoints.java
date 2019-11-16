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
@TableName("users_points")
public class UsersPoints extends Model<UsersPoints> {

    private static final long serialVersionUID = 1L;

    private String uuid;
    private Integer points;
    /**
     * 用户积分表
     */
    @TableField("points_level")
    private String pointsLevel;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getPointsLevel() {
        return pointsLevel;
    }

    public void setPointsLevel(String pointsLevel) {
        this.pointsLevel = pointsLevel;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "UsersPoints{" +
        ", uuid=" + uuid +
        ", points=" + points +
        ", pointsLevel=" + pointsLevel +
        "}";
    }
}
