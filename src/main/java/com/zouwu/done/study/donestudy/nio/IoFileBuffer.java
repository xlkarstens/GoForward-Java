 /*
  * Copyright (C), 2015-2020, 神州优车股份有限公司
  */
 package com.zouwu.done.study.donestudy.nio;

 import java.io.*;
 import java.util.zip.ZipEntry;
 import java.util.zip.ZipOutputStream;

 /**
  * 压缩文件使用java标准api流形式
  *
  * @author longquan.huang
  * @date 2020/9/30 9:12
  * @since jdk 1.8
  **/
 public class IoFileBuffer {
     private static String ZIP_FILE = "static" + File.separator + "IoFileBuffer.zip";
     private static String IMG_FILE = "static" + File.separator + "img.png";
    
     public static void main(String[] args) {
         zipFileBuffer();
     }
    
     private static void zipFileBuffer() {
         // 获取项目根目录
         String userDir = System.getProperty("user.dir");
         String zipFilePath = userDir + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + ZIP_FILE;
         String imgFilePath = userDir + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + IMG_FILE;
         System.out.println(zipFilePath);
         long startTime = System.currentTimeMillis();
         File zipFile = new File(zipFilePath);
         try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile))) {
             BufferedOutputStream zipBufOut = new BufferedOutputStream(zipOut);
             for (int i = 0; i < 10; i++) {
                 try (FileInputStream imgInput = new FileInputStream(imgFilePath)) {
                     BufferedInputStream imgInputBuf = new BufferedInputStream(imgInput);
                     zipOut.putNextEntry(new ZipEntry("img" + i + ".png"));
                     int temp = 0;
                     while ((temp = imgInputBuf.read()) != -1) {
                         zipBufOut.write(temp);
                     }
                 } catch (Exception ex) {
                     ex.printStackTrace();
                 }finally {
                     zipOut.closeEntry();
                 }
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
         long endTime = System.currentTimeMillis();
         
         System.out.println("花费时间：" + (endTime - startTime) + "ms");
//         花费时间：277376ms
     }
 }
