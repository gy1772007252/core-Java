package com.briup.day2.Test.tableTest;

public class Column {

    private String name;
    private String type;
    private boolean require;

    @Override
    public String toString() {
        return "\n\t\tColumn{" + "\n" +
                "\t\t\tname='" + name + '\'' + ",\n" +
                "\t\t\ttype='" + type + '\'' + ",\n" +
                "\t\t\trequire=" + require + "\n\t\t" +
                '}';
    }

    public Column() {}
    public Column(String name, String type, boolean require) {
        this.name = name;
        this.type = type;
        this.require = require;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRequire() {
        return require;
    }

    public void setRequire(boolean require) {
        this.require = require;
    }
}
