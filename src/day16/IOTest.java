package day16;

import util.InputUtil;
import util.IoCloseUtil;

import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        String str;
        while (true) {
            str = InputUtil.getInputString("请输入文件路径");
            File file = new File(str);
            if (file.exists()){
                break;
            }else {
                System.out.println("路径错误");
            }
        }

        try {
//            copy(str);
            copyDirectory(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


/*2.用户输入文件路径，在同级复制一份文件（在拓展名前加_new，如：aa.jpg -> aa_new.jpg）
如果路径有误，请用户重新输入*/
    private static void copy(String path) throws IOException {
        //初始化流
        File file = new File(path);
        String npath = "";
        //获取输出路径
        if (file.isFile()){
            npath = path.substring(0,path.lastIndexOf(File.separator))+path.substring(path.lastIndexOf(File.separator),path.lastIndexOf("."))+"_new"+path.substring(path.lastIndexOf("."));
            copyFile(path,npath);
            System.out.println("复制完成");
        }else if (file.isDirectory()){
            npath = path+"_new";
            File file1 = new File(npath);
            file1.mkdir();
        }
    }


    //文件夹复制
    private static void copyDirectory(String path) throws IOException {
        File file = new File(path);

            File pfile = new File(file.getParent());
            if (file.isDirectory()){
                //创建new_父类文件夹
                File nfile = new File(pfile.getAbsolutePath()+"\\"+file.getName()+"_new");
                nfile.mkdir();
                File[] af = file.listFiles();
                for (File f:af) {
                    copyFiles(f,nfile);
                }
                System.out.println("创建文件夹"+nfile.getAbsolutePath());

            }else {
                String npath = pfile.getAbsolutePath()+"new_"+file.getName();
                copyFile(file.getAbsolutePath(),npath);
            }
    }

    //文件夹复制辅助方法
    private static void copyFiles(File file,File npfile) throws IOException {
        if (file.isDirectory()){
            File nfile = new File(npfile.getAbsolutePath()+File.separator+file.getName());
            nfile.mkdir();
            File[] af = file.listFiles();
            for (File f:af) {
                copyFiles(f,nfile);
            }
        }else {
            String nfile = npfile.getAbsolutePath()+"\\"+file.getName();
            copyFile(file.getAbsolutePath(),nfile);
        }
    }

    //单个文件复制方法
    /**
     * @param path 被复制的路径
     * @param npath 复制到这个路径
     * @throws IOException
     * */
    private static void copyFile(String path,String npath) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        fis = new FileInputStream(path);
        fos = new FileOutputStream(npath);
        int len;
        byte[] b = new byte[1024];
        while ((len=fis.read(b))!=-1){
            fos.write(b,0,len);
        }
        fos.flush();
        System.out.println("复制完成");
        IoCloseUtil.closeAll(fos,fis);
    }
}
