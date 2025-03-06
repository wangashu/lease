package com.wangashu.config;

public class Test3 {

    public static void main(String[] args) {
        //1000 个数组循环删除 最后留下的是谁

        int [] arr=new int[1000];
        for (int i=1;i<arr.length;i++){
            arr[i]=i; //把 索引i的值复制给 arr【i】
        }

     int count=arr.length;
     int index=0; //要删除索引的位置


        while (count>1){

             index=(index+2)%count;

             System.arraycopy(arr,index+1,arr,index,count-index-1);
             count--;



        }
        System.out.println("最后剩下的元素为"+arr[0]);

    }
}
