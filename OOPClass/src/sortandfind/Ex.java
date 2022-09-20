package sortandfind;

public class Ex {
    public static void main(String[] args) {
        Student s1 = new Student("Hoan", 20, "28 Điện Biên Phủ", 9.0f, "Quốc Học");
        Student s2 = new Student("Luyn", 40, "29 Điện Biên Phủ", 7.0f, "Quốc Học");
        Student s3 = new Student("Dung", 10, "28 Điện Biên Phủ", 5.0f, "HBT");
        Student s4 = new Student("Cuong", 27, "58 Điện Biên Phủ", 10.0f, "Quốc Học");
        Student s5 = new Student("Loi", 20, "98 Điện Biên Phủ", 9.0f, "Nguyễn Huệ");
        Student[] student = {s1, s2, s3, s4, s5};
        Student[] student1 = new Student[3];
        student1 = searchMaxThreeByPoint(student, 3);
        System.out.println(student1[0].showInfo());
        System.out.println(student1[1].showInfo());
        System.out.println(student1[2].showInfo());

    }

    public static Student[] searchMaxThreeByPoint(Student[] array, int sl) {
        Student[] maxstudent = new Student[3];
        maxstudent[0] = new Student("", 20, "28 Điện Biên Phủ", 9.0f, "Quốc Học");
        maxstudent[1] = new Student("", 20, "28 Điện Biên Phủ", 9.0f, "Quốc Học");
        maxstudent[2] = new Student("", 20, "28 Điện Biên Phủ", 9.0f, "Quốc Học");
        int i = 0;
        while (i < sl) {
            double max = -1;
            int index = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j].getPoint() >= max) {
                    int check = 0;
                    for (int k = 0; k < maxstudent.length; k++) {
                        if (array[j].getFullName().equals(maxstudent[k].getFullName())) {
                            check++;
                            break;
                        }
                    }
                    if (check == 0) {
                        max = array[j].getPoint();
                        index = j;
                    }
                }

            }
            maxstudent[i] = array[index];
            i++;
        }
        return maxstudent;
    }
}