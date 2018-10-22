package cn.pppobear.demo.backend.controller;

import cn.pppobear.demo.backend.domain.Employee;
import cn.pppobear.demo.backend.service.IEmployeeService;
import cn.pppobear.demo.backend.vo.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private IEmployeeService employeeService;

    @Autowired
    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("")
    public ModelAndView list() {
        List<Employee> employees = employeeService.listAll();
        ModelAndView modelAndView = new ModelAndView("list_employee");
        modelAndView.addObject("title", "员工列表");
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }

    @GetMapping("/{employeeId}")
    public ModelAndView detail(@PathVariable String employeeId) {
        Employee employee = employeeService.get(employeeId);
        if (employee == null) return new ModelAndView("404");
        ModelAndView modelAndView = new ModelAndView("detail_employee");
        modelAndView.addObject("title", "员工详细信息");
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        Employee employee = new Employee();
        employee.setId(-1L);
        ModelAndView modelAndView = new ModelAndView("detail_employee");
        modelAndView.addObject("employee", employee);
        modelAndView.addObject("title", "创建员工");
        return modelAndView;
    }

    @GetMapping("/delete/{employeeId}")
    public void delete(HttpServletResponse resp, @PathVariable String employeeId) throws IOException {
        employeeService.delete(employeeId);
        resp.sendRedirect("/employee#t-head");
    }

    @PostMapping("")
    public void createUpdate(HttpServletResponse resp, @ModelAttribute EmployeeVO employeeVO) throws IOException {
        Employee employee = new Employee(
                employeeVO.getId(),
                employeeVO.getName(),
                employeeVO.getPassword(),
                employeeVO.getEmail(),
                employeeVO.getAge()
        );
        employeeService.createUpdate(employee);
        resp.sendRedirect("/employee/" + employee.getId());
    }
}
