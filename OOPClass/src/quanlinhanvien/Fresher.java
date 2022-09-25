package quanlinhanvien;

import java.util.Date;
import java.util.List;

public class Fresher extends Employee {
    private String Graduation_date;
    private String rank;
    private String Education;

    public Fresher(String ID, String fullName, String birthDay, int phone, String email, int type,List<Certificate> certificates, String graduation_date, String rank, String education) {
        super(ID, fullName, birthDay, phone, email, type, certificates);
        Graduation_date = graduation_date;
        this.rank = rank;
        Education = education;
    }

    public String getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        Graduation_date = graduation_date;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    @Override
    public void showInfo() {

    }
}
