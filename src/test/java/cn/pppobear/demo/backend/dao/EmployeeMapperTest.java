package cn.pppobear.demo.backend.dao;

import cn.pppobear.demo.backend.domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeMapperTest {

    @Resource
    private IEmployeeMapper employeeMapper;

    @Test
    public void create() {
        Employee employee = new Employee(null, "大大陈陈", "123466220", "4321312@qq.com", 191);
        System.out.println(employeeMapper.create(employee));
        System.out.println(employee);
    }

    @Test
    public void update() {
        Employee employee = employeeMapper.retrieveEmployeeById("4");
        System.out.println("修改前：" + employee.getAge());
        employee.setAge(33);
        System.out.println("修改后：" +employee.getAge());
    }

    @Test
    public void deleteByIds() {
        int result = employeeMapper.deleteByIds(new String[]{"3", "4", "5"});
        System.out.println(result);
    }

    @Test
    public void retrieveEmployeeById() {
        Employee employee = employeeMapper.retrieveEmployeeById("9");
        System.out.println(employee);
    }

    @Test
    public void listEmployees() {
        List<Employee> employees = employeeMapper.listEmployees();
        employees.forEach(System.out::println);
    }
}