package cn.pppobear.demo.backend.service;

import cn.pppobear.demo.backend.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author pppobear
 */
@Service
public interface IEmployeeService {
    /**
     * 创建 或 更新 员工
     * @param employee 员工对象
     */
    Employee createUpdate(Employee employee);

    /**
     * 删除 员工
     * @param id 员工对象的id
     */
    void delete(String id);

    /**
     * 获取 员工信息
     * @param id 员工的id
     * @return 员工对象
     */
    Employee get(String id);

    /**
     * @return 所有员工对象
     */
    List<Employee> listAll();
}
