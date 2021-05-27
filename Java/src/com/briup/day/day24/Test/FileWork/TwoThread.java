package com.briup.day.day24.Test.FileWork;

import java.io.RandomAccessFile;

public class TwoThread extends Thread{

    RandomAccessFile file;
    RandomAccessFile file1;

    public TwoThread() {}
    public TwoThread(RandomAccessFile file, RandomAccessFile file1) {
        this.file = file;
        this.file1 = file1;
    }

    @Override
    public void run() {

    }

}
