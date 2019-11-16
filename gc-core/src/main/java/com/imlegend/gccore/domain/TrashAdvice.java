package com.imlegend.gccore.domain;

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
@TableName("trash_advice")
public class TrashAdvice extends Model<TrashAdvice> {

    private static final long serialVersionUID = 1L;

    private String tid;
    private String tproperty;
    /**
     * 垃圾处理意见表
     */
    private String tadvice;


    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTproperty() {
        return tproperty;
    }

    public void setTproperty(String tproperty) {
        this.tproperty = tproperty;
    }

    public String getTadvice() {
        return tadvice;
    }

    public void setTadvice(String tadvice) {
        this.tadvice = tadvice;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "TrashAdvice{" +
        ", tid=" + tid +
        ", tproperty=" + tproperty +
        ", tadvice=" + tadvice +
        "}";
    }
}
