package com.cse.midmoc;

public class Complex {
    public int real,img;

    public Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }


    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }


    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }


    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", img=" + img +
                '}';
    }
}
