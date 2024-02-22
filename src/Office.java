import java.util.ArrayList;
import java.util.List;

class Office {
    private int officeNumber;
    private String officeName;
    private List<String> employeesData;

    public Office(int officeNumber, String officeName){
        this.officeNumber = officeNumber;
        this.officeName = officeName;
        this.employeesData = new ArrayList<>();
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public List<String> getEmployees() {
        return employeesData;
    }

    public boolean addEmployee(String employeeName){
        if (!employeesData.contains(employeeName)){
            employeesData.add(employeeName);
            return true;
        }
        return false;
    }

    public boolean removeEmployee(String employeeName){
        return employeesData.remove(employeeName);
    }

    @Override
    public String toString() {
        return "Office{" +
                "officeNumber=" + officeNumber +
                ", officeName='" + officeName + '\'' +
                ", Employees=" + employeesData +
                '}';
    }
}