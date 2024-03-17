public class Main {
    public static void main(String[] args) {
        EmployeeBook EmployeeBook = new EmployeeBook();
        EmployeeBook.employees[0] = new Employee("Васильев Иван Григорьевич", 2, 142_000);
        EmployeeBook.employees[1] = new Employee("Алексеев Игорь Мстиславович", 1, 40_000);
        EmployeeBook.employees[2] = new Employee("Антонов Алексей Георгиевич", 1, 41_000);
        EmployeeBook.employees[3] = new Employee("Антипов Егор Николаевич", 3, 28_500);
        EmployeeBook.employees[4] = new Employee("Васильев Платон Сергеевич", 2, 142_000);
        EmployeeBook.employees[5] = new Employee("Сульянов Анатолий Султанович", 2, 112_000);
        EmployeeBook.employees[6] = new Employee("Сахаров Захар Иннокентьевич", 5, 88_500);
        EmployeeBook.employees[7] = new Employee("Землёв Никита Артемович", 4, 18_550);
        EmployeeBook.employees[8] = new Employee("Вадиков Владимир Вадимович", 2, 109_520);
        EmployeeBook.employees[9] = new Employee("Папазогло Сергей Петрович", 5, 23_770);

    }
       EmployeeBook.printEmployee(EmployeeBook.employees);
       EmployeeBook.printListEmployee(EmployeeBook.employees);
       EmployeeBook.totalSalary(EmployeeBook.employees);
       EmployeeBook.minSalary(EmployeeBook.employees);
       EmployeeBook.maxSalary(EmployeeBook.employees);
       EmployeeBook.averageSalary(EmployeeBook.employees);

}
