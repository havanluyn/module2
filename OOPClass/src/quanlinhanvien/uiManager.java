package quanlinhanvien;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class uiManager {
    private List<Employee> employees;


    public uiManager() {
        this.employees = new ArrayList<>();
    }

    public void insert(Employee employee) {
        employees.add(employee);
        System.out.println(employee);
    }
    public void writeFile(File file, Employee employee){
        try {
            OutputStream os=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(os);
            oos.writeObject(employee);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Employee insertType(int type) {
        Employee employee = null;
        if (type == 0) {
            employee = insertExper();
        } else if (type == 1) {
            employee = insertFresher();
        } else {
            employee = insertIntern();
        }
        return employee;
    }

    private Employee insertExper() {
        int type = 0;
        List<Certificate> certificates = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input ID: ");
        String id = scanner.nextLine();
        System.out.print("Input Name: ");
        String name = scanner.nextLine();
        System.out.print("Input Birthday: ");
        String birthDay = scanner.nextLine();
        System.out.print("Input Phone: ");
        int phone = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input Email: ");
        String email = scanner.nextLine();
        System.out.print("Input certificates: ");
        String cetificate = scanner.nextLine();
        System.out.print("Input certificateID: ");
        String cetificateID = scanner.nextLine();
        System.out.print("Input certificateName: ");
        String cetificateName = scanner.nextLine();
        System.out.print("Input certificateRank: ");
        String cetificateRank = scanner.nextLine();
        System.out.print("Input certificateDate: ");
        String cetificateDate = scanner.nextLine();
        System.out.print("Input inYearEXP: ");
        int inYearExp = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input ProSkill: ");
        String proSkill = scanner.nextLine();

        Certificate certificate = new Certificate(cetificateID, cetificateName, cetificateRank, cetificateDate);
        certificates.add(certificate);
        Employee employee = new Experience(id, name, birthDay, phone, email, type, certificates, inYearExp, proSkill);
        return employee;
    }

    private Employee insertFresher() {
        int type = 1;
        List<Certificate> certificates = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input ID: ");
        String id = scanner.nextLine();
        System.out.print("Input Name: ");
        String name = scanner.nextLine();
        System.out.print("Input Birthday: ");
        String birthDay = scanner.nextLine();
        System.out.print("Input Phone: ");
        int phone = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input Email: ");
        String email = scanner.nextLine();
        System.out.print("Input certificates: ");
        String cetificate = scanner.nextLine();
        System.out.print("Input certificateID: ");
        String cetificateID = scanner.nextLine();
        System.out.print("Input certificateName: ");
        String cetificateName = scanner.nextLine();
        System.out.print("Input certificateRank: ");
        String cetificateRank = scanner.nextLine();
        System.out.print("Input certificateDate: ");
        String cetificateDate = scanner.nextLine();
        System.out.print("Input Graduation_date: ");
        String Graduation_date = scanner.nextLine();
        System.out.print("Input rank: ");
        String rank = scanner.nextLine();
        System.out.print("Input education: ");
        String education = scanner.nextLine();

        Certificate certificate = new Certificate(cetificateID, cetificateName, cetificateRank, cetificateDate);
        certificates.add(certificate);
        Employee employee = new Fresher(id, name, birthDay, phone, email, type, certificates, Graduation_date, rank, education);
        return employee;
    }

    private Employee insertIntern() {
        int type = 2;
        List<Certificate> certificates = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input ID: ");
        String id = scanner.nextLine();
        System.out.print("Input Name: ");
        String name = scanner.nextLine();
        System.out.print("Input Birthday: ");
        String birthDay = scanner.nextLine();
        System.out.print("Input Phone: ");
        int phone = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input Email: ");
        String email = scanner.nextLine();
        System.out.print("Input certificates: ");
        String cetificate = scanner.nextLine();
        System.out.print("Input certificateID: ");
        String cetificateID = scanner.nextLine();
        System.out.print("Input certificateName: ");
        String cetificateName = scanner.nextLine();
        System.out.print("Input certificateRank: ");
        String cetificateRank = scanner.nextLine();
        System.out.print("Input certificateDate: ");
        String cetificateDate = scanner.nextLine();
        System.out.print("Input majors: ");
        String majors = scanner.nextLine();
        System.out.print("Input semester: ");
        int semester = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input University_name: ");
        String universityName = scanner.nextLine();

        Certificate certificate = new Certificate(cetificateID, cetificateName, cetificateRank, cetificateDate);
        certificates.add(certificate);
        Employee employee = new Intern(id, name, birthDay, phone, email, type, certificates, majors, semester, universityName);
        return employee;
    }

    public int findID(String ID) {
        int index = -1;
        for (int i = 0; i < employees.size(); i++) {
            if (ID.equals(employees.get(i).getID())) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void edit(String ID) {
        int index = findID(ID);
        if (index == -1) {
            System.out.println("Không có nhân viên có ID= " + ID);
        } else {
            if (employees.get(index) instanceof Experience) {
                employees.remove(index);
                employees.add(index, insertExper());
                System.out.println(employees.get(index));
            } else if (employees.get(index) instanceof Fresher) {
                employees.remove(index);
                employees.add(index, insertFresher());
                System.out.println(employees.get(index));
            } else {
                employees.remove(index);
                employees.add(index, insertIntern());
                System.out.println(employees.get(index));
            }
        }
    }

    public void Del(String ID) {
        int index = findID(ID);
        if (index == -1) {
            System.out.println("Không có nhân viên có ID= " + ID);
        } else {
            employees.remove(index);
            showAll();
        }
    }

    public void showAll() {
        System.out.println("********* Danh sách nhân viên ********");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }

    public void showExper() {
        System.out.println("*********Danh sách nhân viên là Experience********");
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getType() == 0) {
                System.out.println(employees.get(i));
            }
        }
    }
    public void showFresher() {
        System.out.println("*********Danh sách nhân viên là Experience********");
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getType() == 1) {
                System.out.println(employees.get(i));
            }
        }
    }
    public void showIntern() {
        System.out.println("*********Danh sách nhân viên là Experience********");
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getType() == 2) {
                System.out.println(employees.get(i));
            }
        }
    }
}
