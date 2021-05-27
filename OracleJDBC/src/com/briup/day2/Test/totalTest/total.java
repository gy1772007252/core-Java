package com.briup.day2.Test.totalTest;

import java.util.List;

/**
 * 总页数totalPage
 * 总条数totalCount
 * 当前页currentPage
 * 每页显示条数pageNum
 * 分页查询的数据entity
 * 开始条数start
 * 截止条数end
 */
public class total<T> {

    private int totalPage;
    private int totalCount;
    private int currentPage;
    private int pageNum = 4;
    private List<T> entity;
    private int start;
    private int end;

    public total() {}
    public total(int totalPage, int totalCount, int currentPage, int pageNum, List<T> entity, int start, int end) {
        this.totalPage = totalPage;
        this.totalCount = totalCount;
        this.currentPage = currentPage;
        this.pageNum = pageNum;
        this.entity = entity;
        this.start = start;
        this.end = end;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public List<T> getEntity() {
        return entity;
    }

    public void setEntity(List<T> entity) {
        this.entity = entity;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "总页数：" + totalPage +
                "\t\t总条数：" + totalCount +
                "\t\t当前页数：" + currentPage +
                "\t\t每页显示条数：" + pageNum +
                "\n\t\t" + entity +
                "\n开始条数：" + start +
                "\t\t结束条数：" + end;
    }
}
