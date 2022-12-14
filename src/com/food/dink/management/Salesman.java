package com.food.dink.management;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Salesman extends Employee implements IEvaluate {
    public Salesman() {
    }

    public Salesman(String name, String address, Date dateOfBirth, Account account, int salary) {
        super(name, address, dateOfBirth, account, salary);
    }

    @Override
    public String toString() {
        return "Salesman [name='" + name + "', address='" + address + "', dateOfBirth='"
                + new SimpleDateFormat("dd-MM-yyyy").format(dateOfBirth) + "', salary='" + salary + "']";
    }

    @Override
    public String evaluate(BillList billList) {
        int counterBill = billList.counterBill(getAccount().getId(), new Date());
        if (counterBill > 3000)
            return "Nhân viên xuất sắc.";
        else if (counterBill > 2000)
            return "Nhân viên tốt.";
        else if (counterBill > 1000)
            return "Nhân viên đạt yêu cầu.";
        else
            return "Nhân viên chưa đạt yêu cầu.";
    }

    public double netSalary(BillList billList) {
        int counterBill = billList.counterBill(getAccount().getId(), new Date());
        double netSalary = salary * (1 - (0.08 + 0.015 + 0.01) + 0.0001 * counterBill);
        return netSalary;
    }
}
