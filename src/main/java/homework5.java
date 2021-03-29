
public class homework5 {
    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Иванов", "грузчик", "emp1@mail.ru", "1111111", 10000, 21);
        empArray[1] = new Employee("Петров", "дизайнер", "emp2@mail.ru", "2222222", 20000, 32);
        empArray[2] = new Employee("Сидоров", "логист", "emp3@mail.ru", "3333333", 30000, 43);
        empArray[3] = new Employee("Абрамович", "главный бухгалтер", "emp4@mail.ru", "4444444", 40000, 54);
        empArray[4] = new Employee("Казаков", "директор", "emp5@mail.ru", "5555555", 50000, 35);

        System.out.println("все сотрудники:");
        for (int i=0;i< empArray.length;i++){
             System.out.println(empArray[i].toString());}
        System.out.println("сотрудники с возрастом больше 40 лет:");
         //       for (int i=0;i< empArray.length;i++){
           // if (empArray[i].getAge()>40) System.out.println(empArray[i].toString());
        for(Employee employee : empArray){
                if (employee.getAge()>40) System.out.println(employee.toString());


    }
    }
}
