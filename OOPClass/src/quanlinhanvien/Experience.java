package quanlinhanvien;

import java.util.Date;
import java.util.List;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;

    public Experience(String ID, String fullName, String birthDay, int phone, String email, int type, List<Certificate> certificates, int expInYear, String proSkill) {
        super(ID, fullName, birthDay, phone, email, type, certificates);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void showInfo() {

    }
}
