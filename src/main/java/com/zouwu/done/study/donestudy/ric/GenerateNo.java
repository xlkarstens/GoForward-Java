 /*
  * Copyright (C), 2015-2020, 神州优车股份有限公司
  */
 package com.zouwu.done.study.donestudy.ric;

 /**
  * 线性同余算法
  *
  * @author longquan.huang
  * @date 2020/4/30 14:00
  * @since jdk 1.8
  **/
 public class GenerateNo {
     public static void main(String[] args) {
//         long i = 190002;
//         long j = i % 233280;
//         long k = i / 233280;
//         Long result = (j * 9301 + 49297) % 233280 + k * 233280;
//         Long result2 = (i * 9301 + 49297) % 233280;
//         Long result3 = (i * 4096 + 150889) % 714025;
//         System.out.println(result3);
//         System.out.println(result2);

//         for (long i = 714025; i < 714035; i++) {
//             Long result = (i * 4096 + 150889) % 714025;
//             System.out.println(result);
//         }
//         System.out.println("--------------------");
//
//         for (long i = 0; i < 10; i++) {
//             Long result = (i * 4096 + 150889) % 714025;
//             System.out.println(result);
//         }
//         System.out.println("--------------------");
//         for (long i = 714015; i < 714025; i++) {
//             Long result = (i * 4096 + 150889) % 714025;
//             System.out.println(result);
//         }
//         long i = (714025 * 714024L - 150889) % 4096;
//         System.out.println(i);
        
        
         for (long i = 3573; i < 4584; i++) {
             Long result = (i * 4096 + 150889) % 714025;
             System.out.println(i + "=" + result);
         }
        
     }
 }
