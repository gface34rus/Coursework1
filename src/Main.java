public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Павел", "Александрович", "Никитин", 1, 22400);
        employees[1] = new Employee("Евгений", "Юрьевич", "Романов", 2, 44700);
        employees[2] = new Employee("Кирилл", "Федорович", "Донцов", 3, 78250);
        employees[4] = new Employee("Николай", "Васильевич", "Нелюбов", 4, 45780);
        employees[5] = new Employee("Денис", "Сергеевич", "Прищепа", 5, 68900);
        employees[6] = new Employee("Иван", "Юрьевич", "Пяткин", 1, 98200);
        employees[7] = new Employee("Илья", "Сергеевич", "Сафронов", 2, 75600);
        employees[8] = new Employee("Милана", "Юрьевна", "Елисеева", 3, 98700);
        employees[9] = new Employee("Алевтина", "Ивановна", "Пестерева", 4, 99900);
        printAllEmployees();
        System.out.println("Общая сумма трат на зарплату в месяц - " + calculateTotalSalary());
        System.out.println("Величина средней зарплаты составила - " + calculateAverageSalary());
        System.out.println("Сотрудник с минимальной зарплатой - " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой - " + findEmployeeWithMaxSalary());
        printAllFullNames();
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        double totalSalary = calculateTotalSalary();
        int numEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                numEmployees++;
            }
        }
        return totalSalary / numEmployees;
    }

    public static void printAllFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName(employee));
            }
        }
    }

    public static void indexSalary(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                double currentSalary = employee.getSalary();
                double newSalary = currentSalary * (1 + percent / 100);
                employee.setSalary(newSalary);
            }
        }
    }

    public static Employee findEmployeeWithMinSalaryInDepartment(int department) {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null &&
                    employee.getDepartment() == department &&
                    employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalaryInDepartment(int department) {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null &&
                    employee.getDepartment() == department &&
                    employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateTotalSalaryInDepartment(int department) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static double calculateAverageSalaryInDepartment(int department) {
        double totalSalary = calculateTotalSalaryInDepartment(department);
        int numEmployeesInDepartment = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                numEmployeesInDepartment++;
            }
        }
        return numEmployeesInDepartment > 0 ? totalSalary / numEmployeesInDepartment : 0;
    }

    public static void indexSalaryInDepartment(int department, double percent) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double currentSalary = employee.getSalary();
                double newSalary = currentSalary * (1 + percent / 100);
                employee.setSalary(newSalary);
            }
        }
    }

    public static void printAllEmployeesInDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("id -" + employee.getId() +
                        " ФИО - " + employee.getSurname() + " " + employee.getName() +
                        " " + employee.getPatronymic() + " зарплата - " + employee.getSalary());
            }
        }
    }

    public static void printEmployeesWithSalaryBelow(double threshold) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < threshold) {
                System.out.println("id -" + employee.getId() +
                        " ФИО - " + employee.getSurname() + " " + employee.getName() +
                        " " + employee.getPatronymic() + " зарплата - " + employee.getSalary());
            }
        }
    }

    public static void printEmployeesWithSalaryAboveOrEqual(double threshold) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= threshold) {
                System.out.println("id -" + employee.getId() +
                        " ФИО - " + employee.getSurname() + " " + employee.getName() +
                        " " + employee.getPatronymic() + " зарплата - " + employee.getSalary());
            }
        }
    }
}