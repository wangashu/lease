package com.wangashu.config;

public class TestJavaTwo {
    public static void main(String[] args) {
        //百元买100 鸡公鸡每只5元，母鸡每只3元，小鸡每3只1元，用100元去买100只鸡，
        // 要求公鸡、母鸡、小鸡都要有，各买多少只，用Java程序实
        int money=100;
        int count=100;
        for (int rooster=1;rooster<= 100/5;rooster++){
            for (int hen=1;hen<= 100/3;hen++){
                int chick=count-rooster-hen;
                int price=chick/3;
                if (rooster+hen+chick==count && rooster*5+hen*3+chick/3==100 &&chick % 3==0){

                    System.out.println("公鸡的数量:"+rooster+"  母鸡的数量"+hen +"  小鸡的数量"+chick);
                }
            }



        }


    }
}
