package com.fcc.test.cloneable;

public class User implements Cloneable{
    private int id;//用户的id
    private String name;//用户姓名
    private int age;//用户的年龄
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
}
