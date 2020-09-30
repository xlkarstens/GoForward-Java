 /*
  * Copyright (C), 2015-2020, 神州优车股份有限公司
  */
 package com.zouwu.done.study.donestudy.nio;

 import java.io.*;
 import java.nio.channels.Channels;
 import java.nio.channels.FileChannel;
 import java.nio.channels.WritableByteChannel;
 import java.util.zip.ZipEntry;
 import java.util.zip.ZipOutputStream;

 /**
  * 压缩文件使用java标准api流形式
  *
  * @author longquan.huang
  * @date 2020/9/30 9:12
  * @since jdk 1.8
  **/
 public class IoFileChannel {
     private static String ZIP_FILE = "static" + File.separator + "IoFileChannel.zip";
     private static String IMG_FILE = "static" + File.separator + "img1.jpg";
    
     private static Long FILE_SIZE = 10 * 1024 * 1024 * 1024L;
    
     public static void main(String[] args) {
         zipFileChannel();
     }
    
     private static void zipFileChannel() {
         // 获取项目根目录
         String userDir = System.getProperty("user.dir");
         String zipFilePath = userDir + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + ZIP_FILE;
         String imgFilePath = userDir + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + IMG_FILE;
         System.out.println(zipFilePath);
         long startTime = System.currentTimeMillis();
         File zipFile = new File(zipFilePath);
         try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile))) {
             WritableByteChannel writableByteChannel = Channels.newChannel(zipOut);
             for (int i = 0; i < 10; i++) {
                 try (FileChannel fileChannel = new FileInputStream(imgFilePath).getChannel()) {
                     zipOut.putNextEntry(new ZipEntry("img" + i + ".jpg"));
                     fileChannel.transferTo(0, FILE_SIZE, writableByteChannel);
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
//         花费时间：4289ms
     }
 }
