package com.company;
import OOPhomework.*;
import OOPhomeworkEmployee.ContractEmployee;
import OOPhomeworkEmployee.Employee;
import OOPhomeworkEmployee.SalariedEmloyee;

import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.doclint.Entity.or;

public class Main {

    public static void main(String[] args) throws IOException {
        SalariedEmloyee salariedEmpoyee1 = new SalariedEmloyee(
                "SE-01", "Ivan Ivanovych");
        ContractEmployee contractEmployee1 = new ContractEmployee(
                "CE-01", "Vasyl Petrovuch");
        SalariedEmloyee salariedEmloyee2 = new SalariedEmloyee(
                "SE-02", "Sergiy Orestovych");
        ContractEmployee contractEmployee2 = new ContractEmployee(
                "CE-02", "Pavlo Ilegovych");

        List<Employee>employeeList = new ArrayList<>();
        employeeList.add(salariedEmpoyee1);
        employeeList.add(salariedEmloyee2);
        employeeList.add(contractEmployee1);
        employeeList.add(contractEmployee2);



    }
}
