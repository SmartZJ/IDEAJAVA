package util;

import java.io.*;

public class IoCloseUtil {


    //输入要关闭的流
    public static void closeAll(Closeable...c){
        for (Closeable cs:c) {
            if (cs!=null){
                try {
                    cs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //文件夹复制
    public static void copyToNewDirectory(String path) throws IOException {
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
    /**
     * @param path 被复制目标文件夹
     *
     * @param npath 目标文件夹
     *
     * */
    public static void copyToOtherDirectory(String path,String npath) throws IOException {
        File file = new File(path);
        File nfile = new File(npath+"\\"+file.getName());
        nfile.mkdir();
        if (file.isDirectory()){
            File[] af = file.listFiles();
            for (File f:af) {
                copyFiles(f,nfile);
            }
            System.out.println("创建文件夹"+nfile.getAbsolutePath());
        }else {
            copyFile(path,npath);
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
    public static void copyFile(String path,String npath) throws IOException {
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
        IoCloseUtil.closeAll(fis,fos);
    }
}
