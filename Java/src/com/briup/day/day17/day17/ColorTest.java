package com.briup.day.day17.day17;

class Color {

    private String name;
    public static final Color BLACK = new Color("黑色");
    public static final Color WHILT = new Color("白色");

    private Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                '}';
    }

}

public class ColorTest {

    public static void main(String[] args) {

        System.out.println(Color.BLACK);
        System.out.println(Color.WHILT);

    }

}
