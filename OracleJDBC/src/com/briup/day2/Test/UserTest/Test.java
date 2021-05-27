package com.briup.day2.Test.UserTest;

import com.briup.dom.JdbcUtils;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Test {

    private static int i = 0;
    private static Scanner scanner = new Scanner(System.in);

    static {
        i = JdbcUtils.queryForObject("select count(id) from test_user",resultSet -> {
            int anInt = 0;
            try {
                while (resultSet.next()) {
                    anInt = resultSet.getInt("count(id)");
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return anInt;
        });
    }

    public static void main(String[] args) {

        loginAndRegister();

    }

    private static void loginAndRegister() {
        boolean b = true;
        while (b) {
            System.out.println("1--注册");
            System.out.println("2--登录");
            System.out.println("0--退出");
            System.out.print("请输入选项：");
            int i = Integer.parseInt(scanner.nextLine());
            switch (i) {
                case 0:
                    System.exit(0);
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                default:
                    System.out.println("请输入0-1");
            }
        }
    }

    private static void register() {
        System.out.println();
        System.out.print("请输入账户：");
        String username = scanner.nextLine();
        String password = select(username);
        if (password != null) {
            System.out.println("用户已存在！");
            return;
        }
        System.out.print("请输入密码：");
        String passwd = scanner.nextLine();
        String sql = "insert into test_user " +
                "values('" + (i + 1) + "'," +
                "'" + username + "'," +
                "'" + passwd +
                "')";
        JdbcUtils.executeUpdate(sql);
    }

    private static void login() {
        while (true) {
            System.out.print("请输入账户：");
            String username = scanner.nextLine();
            if (username.equals("exit")) {
                return;
            }
            String password = select(username);
            if (password == null) {
                System.out.println("账户不存在！");
                continue;
            }
            while (true) {
                System.out.print("请输入密码：");
                String passwd = scanner.nextLine();
                if (passwd.equals("exit")) {
                    return;
                }
                if (password.equals(passwd)) {
                    menu();
                }
                System.out.println("密码错误！");
            }
        }
    }

    private static void menu() {
        boolean b = true;
        while (b) {
            System.out.println();
            System.out.println("1--修改用户信息");
            System.out.println("2--删除用户信息");
            System.out.println("3--查询所有用户信息");
            System.out.println("4--查询指定账户用户信息");
            System.out.println("0--退出");
            System.out.print("请输入选项：");
            int i = Integer.parseInt(scanner.nextLine());
            switch (i) {
                case 0:
                    System.exit(0);
                case 1:
                    update();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    selectAll();
                    break;
                case 4:
                    select();
                    break;
                default:
                    System.out.println("请输入0-4");
            }
        }
    }

    private static void select() {
        System.out.println("请输入要查询的用户名：");
        String username = scanner.nextLine();
        String password = select(username);
        System.out.println("用户名：" + username + "，密码：" + password);
    }

    private static String select(String username) {
        String sql = "select passwd " +
                "from test_user " +
                "where username = '" + username + "'";
        String password = JdbcUtils.queryForObject(sql, resultSet -> {
            String passwd = null;
            try {
                while (resultSet.next()) {
                    passwd = resultSet.getString("passwd");
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return passwd;
        });
        return password;
    }

    private static void selectAll() {
        String sql = "select * " +
                "from test_user";
        List<User> users = JdbcUtils.queryForList(sql, User.class);
        for (User user : users) {
            System.out.println("用户名：" + user.getUsername() + "，密码：" + user.getPasswd());
        }
    }

    private static void delete() {
        while (true) {
            System.out.print("请输入用户名：");
            String username = scanner.nextLine();
            String password = select(username);
            if (password == null) {
                System.out.println("用户名不存在！");
                return;
            }
            String sql = "delete from test_user " +
                    "where username = '" + username + "'";
            JdbcUtils.executeUpdate(sql);
            return;
        }

    }

    private static void update() {
        while (true) {
            System.out.print("请输入要更改的用户姓名：");
            String username = scanner.nextLine();
            if (username.equals("exit")) {
                return;
            }
            String password = select(username);
            if (password == null) {
                System.out.println("账户不存在！");
                continue;
            }
            System.out.print("请输入更改的密码：");
            String passwd = scanner.nextLine();
            String sql = "update test_user " +
                    "set passwd = '" + passwd + "' " +
                    "where username = '" + username + "'";
            JdbcUtils.executeUpdate(sql);
            return;
        }
    }

}
