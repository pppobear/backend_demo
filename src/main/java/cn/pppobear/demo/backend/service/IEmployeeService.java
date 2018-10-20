package cn.pppobear.demo.backend.service;

import cn.pppobear.demo.backend.domain.Employee;

import java.util.List;

/**
 *
 * @author pppobear
 */
public interface IEmployeeService {
    /**
     * 创建 员工
     * @param employee 员工对象
     */
    void create(Employee employee);

    /**
     * 删除 员工
     * @param id 员工对象的id
     */
    void delete(long id);

    /**
     * 更新 员工
     * @param employee 员工对象
     */
    void update(Employee employee);

    /**
     * 获取 员工信息
     * @param id 员工的id
     * @return 员工对象
     */
    Employee get(long id);

    /**
     * @return 所有员工对象
     */
    List<Employee> listAll();
}
