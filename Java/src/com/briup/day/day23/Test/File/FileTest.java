package com.briup.day.day23.Test.File;

import java.io.*;

public class FileTest {

    public static void main(String[] args) throws Exception{

        //test1();
        //test2();
        //test3();
        //test4();
        //test5();
        //test6();
        //test7();
        test8();
        //test9();

    }

    /**
     * 管道输入输出
     */
    private static void test9() throws Exception {
        InputStream is = null;
        OutputStream os = null;
        is = System.in;
        os = new FileOutputStream("src/com/briup/Test/d.txt");
        byte[] bytes = new byte[1024];
        is.read(bytes);
        os.write(bytes);
        System.out.println(new String(bytes));
        os.flush();
    }

    /**
     * 统计字符串在文件中出现次数
     * 没搞定
     */
    private static void test8() throws Exception {
        int count = 0;
        String s = "1125685874345";
        FileReader fr = new FileReader("src/com/briup/Test/c.txt");
        int len = -1;
        while ((len = fr.read()) != -1) {
            while (len == s.charAt(0)) {
                for (int i = 1; i < s.length(); i++) {
                    len = fr.read();
                    if (len != s.charAt(i)) {
                        break;
                    }
                    if (i == s.length() - 1) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    /**
     * 实现试用10次的软件
     */
    private static void test7() throws Exception{

        BufferedReader br = new BufferedReader(new FileReader("src/com/briup/Test/b.txt"));
        String num = br.readLine().trim();
        int a = Integer.valueOf(num);
        if (a>0){
            a--;
            System.out.println("您还剩余"+a+"次");
            String s = String.valueOf(a);
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/briup/Test/b.txt"));
            bw.write(s);
            bw.flush();
            bw.close();
        }else {
            System.out.println("您的适用次数已用光");
        }

        br.close();

    }

    /**
     * 拷贝图片
     */
    private static void test6() throws Exception{
        FileInputStream fis = new FileInputStream("src/com/briup/other/美女.png");
        FileOutputStream fos = new FileOutputStream("src/com/briup/other/美女1.png");
        int len = -1;
        byte[] bytes = new byte[1024];
        while((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
            fos.flush();
        }
        fos.close();
        fis.close();
    }

    /**
     * 从磁盘读取文件，打印在控制台
     */
    private static void test5() throws Exception {
        FileInputStream fis = new FileInputStream("src/com/briup/Test/a.txt");
        byte[] bytes = new byte[1024];
        int len = -1;
        while((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        fis.close();
    }

    /**
     * 如何读写文件
     */
    private static void test4() throws Exception {
        FileReader fr = new FileReader("src/com/briup/other/背影.txt");
        FileWriter fw = new FileWriter("src/com/briup/Test/a.txt");

        int len = -1;
        char[] chars = new char[1024];
        while((len = fr.read(chars)) != -1) {
            //System.out.println(new String(chars, 0, len));
            fw.write(chars, 0, len);
        }

        fw.close();
        fr.close();
    }

    /**
     * 判断一个文件或目录是否存在
     */
    private static void test3() {
        System.out.println(new File("src/com/briup/Test/a.txt").exists());
        System.out.println(new File("src/com/briup/Test/c.txt").exists());
    }

    /**
     * 列出某目录下的所有子目录
     */
    private static void test2() {
        File file = new File("src/com/briup/day/day23/day23");
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                System.out.println(files[i]);
            }
        }
    }

    /**
     * 列出某目录下的所有文件
     */
    private static void test1() {
        File file = new File("src/com/briup/Test");
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                System.out.println(files[i]);
            }
        }
    }

}
