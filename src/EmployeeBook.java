public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook() {
        employees = new Employee[10];
        employees[0] = new Employee("Павел", "Александрович", "Никитин", 1, 22400);
        employees[1] = new Employee("Евгений", "Юрьевич", "Романов", 2, 44700);
        employees[2] = new Employee("Кирилл", "Федорович", "Донцов", 3, 78250);
        employees[4] = new Employee("Николай", "Васильевич", "Нелюбов", 4, 45780);
        employees[5] = new Employee("Денис", "Сергеевич", "Прищепа", 5, 68900);
        employees[6] = new Employee("Иван", "Юрьевич", "Пяткин", 1, 98200);
        employees[7] = new Employee("Илья", "Сергеевич", "Сафронов", 2, 75600);
        employees[8] = new Employee("Милана", "Юрьевна", "Елисеева", 3, 98700);
        employees[9] = new Employee("Алевтина", "Ивановна", "Пестерева", 4, 99900);
    }

    public void indexSalary(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                double currentSalary = employee.getSalary();
                double newSalary = currentSalary * (1 + percent / 100);
                employee.setSalary(newSalary);
            }
        }
    }

    public void printAllFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName(employee));
            }
        }
    }

    public double calculateAverageSalary() {
        double totalSalary = calculateTotalSalary();
        int numEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                numEmployees++;
            }
        }
        return totalSalary / numEmployees;
    }

    public Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public Employee findEmployeeWithMinSalaryInDepartment(int department) {
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

    public Employee findEmployeeWithMaxSalaryInDepartment(int department) {
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

    public double calculateTotalSalaryInDepartment(int department) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public double calculateAverageSalaryInDepartment(int department) {
        double totalSalary = calculateTotalSalaryInDepartment(department);
        int numEmployeesInDepartment = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                numEmployeesInDepartment++;
            }
        }
        return numEmployeesInDepartment > 0 ? totalSalary / numEmployeesInDepartment : 0;
    }

    public void indexSalaryInDepartment(int department, double percent) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double currentSalary = employee.getSalary();
                double newSalary = currentSalary * (1 + percent / 100);
                employee.setSalary(newSalary);
            }
        }
    }

    public void printAllEmployeesInDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("id -" + employee.getId() +
                        " ФИО - " + employee.getSurname() + " " + employee.getName() +
                        " " + employee.getPatronymic() + " зарплата - " + employee.getSalary());
            }
        }
    }

    public void printEmployeesWithSalaryBelow(double threshold) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < threshold) {
                System.out.println("id -" + employee.getId() +
                        " ФИО - " + employee.getSurname() + " " + employee.getName() +
                        " " + employee.getPatronymic() + " зарплата - " + employee.getSalary());
            }
        }
    }

    public void printEmployeesWithSalaryAboveOrEqual(double threshold) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= threshold) {
                System.out.println("id -" + employee.getId() +
                        " ФИО - " + employee.getSurname() + " " + employee.getName() +
                        " " + employee.getPatronymic() + " зарплата - " + employee.getSalary());
            }
        }
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }
}
