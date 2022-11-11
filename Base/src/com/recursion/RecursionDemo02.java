package com.recursion;

import java.io.File;
import java.io.IOException;

/**
 * �����ļ�
 */
public class RecursionDemo02 {
    public static void main(String[] args) {
        //1.
        SearchFile(new File("D:/"),"one.txt");

    }

    /**
     * 1.����ĳ��Ŀ¼��ָ�����ļ���
     * @param dir
     * @param fileName
     */
    public static void SearchFile(File dir,String fileName){
        if (dir!=null&&dir.isDirectory()) {
            //��ȡ��ǰĿ¼�µ�һ���ļ�����
            File files[]=dir.listFiles();
            //�ж��Ƿ����һ������
            if (files!=null&&files.length>0) {
                for (File file : files) {
                    //�ж����ļ�����Ŀ¼
                    if (file.isFile()) {
                        //�Ƿ�����Ҫ�ҵģ��Ǿ����
                        if ((file.getName().contains(fileName))) {
                            System.out.println("find it : " + file.getAbsolutePath());
                            //������
                            Runtime r=Runtime.getRuntime();
                            try {
                                r.exec(file.getAbsolutePath());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }else{
                        //�ļ��еݹ����
                        SearchFile(file,fileName);
                    }
                }
            }

        }else{
            return ;
        }

    }
}
