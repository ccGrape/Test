package com.fcc.test.string;


public class SubString {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
       /* String type = "分享 ";
        System.out.println(type.length()+"");
        if(null!=type.trim()&&type.trim().length()>1){//判断长度
            String beginStr = type.trim().substring(0, 2);
            String endStr = type.trim().substring(2, type.trim().length());

            if (beginStr != null && beginStr.equals("用户") && endStr != null && !endStr.equals("")) {
                type = endStr;
            }
            if (beginStr != null && beginStr.equals("分享") && endStr != null && !endStr.equals("")) {
                type = beginStr;
            }
        }
        System.out.println(type);*/
        
        SubString test = new SubString();
        System.out.println(test.changeChatGroutName("MOBILE_71b842e3364c4ba3b2884e14160b4c31、doubleC、yangliang1"));
    }
    
    private String changeChatGroutName(String chatGroupName){
        if(null!=chatGroupName){
            if(!chatGroupName.equals("")){
                String[] chatGoupName2Array = chatGroupName.split("、");
                StringBuilder sb = new StringBuilder();
                for(int i=0,length = chatGoupName2Array.length;i<length;i++){
                    String s = setUserName(chatGoupName2Array[i]);
                    sb.append(s);
                    if(i<length-1){
                        sb.append("、");
                    }
                }
                return sb.toString();
            }
            return "";
        }
        return null;
    }
    
    public static String setUserName(String name){
        if(name !=  null){
        int length = name.length();
        StringBuffer str = new StringBuffer(name);
        String ss = "***";//前面2个字符  中间*** 后面3个字符    固定8个字符
        if(name.startsWith("QQ_") || name.startsWith("WEIBO_") || name.startsWith("MOBILE_")){
            str.replace(2, length - 3, ss);
        }
        return str.toString();
        }
        return null;
    }
}
