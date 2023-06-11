package com.example.zhxy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.zhxy.pojo.LoginForm;
import com.example.zhxy.pojo.Teacher;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public interface TeacherService extends IService<Teacher> {

    /**
     * 登录方法
     */
    public Teacher login(LoginForm loginForm);

    Teacher getTeacherById(Long userId);

    IPage<Teacher> getTeachersByOpr(Page<Teacher> paraParam, Teacher teacher);
}
