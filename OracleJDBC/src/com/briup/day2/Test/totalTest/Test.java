package com.briup.day2.Test.totalTest;


import com.briup.dom.JdbcUtils;

import java.util.List;
import java.util.Scanner;

/**
 * 自定义一个分页类
 * 使用JdbcUtil工具类实现分类功能
 */
public class Test {

    public static void main(String[] args) {

        total<User> page = new total<>();
        System.out.println("oracle分页查询数据");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int currenPage = scanner.nextInt();
            System.out.println("正在查询第" + currenPage + "页的数据:");
            int pageNum = page.getPageNum();
            page.setCurrentPage(currenPage);
            int totalCount = pageCount();
            page.setTotalCount(pageCount());
            int totalPage = totalCount % pageNum == 0 ? totalCount / pageNum : totalCount / pageNum + 1;
            page.setTotalPage(totalPage);
            page.setStart((currenPage - 1) * pageNum + 1);
            page.setEnd(currenPage * pageNum);
            List<User> userList = findByPage(page.getStart(), page.getEnd());
            page.setEntity(userList);
            System.out.println(page);

        }

    }

    private static List<User> findByPage(int start, int end) {
        String sql = "select id, name " +
                "from (" +
                    "select rownum r,id, name " +
                    "from total " +
                ") " +
                "where r between " + start + " and " + end;
        return JdbcUtils.queryForList(sql, User.class);
    }

    private static int pageCount() {
        List<User> userList = JdbcUtils.queryForList("select * from total", User.class);
        return userList.size();
    }


}
