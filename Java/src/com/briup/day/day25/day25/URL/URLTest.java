package com.briup.day.day25.day25.URL;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * 没解决
 */
public class URLTest {

    public static void main(String[] args) {

        try {

            URL url = new URL("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1999921673," +
                    "816131569&fm=26&gp=0.jpg\n");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            InputStream is = httpURLConnection.getInputStream();
            FileOutputStream fos = new FileOutputStream("src/com/briup/day/day25/a.jpg");

            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = is.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
                fos.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
