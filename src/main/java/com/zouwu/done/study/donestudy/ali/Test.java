 /*
  * Copyright (C), 2015-2020, 神州优车股份有限公司
  */
 package com.zouwu.done.study.donestudy.ali;

 import java.util.Objects;

 /**
  * (一句话描述类或者接口功能)
  *
  * @author longquan.huang
  * @date 2020/4/24 9:53
  * @since jdk 1.8
  **/
 public class Test {
     public static void main(String[] args) {
         float a = 0.125f;
         double b = 0.125d;
         System.out.println((b - a) == 0.0);
         double c = 0.8;
         double d = 0.7;
         double e = 0.6;
         double v = c - d;
         double y = d - e;
         System.out.println(Objects.equals(v, y));
        
         System.out.println(1.0 / 0);
        
         System.out.println(0.0 / 0.0);
         g(1);
        
        
     }
    
     void f(Integer a) {
         System.out.println("a");
     }
    
     void f(String b) {
         System.out.println("b");
     }
    
     static void g(double d) {
        
     }
    
     static void g(Integer i) {
        
     }
    
 }
