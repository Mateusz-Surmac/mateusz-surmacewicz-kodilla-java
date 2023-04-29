package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
public class FacadeSearchTest {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private FacadeSearch facadeSearch;
    @Test
    void testEmployeeSearch() throws NotFoundException {
        //Given
        Employee employee = new Employee("Jan","Kowalski");
        employeeDao.save(employee);

        //When
        List<Employee> employeeList = facadeSearch.employeeByNamePart("wal");

        //Then
        assertEquals(1,employeeList.size());

        //Clean up
        employeeDao.delete(employee);
    }
    @Test
    void testCompanySearch() throws NotFoundException {
        //Given
        Company company = new Company("Company");
        companyDao.save(company);

        //When
        List<Company> companyList = facadeSearch.companyByNamePatyList("pan");

        //Then
        assertEquals(1,companyList.size());


        //Clean up
        companyDao.delete(company);

    }
 }

