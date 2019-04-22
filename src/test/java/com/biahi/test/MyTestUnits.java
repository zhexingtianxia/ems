package com.biahi.test;

import com.baizhi.dao.EmpDAO;
import com.baizhi.dao.UserDAO;
import com.baizhi.entity.Emp;
import com.baizhi.entity.User;
import com.baizhi.service.EmpService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class MyTestUnits extends BasicTest {
    @Resource
    private UserDAO userDAO;
    @Resource
    private EmpDAO empDAO;
    @Resource
    private EmpService empService;

    @Test
    public void testUserDAO(){
        User q = userDAO.login("q");
        System.out.println(q);
    }
    @Test
    public void testEmpDAO(){
        List<Emp> emps = empDAO.queryAll();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }
    @Test
    public void testEmpService(){
        List<Emp> emps = empService.queryAll();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }
}
