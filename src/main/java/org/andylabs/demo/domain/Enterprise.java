package org.andylabs.demo.domain;

import java.sql.Timestamp;

public class Enterprise extends BaseEntity{

    /**
     * 编码
     */
    private String code;

    /**
     * 上级Id
     */
    private String parentId;

    /**
     * 名称
     */
    private String name;

    /**
     * 地址
     */
    private Address address;


    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getParentId()
    {
        return parentId;
    }

    public void setParentId(String parentId)
    {
        this.parentId = parentId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
