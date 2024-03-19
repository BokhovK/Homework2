import java.util.Random;
public class Main {
    private static Employee[] EMPLOYEES = new Employee[10];
    private final static Random random = new Random();
    private final static String[] MALE_SURNAME = {"Иванов", "Пишпищук", "Муртазалиев", "Перцев", "Водочкин"};
    private final static String[] MALE_NAME = {"Магомед", "Иван", "Матвей", "Евгений", "Алексей"};
    private final static String[] MALE_PATRONYMIC = {"Иванович", "Султанович", "Александрович", "Петрович", "Мустафа"};

    private static Employee generateEmployee() {
        return new Employee(
                MALE_SURNAME[random.nextInt(MALE_SURNAME.length)] + " " +
                        MALE_NAME[random.nextInt(MALE_NAME.length)] + " " +
                        MALE_PATRONYMIC[random.nextInt(MALE_PATRONYMIC.length)],
                random.nextInt(1, 6),
                random.nextInt(45_000, 125_000)

        );
    }

    public static void main(String[] args) {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            EMPLOYEES[i] = generateEmployee();
        }
        System.out.println("Сумма ЗП: " + CalculateSumOfSalary());
        System.out.println("Средняя ЗП: " + CalculateAverageOfSalary());
        System.out.println("Сотрулник с максимальной ЗП: " + findMaxSalary());
        System.out.println("Сотрулник с минимальной ЗП: " + findMinSalary());
        printEmployees();
        printFullNameOfEmployees();
    }


    private static void printEmployees() {
        System.out.println("Сотрудники: ");
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static void printFullNameOfEmployees() {
        System.out.println("ФИО сотрудников: ");
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName());
        }
    }

    private static int CalculateSumOfSalary() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static double CalculateAverageOfSalary() {
        return (double) CalculateSumOfSalary() / EMPLOYEES.length;
    }

    private static Employee findMaxSalary() {
        Employee employeeWithMaxSalary = null;
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : EMPLOYEES) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }
        private static Employee findMinSalary() {
            Employee employeeWithMinSalary = null;
            int minSalary = Integer.MAX_VALUE;
            for (Employee employee : EMPLOYEES) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    employeeWithMinSalary = employee;
                }
            }
            return employeeWithMinSalary;
    }



    }


