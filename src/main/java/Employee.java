public class Employee {
    private String FIO;
    private String positionStatus;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;
public Employee(String fio,String positionStatus,String email,String phoneNumber,int salary,int age){
    this.FIO=fio;
    this.positionStatus=positionStatus;
    this.email=email;
    this.phoneNumber=phoneNumber;
    this.salary=salary;
    this.age=age;
}


@Override
public  String toString(){
return "сотрудник(ФИО: " + this.FIO +"; должность: "+ this.positionStatus+ "; email: "+this.email+
        "; телефон: "+this.phoneNumber+ "; зарплата: "+this.salary+ "; возраст: "+this.age + ")";
}

public int getAge(){
    return this.age;
}
    public int getSalary(){
        return this.salary;
    }
 public String getFIO()
 {
     return this.FIO;
 }
    public String getPositionStatus()
    {
        return this.positionStatus;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
}
