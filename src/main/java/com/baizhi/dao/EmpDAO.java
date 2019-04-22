package com.baizhi.dao;

import com.baizhi.entity.Emp;

import java.util.List;

public interface EmpDAO {
    void add(Emp emp);
    void delete(String id);
    void update(Emp emp);
    List<Emp> queryAll();
    Emp queryById(String id);
}
