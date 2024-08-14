public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.removeEmployee(2);
        employeeBook.printAllEmployees();
        System.out.println("Общая сумма трат на зарплату в месяц - " + employeeBook.calculateTotalSalary());
        System.out.println("Величина средней зарплаты составила - " + employeeBook.calculateAverageSalary());
        System.out.println("Сотрудник с минимальной зарплатой - " + employeeBook.findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой - " + employeeBook.findEmployeeWithMaxSalary());
        employeeBook.printAllFullNames();
    }
}