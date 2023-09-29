package com.company;

class employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("salary: "+salary);
    }
    public int getsalary(){return salary;}
    public String getname(){return name;}
    public void setname(String n){name = n;}
    public void setSalary(int n){salary = n;}
}

public class employee_class {
    public static void main(String[] args) {
        System.out.println("creating classes");
        employee mehenaaz= new employee();
        employee sweety= new employee();
        mehenaaz.id=18;
        mehenaaz.name="mehenaaz";
        mehenaaz.salary=5000000;
        sweety.id=17;
        sweety.name="sweety";
        sweety.salary=40000;
        System.out.println(mehenaaz.id);
        System.out.println(mehenaaz.name);
        mehenaaz.printDetails();
        sweety.printDetails();

        int salary=sweety.getsalary();
        System.out.println(salary);

        mehenaaz.setname("chinnu");
        mehenaaz.getname();
        System.out.println(mehenaaz.name);
        sweety.setSalary(600000);
        System.out.println(sweety.getsalary());
    }
}
