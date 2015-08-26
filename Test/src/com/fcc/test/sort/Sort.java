package com.fcc.test.sort;
/**
 * 排序
 * @author 155256
 *
 */
public class Sort {

    /**
     * 冒泡排序
     * @param a 无序数组
     * @return 有序数组
     */
    public int[] bubbleSort(int[] a){
        int size = a.length;
        int temp;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    
    /**
     * 插入排序
     * @param a 无序数组
     * @return 有序数组
     */
    public int[] insertSort(int[] a){
        int size = a.length;
        for(int i=1;i<size;i++){
            int j=i-1;
            int temp = a[i];
            while(j>-1&&temp<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        return a;
    }
    
    
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] jjj = {1,3,2,4,7,3,6,9,6,8};
        int[] bbb = sort.insertSort(jjj);
        for(int i=0;i<bbb.length;i++){
            System.out.println(""+bbb[i]);
        }
    }
}
