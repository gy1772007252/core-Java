package com.briup.day.day24.Test.FileWork;

import java.io.RandomAccessFile;

public class OneThread extends Thread{

    RandomAccessFile file;
    RandomAccessFile file1;

    public OneThread() {}
    public OneThread(RandomAccessFile file, RandomAccessFile file1) {
        this.file = file;
        this.file1 = file1;
    }

    @Override
    public void run() {

    }

}
