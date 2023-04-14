package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FacadeSearch {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    List<Company> companyByNamePatyList(final String namePart) throws NotFoundException{
        List<Company> companyList = companyDao.namePart("%" + namePart + "%");
        if (companyList.isEmpty()) {
            throw new NotFoundException("Company not found");
        }
        return companyList;
    }
    List<Employee> employeeByNamePart(final String lastNamePart) throws NotFoundException{
        List<Employee> employeeList = employeeDao.lastNamePart("%" + lastNamePart + "%");
        if (employeeList.isEmpty()) {
            throw new NotFoundException("Employee not found");
        }
        return employeeList;
    }

}
