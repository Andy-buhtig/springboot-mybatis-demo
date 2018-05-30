package org.andylabs.demo.domain;

import java.sql.Timestamp;

public class BaseEntity {
    /**
     * 唯一Id
     */
    private String id;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 修改时间
     */
    private Timestamp modifyTime;

    /**
     * 唯一ID^^^
     * @return
     */
    public String getId()
    {
        return id;
    }

    /**
     * 唯一ID^^^
     * @param id
     */
    public void setId(String id)
    {
        this.id = id;
    }

    public Timestamp getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime)
    {
        this.createTime = createTime;
    }

    public Timestamp getModifyTime()
    {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime)
    {
        this.modifyTime = modifyTime;
    }
}
