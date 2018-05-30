package org.andylabs.demo.domain;

public class Address {
    /**
     * 邮编
     */
    private String postCode;

    /**
     * 电话
     */
    private String phoneNumber;

    /**
     * 地址
     */
    private String address;

    public String getPostCode()
    {
        return postCode;
    }

    public void setPostCode(String postCode)
    {
        this.postCode = postCode;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
