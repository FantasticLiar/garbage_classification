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
@TableName("trash_info")
public class TrashInfo extends Model<TrashInfo> {

    private static final long serialVersionUID = 1L;

    private String tid;
    private String tname;
    private String turl;
    private String tproperty;
    @TableField("create_at")
    private Date createAt;


    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTurl() {
        return turl;
    }

    public void setTurl(String turl) {
        this.turl = turl;
    }

    public String getTproperty() {
        return tproperty;
    }

    public void setTproperty(String tproperty) {
        this.tproperty = tproperty;
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
        return "TrashInfo{" +
        ", tid=" + tid +
        ", tname=" + tname +
        ", turl=" + turl +
        ", tproperty=" + tproperty +
        ", createAt=" + createAt +
        "}";
    }
}
