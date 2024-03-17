import java.util.Arrays;

public  class EmployeeBook  extends Employee {
    public static Employee employees[] = new Employee[10];

    public void setPersons() {
        employees[0] = new Employee("Васильев Иван Григорьевич", 2, 142_000);
        employees[1] = new Employee("Алексеев Игорь Мстиславович", 1, 40_000);
        employees[2] = new Employee("Антонов Алексей Георгиевич", 1, 41_000);
        employees[3] = new Employee("Антипов Егор Николаевич", 3, 28_500);
        employees[4] = new Employee("Васильев Платон Сергеевич", 2, 142_000);
        employees[5] = new Employee("Сульянов Анатолий Султанович", 2, 112_000);
        employees[6] = new Employee("Сахаров Захар Иннокентьевич", 5, 88_500);
        employees[7] = new Employee("Землёв Никита Артемович", 4, 18_550);
        employees[8] = new Employee("Вадиков Владимир Вадимович", 2, 109_520);
        employees[9] = new Employee("Папазогло Сергей Петрович", 5, 23_770);
        public static void printEmployee(Employee[] employee) {
            for (Employee employee1 : employee) {
                if (employee1 != null) {
                    System.out.println(employee1.toString());
                }
            }
        }
        //метод для получения списка сотрудников в формате Ф.И.О.
        public static void printListEmployee(Employee[] employee) {
            for (Employee employee1 : employee) {
                if (employee1 != null) {
                    System.out.println(employee1.getEmployeeName());
                }
            }
        }



        //сумма затрат за месяц
        public static void totalSalary(Employee[] employee) {
            int totalSalary = 0;
            for (Employee sal :
                    employee) {
                totalSalary += sal.getSalary();
            }
            System.out.println("Сумма затрат на заработаную плату: " +
                    totalSalary);
        }

        //Минимальная зарплата
        public static void minSalary(Employee[] employee) {
            int minSalary = Integer.MAX_VALUE;
            String minSalaryEmployee = "";
            for (Employee i :
                    employee) {
                if (i.getSalary() < minSalary)
                    minSalary = i.getSalary();
                if (minSalary == i.getSalary()) {
                    minSalaryEmployee = i.getEmployeeName();
                }
            }
            System.out.println("Минимальная зарплата в " + minSalary + " рублей, у сотрудника - " +
                    minSalaryEmployee);
        }

        //    Максимальная зарплата
        public static void maxSalary(Employee[] employee) {
            int maxSalary = Integer.MIN_VALUE;
            String maxSalaryEmployee = "";
            for (Employee i :
                    employee) {
                if (i.getSalary() > maxSalary)
                    maxSalary = i.getSalary();
                if (maxSalary == i.getSalary()) {
                    maxSalaryEmployee = i.getEmployeeName();
                }
            }
            System.out.println("Максимальная зарплата: " + maxSalary + " рублей, у сотрудника " + maxSalaryEmployee);
        }

        public static void averageSalary(Employee[] employee) {
            int averSalary = 0;
            for (Employee sal :
                    employee) {
                averSalary += sal.getSalary();
            }
            averSalary /= employee.length;
            System.out.println("Среднее значение зарплат составила " + averSalary);
        }




    }
}