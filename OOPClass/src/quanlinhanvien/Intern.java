package quanlinhanvien;

import java.util.Date;
import java.util.List;

public class Intern extends Employee{
    private String majors;
    private int semester;
    private String University_name;

    public Intern(String ID, String fullName, String birthDay, int phone, String email, int type, List<Certificate> certificates, String majors, int semester, String university_name) {
        super(ID, fullName, birthDay, phone, email, type, certificates);
        this.majors = majors;
        this.semester = semester;
        University_name = university_name;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String university_name) {
        University_name = university_name;
    }

    @Override
    public void showInfo() {

    }
}
