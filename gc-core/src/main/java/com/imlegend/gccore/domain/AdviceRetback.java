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
@TableName("advice_retback")
public class AdviceRetback extends Model<AdviceRetback> {

    private static final long serialVersionUID = 1L;

    private String uuid;
    private String advice;
    /**
     * 意见反馈表
     */
    @TableField("create_at")
    private Date createAt;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
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
        return "AdviceRetback{" +
        ", uuid=" + uuid +
        ", advice=" + advice +
        ", createAt=" + createAt +
        "}";
    }
}
