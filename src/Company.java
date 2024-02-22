import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {

    private List<Office> officeList;

    public Company() {
        this.officeList = new ArrayList<>();
    }

    public boolean openOffice(String officeName) {
        int officeNumber = randOfficeNo();
        if (officeNumber != -1) {
            Office office = new Office(officeNumber, officeName);
            officeList.add(office);
            return true;
        }
        return false;
    }

    public Office getOffice(int officeNumber) {
        for (Office office : officeList) {
            if (office.getOfficeNumber() == officeNumber) {
                return office;
            }
        }
        return null;
    }

    public boolean addEmployee(String employeeName, int officeNumber) {
        Office office = getOffice(officeNumber);
        if (office != null) {
            return office.addEmployee(employeeName);
        }
        return false;
    }

    public boolean removeEmployee(String employeeName, int officeNumber) {
        Office office = getOffice(officeNumber);
        if (office != null) {
            return office.removeEmployee(employeeName);
        }
        return false;
    }

    public boolean transferEmployee(String employeeName, int oldOfficeNumber, int newOfficeNumber) {
        Office oldOffice = getOffice(oldOfficeNumber);
        Office newOffice = getOffice(newOfficeNumber);

        if (oldOffice != null && newOffice != null) {
            if (oldOffice.removeEmployee(employeeName)) {
                return newOffice.addEmployee(employeeName);
            }
        }
        return false;
    }

    public void displayOffices() {
        System.out.println("Company Offices:");
        for (Office office : officeList) {
            System.out.println(office);
        }
    }

    private int randOfficeNo() {
        Random random = new Random();
        int officeNo = random.nextInt(900000) + 100000;
        for (Office office : officeList) {
            if (office.getOfficeNumber() == officeNo) {
                return -1;
            }
        }
        return officeNo;
    }
}
