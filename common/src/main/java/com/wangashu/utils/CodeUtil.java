package com.wangashu.utils;

import java.util.Random;

public class CodeUtil {


    //写一个根据输入多少的长度  生成多少数位的验证码

    public  static  String   codeGetSms(Integer length){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <length ; i++) {
            Random random = new Random();
            int nextInt = random.nextInt(10); //生成的0-9的随机数字
            stringBuilder.append(nextInt); //  把生成的随机数字 拼接
        }
      return stringBuilder.toString();
    }

}
