package com.briup.service.impl;

import com.briup.service.ITeacherService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements ITeacherService {
    @Override
    public void saveOrUpdate() {
        System.out.println("teacher:保存成功");
    }

    @Override
    public void delete() {
        System.out.println("teacher:删除成功");
    }

    @Override
    public void deleteBatch() {
        System.out.println("teacher:批量删除成功");
    }
}
