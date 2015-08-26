package com.fcc.test.cloneable;

public class Administrator implements Cloneable {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    protected Object clone() throws CloneNotSupportedException {
        Administrator administrator = (Administrator) super.clone();
        administrator.user  = (User) this.user.clone();
        return administrator;
    }
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Administrator administrator = new Administrator();  
        administrator.setUser(new User());  
        
        Administrator administrator2 = (Administrator)administrator.clone();  
        System.out.println(administrator == administrator2);  
        System.out.println(administrator.getUser() == administrator2.getUser());
    }
}
