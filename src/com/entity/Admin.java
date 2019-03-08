package com.entity;

/*/*
 * @ClassName Base
 * @Description
 * @Date 2019/2/11 10:06
 *
 *管理员实体类
 */
public class Admin {
    private int id;
    private String name;
    private String pwd;
    private int phone;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public int getPhone() {
        return phone;
    }
}
