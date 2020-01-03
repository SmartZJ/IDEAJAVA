package day13;


import day13.util.InputUtil;

import java.io.File;
import java.io.IOException;


public class FileTest {
    public static void main(String[] args) {
        //创建删除测试
//        test1(InputUtil.getInputString("Test1 输入文件夹路径"));
        //打印测试
//        test2(InputUtil.getInputString("Test2 输入文件夹路径"));
        //复制测试
        test3(InputUtil.getInputString("Test3 输入文件夹路径"));
    }

    //1.用户输入一个路径，判断其是文件还是文件夹，如果路径存在该文件，删除，如果不存在创建。
    private static void test1(String s) {
        File file = new File(s);
        if(file.exists()){
            if (file.isDirectory()){
                deleteFile(file);
                file.delete();
                System.out.println("删除文件夹");
            }else {
                file.delete();
                System.out.println("删除文件");
            }
        }else {
            try {
                File fFile = new File(file.getParent());
                if (fFile.exists()){
                    file.createNewFile();
                }else {
                    System.out.println("创建父级文件夹");
                    fFile.mkdirs();
                    file.createNewFile();
                }
                System.out.println("创建文件");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //2.用户输入一个文件夹路径
    /*
    * 2-1.把文件夹下所有文件及文件夹路径打印到控制台
    * 2-2.把文件夹下所有文件及文件夹复制一份到同目录下的新文件夹下面（new_原文件夹名字）
    * */
    private static void test2(String s) {
        File file = new File(s);
        printFileName(file,0);
    }

    private static void test3(String s) {
        File file = new File(s);
        copyFile(file);
    }
    //递归打印方法
    private static void printFileName(File file,int level){
        //层级显示
        for (int i = 0; i <level ; i++) {
            System.out.print("\t");
        }
        System.out.println("-"+file.getName());
        //打印
        if (file.isDirectory()){
            File[] sz = file.listFiles();
            for (int i = 0; i <sz.length ; i++) {
                //递归调用
               printFileName(sz[i],level+1);
            }
        }
    }
    //递归删除方法
    private static void deleteFile(File file){
        if (file.isDirectory()){
            File[] sz = file.listFiles();
            for (int i = 0; i <sz.length ; i++) {
                if (sz[i].isDirectory()){
                    deleteFile(sz[i]);
                    sz[i].delete();
                    System.out.println("----删除文件夹"+sz[i].getName());
                }else {
                    sz[i].delete();
                    System.out.println("-删除文件"+sz[i].getName());
                }
            }
        }
    }


    private static void copyFile(File file){
      if (file.exists()){
          File pfile = new File(file.getParent());
          if (file.isDirectory()){
              //创建new_父类文件夹
              File nfile = new File(pfile.getAbsolutePath()+"\\new_"+file.getName());
              nfile.mkdir();
              File[] af = file.listFiles();
              for (File f:af) {
                  copyFiles(f,nfile);
              }
              System.out.println("创建文件夹"+nfile.getAbsolutePath());

          }else {
              File nfile = new File(pfile.getAbsolutePath()+"new_"+file.getName());
              try {
                  nfile.createNewFile();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      }else {
          System.out.println("文件不存在");
      }
    }
    //递归复制方法
    public static void copyFiles(File file,File npfile){
        if (file.isDirectory()){
            File nfile = new File(npfile.getAbsolutePath()+File.separator+file.getName());
            nfile.mkdir();
            File[] af = file.listFiles();
            for (File f:af) {
                copyFiles(f,nfile);
            }
        }else {
            File nfile = new File(npfile.getAbsolutePath()+"\\"+file.getName());
            try {
                nfile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
