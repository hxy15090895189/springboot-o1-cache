package com.example.cache.mapper;

import com.example.cache.bean.Employee;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id =#{id}")
    public Employee getEmployee(Integer id);

    @Update("UPDATE employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{did} where id=#{id}")
    public  void updateEmp();

    @Delete("DELETE FROM employee WHERE id=#{id}")
    public void deleteEmpById();

    @Insert("insert ino employee(lastName,email,gender,d_id) values(#{lastName},#{email},#{gender},#{did})")
    public  void  insertEmp();
}
