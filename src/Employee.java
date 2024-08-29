import java.util.Objects;

public class Employee {
    private static int counter = 1;
    private final int id;
    private String name;
    private String patronymic;
    private String surname;
    private double salary;
    private int department;

    public Employee(String name, String patronymic, String surname, int department, double salary) {
        this.id = counter++;
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static String getFullName(Employee employee) {
        return "ФИО-" + employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Double.compare(salary, employee.salary) == 0 &&
                department == employee.department &&
                Objects.equals(name, employee.name) &&
                Objects.equals(patronymic, employee.patronymic) &&
                Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, patronymic, surname, salary, department);
    }

    @Override
    public String toString() {
        return "id-" + id + " ФИО-" + surname +
                " " + name + " " + patronymic + " Отдел-" +
                department + " Зарплата-" + salary;

    }
}
