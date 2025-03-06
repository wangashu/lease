package com.wangashu.config;

public class Test5 {

    public static void main(String[] args) {

        int [] arr={8,15,23,35,45,56,75,85};


        //二分发 查找数据
          int target=75;
        int  index=-1;
         int  left=0;
         int  right=arr.length-1;   //数组的下表重0开始
        while (left<=right){
            //数组还没有走完
            int mid=left+(right-left)/2;  //数组中间的数据
            if (arr[mid]==target){
                index=mid;  //把中间数据的索引位置赋值给index
                break;

            }else  if (target>arr[mid]){
                //说明目标输在右侧；
                left=mid+1;

            }else if(target<arr[mid]){

                right=mid-1;
            }

        }

    }
}
