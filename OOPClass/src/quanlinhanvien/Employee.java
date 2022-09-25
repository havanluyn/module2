package quanlinhanvien;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Employee {
    private String ID;
    private String fullName;
    private String birthDay;
    private int Phone;
    private String Email;
    private int type;
    private int count;
    private List<Certificate> certificates;
    public abstract  void showInfo();

    public Employee() {
    }

    public Employee(String ID, String fullName, String birthDay, int
            phone, String email, int type,List<Certificate> certificates) {
        this.ID = ID;
        this.fullName = fullName;
        this.birthDay = birthDay;
        Phone = phone;
        Email = email;
        this.type = type;
        this.count ++;
        this.certificates = certificates;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID='" + ID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", Phone=" + Phone +
                ", Email='" + Email + '\'' +
                ", type=" + type +
                ", count=" + count +
                ", certificates=" + certificates +
                '}';
    }
}
