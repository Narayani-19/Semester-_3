class Person {
    String name;

    Person(String n){
        name = n;
    }

    void display(){
        System.out.println("Name : " + name);
    }
}

class Employee extends Person {
    int empid;

    Employee(String n, int id){
        super(n);
        empid = id;
    }

    void display(){
        super.display();
        System.out.println("EmpID : " + empid);
    }
}

class HourlyEmployee extends Employee {
    int rate;
    int hours;

    HourlyEmployee(String n, int id, int r, int h){
        super(n, id);
        rate = r;
        hours = h;
    }

    int getGrossPay(){
        return rate * hours;
    }

    void display(){
        super.display();
        System.out.println("Hourly Rate : " + rate);
        System.out.println("Hours worked : " + hours);
        System.out.println("Gross pay : " + getGrossPay());
    }
}

class Driver7 {
    public static void main(String[] args) {
        HourlyEmployee h = new HourlyEmployee("John Smith", 7569, 100, 2000);
        h.display();
    }
}
