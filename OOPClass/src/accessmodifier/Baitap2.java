package accessmodifier;

public class Baitap2 {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("Hoan");
        student.setClasses("C07");
        System.out.println(student.name+ " "+student.classes);
    }
    public static class Student{
        private String name="Jonh";
        private String classes="C02";
        public Student(){
        }

        public void setClasses(String classes) {
            this.classes = classes;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
