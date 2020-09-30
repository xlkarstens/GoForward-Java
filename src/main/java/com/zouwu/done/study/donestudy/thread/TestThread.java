 /*
  * Copyright (C), 2015-2020, 神州优车股份有限公司
  */
 package com.zouwu.done.study.donestudy.thread;

 /**
  * (一句话描述类或者接口功能)
  *
  * @author longquan.huang
  * @date 2020/6/15 17:38
  * @since jdk 1.8
  **/
 public class TestThread {
     public static void main(String[] args) {
         System.out.println("hello world");
         ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
         ThreadGroup topGroup = null;
         while (threadGroup != null) {
             topGroup = threadGroup;
             threadGroup = threadGroup.getParent();
         }
         int i = topGroup.activeCount();
         Thread[] threads = new Thread[i];
         topGroup.enumerate(threads);
         for (int i1 = 0; i1 < i; i1++) {
             System.out.println("线程：" + i1 + " " + threads[i1].getName());
         }
     }
 }
