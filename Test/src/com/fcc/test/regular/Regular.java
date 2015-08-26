package com.fcc.test.regular;

public class Regular {
    
    public static void main(String[] args) {
        boolean dd = "once".matches("^once");
        if(dd){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
