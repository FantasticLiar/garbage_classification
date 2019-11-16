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
@TableName("level_dim")
public class LevelDim extends Model<LevelDim> {

    private static final long serialVersionUID = 1L;

    @TableField("level_start")
    private Integer levelStart;
    @TableField("level_end")
    private Integer levelEnd;
    @TableField("level_name")
    private String levelName;


    public Integer getLevelStart() {
        return levelStart;
    }

    public void setLevelStart(Integer levelStart) {
        this.levelStart = levelStart;
    }

    public Integer getLevelEnd() {
        return levelEnd;
    }

    public void setLevelEnd(Integer levelEnd) {
        this.levelEnd = levelEnd;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LevelDim{" +
        ", levelStart=" + levelStart +
        ", levelEnd=" + levelEnd +
        ", levelName=" + levelName +
        "}";
    }
}
