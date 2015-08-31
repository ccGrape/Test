package com.fcc.test.json;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.fcc.test.json.bean.Child;
import com.fcc.test.json.bean.Dog;
import com.fcc.test.json.bean.Father;
import com.fcc.test.json.bean.Toy;



public class Json {
    public static void main(String[] args) {
        Json objJson = new Json();
        String jsonStr = objJson.obj2Json();
        System.out.println(jsonStr);
        
    }
    private String obj2Json(){
        Father father = new Father(1, "刘翔", 29);
        List<Child> childList = new ArrayList<Child>();
        Child child1 = new Child(1,"小明",2);
        Child child2 = new Child(2,"小芳",1);
        
        //家里面有两只小狗
        List<Dog> dogList = new ArrayList<Dog>();
        for(int i = 0;i<2;i++){
            Dog dog = new Dog(i,"小狗  "+i);
            dogList.add(dog);
        }
        father.setDogList(dogList);
        
        //小明的玩具
        List<Toy> xiaomingToysList = new ArrayList<Toy>();
        for(int i=0;i<5;i++){
            Toy toy = new Toy(i,(i+1)*10);
            xiaomingToysList.add(toy);
        }
        child1.setToyList(xiaomingToysList);
        
        //小芳的玩具
        List<Toy> xiaofangToyList = new ArrayList<Toy>();
        for(int i=0;i<4;i++){
            Toy toy = new Toy(i,(i+1)*10);
            xiaofangToyList.add(toy);
        }
        child2.setToyList(xiaofangToyList);
        
        //父亲的孩子
        childList.add(child1);
        childList.add(child2);
        father.setChildList(childList);
        
        String fatherJson = JSON.toJSONString(father);
        return fatherJson;
    }
    
    private Father json2Obj(String json){
        return null;
    }
}
