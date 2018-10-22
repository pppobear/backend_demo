package cn.pppobear.demo.backend.service.impl;

import cn.pppobear.demo.backend.dao.IEmployeeMapper;
import cn.pppobear.demo.backend.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IEmployeeServiceImpl implements cn.pppobear.demo.backend.service.IEmployeeService {
    private final IEmployeeMapper employeeMapper;

    @Autowired
    IEmployeeServiceImpl(IEmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public Employee createUpdate(Employee employee) {
        Long employeeId = employee.getId();
        if (employeeId == null || employeeId < 0) {
            employeeMapper.create(employee);
        } else {
            if (employee.getPassword() == null || employee.getPassword().length() == 0) {
                employee.setPassword(employeeMapper.retrieveEmployeeById(employeeId.toString()).getPassword());
            }
            employeeMapper.update(employee);
        }
        return employee;
    }

    @Override
    public void delete(String id) {
        employeeMapper.deleteByIds(new String[]{id});
    }

    @Override
    public Employee get(String id) {
        return employeeMapper.retrieveEmployeeById(id);
    }

    @Override
    public List<Employee> listAll() {
        return employeeMapper.listEmployees();
    }
}
