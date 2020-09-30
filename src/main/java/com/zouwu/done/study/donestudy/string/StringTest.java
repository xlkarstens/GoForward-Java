 /*
  * Copyright (C), 2015-2020, 神州优车股份有限公司
  */
 package com.zouwu.done.study.donestudy.string;


 import org.apache.commons.lang3.StringUtils;

 /**
  * 编号拆分
  *
  * @author longquan.huang
  * @date 2020/5/12 11:25
  * @since jdk 1.8
  **/
 public class StringTest {
     public static void main(String[] args) {
        
         String no = "MDRW202003100000020";
         String s1 = StringUtils.substring(no, 0, 12);
         String s2 = StringUtils.remove(no, s1);
         String no2 = s1 + (Long.parseLong(s2) + 10000000);
         System.out.println(no2);
        
     }
 }
