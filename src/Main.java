public class Main {
    public static void main(String[] args) {
        DataBaseCompany dataBaseCompany = new DataBaseCompany();
        dataBaseCompany.addEmployee("Иванов Александр Петрович", 3, 31_000);
        dataBaseCompany.addEmployee("Алексеев Игорь Мстиславович", 1, 40_000);
        dataBaseCompany.addEmployee("Антонов Алексей Георгиевич", 1, 41_000);
        dataBaseCompany.addEmployee("Антипов Егор Николаевич", 3, 28_500);
        dataBaseCompany.addEmployee("Васильев Платон Сергеевич", 2, 142_000);
        dataBaseCompany.addEmployee("Сульянов Анатолий Султанович", 2, 112_000);
        dataBaseCompany.addEmployee("Сахаров Захар Иннокентьевич", 5, 88_500);
        dataBaseCompany.addEmployee("Землёв Никита Артемович", 4, 18_550);
        dataBaseCompany.addEmployee("Вадиков Владимир Вадимович", 2, 109_520);
        dataBaseCompany.addEmployee("Папазогло Сергей Петрович", 5, 23_770);


        dataBaseCompany.printAllInformation();

        dataBaseCompany.calculateSalary();

        dataBaseCompany.findMinimalSalaryWorker();

        dataBaseCompany.findHighestSalaryWorker();

        dataBaseCompany.findAverageSalary();

        dataBaseCompany.printAllEmployeesFullNames();

        dataBaseCompany.calculateSalaryOfDepartment(1);

        dataBaseCompany.findAverageSalaryOfDepartment(2);

        dataBaseCompany.indexSalary();
        dataBaseCompany.printAllInformation();

        dataBaseCompany.findMinimalSalaryWorkerOfDepartment(3);

        dataBaseCompany.findHighestSalaryWorkerOfDepartment(4);


        dataBaseCompany.indexSalaryOfDepartment(10, 5);
        dataBaseCompany.printAllInformation();

        dataBaseCompany.printAllInformationOfDepartment(1);


        dataBaseCompany.findWorkersWithSalaryBelowParameter(60_000);

        dataBaseCompany.findWorkersWithSalaryHigherParameter(45_000);
    }
}
