package cn.pppobear.demo.backend.dao;

import cn.pppobear.demo.backend.domain.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IEmployeeMapper {
    /**
     * 创建 员工 记录
     * @param employee 员工对象
     * @return 返回码
     */
    int create(Employee employee);

    /**
     * 更新 员工 记录
     * @param employee 员工对象
     * @return 返回码
     */
    int update(Employee employee);

    /**
     * 根据 id 删除 员工 记录
     * @param ids 需要删除的员工的 id 数组
     * @return 删除成功的数量
     */
    int deleteByIds(String[] ids);

    /**
     * 根据员工id，查询详细信息
     * @param id 员工id
     * @return 员工对象
     */
    Employee retrieveEmployeeById(String id);

    /**
     * @return 所有 员工 记录的 列表
     */
    List<Employee> listEmployees();
}
