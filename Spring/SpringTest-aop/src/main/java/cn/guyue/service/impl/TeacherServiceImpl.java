package cn.guyue.service.impl;

import cn.guyue.service.ITeacherService;
import org.springframework.stereotype.Service;

@Service//业务层 让spring容器来管理对象，相当于在xml中配置一个bean
public class TeacherServiceImpl implements ITeacherService {

    public void saveOrUpdate() {
        System.out.println("teacher:保存成功");
    }

    public void delete() {
        System.out.println("teacher:删除成功");
    }

    public void deleteBatch() {
        System.out.println("teacher:批量删除成功");
    }
}
