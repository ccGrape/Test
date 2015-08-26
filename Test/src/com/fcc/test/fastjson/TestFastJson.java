package com.fcc.test.fastjson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class TestFastJson {  
    
    static class Person{          
        private String id ;  
        private String name;  
        private int age ;  
          
        public Person(){  
              
        }  
        public Person(String id,String name,int age){  
            this.id=id;  
            this.name=name;  
            this.age=age;  
        }  
        public String getId() {  
            return id;  
        }  
        public void setId(String id) {  
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
        @Override  
        public String toString() {  
            return "Person [age=" + age + ", id=" + id + ", name=" + name + "]";  
        }  
          
          
    }  
    public static void main(String[] args) {  
        method1();  
    }  
      
    static void method1(){  
        System.out.println("javabean转化示例开始----------");  
        Person person = new Person("1","fastjson",1);  
          
        //这里将javabean转化成json字符串  
        String jsonString = JSON.toJSONString(person);  
        System.out.println(jsonString);  
        //这里将json字符串转化成javabean对象,  
        person =JSON.parseObject(jsonString,Person.class);  
        System.out.println(person.toString());  
          
        System.out.println("javabean转化示例结束----------");  
    }  
}  
