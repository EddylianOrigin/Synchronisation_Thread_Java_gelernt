package Synchronize_in_Java;

import java.util.ArrayList;
import java.util.List;

class Employee{
    String name ="";
    public int count =0;

    public void employeeName(String name, List<String> list){
        synchronized (this){
            this.name = name;
            count++;  //wie viele Thread ändern employee name.
        }

        list.add(name);
    }
}

class synchronised_block_Test {
    public static void main(String[] args) {
        Employee emp = new Employee();
        List<String> list = new ArrayList<String>();
        emp.employeeName("eddy",list);
        System.out.println(emp.name);
    }
}
