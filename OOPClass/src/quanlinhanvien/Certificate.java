package quanlinhanvien;

import java.util.Date;

public class Certificate {
    private String ID;
    private String certificateName;
    private String certificateRank;
    private String certificatedDate;

    public Certificate(String ID, String certificateName, String certificateRank, String certificatedDate) {
        this.ID = ID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificatedDate = certificatedDate;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public String getCertificatedDate() {
        return certificatedDate;
    }

    public void setCertificatedDate(String certificatedDate) {
        this.certificatedDate = certificatedDate;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "ID='" + ID + '\'' +
                ", certificateName='" + certificateName + '\'' +
                ", certificateRank='" + certificateRank + '\'' +
                ", certificatedDate='" + certificatedDate + '\'' +
                '}';
    }
}
