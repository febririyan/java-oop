package programmer.zaman.now.application;

import programmer.zaman.now.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Orembi");

        Company.Employee employee = company.new Employee();
        employee.setName("Febry");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("PT Sinar Aja");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Riyan");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
