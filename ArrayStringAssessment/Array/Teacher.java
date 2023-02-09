class Teacher{

    String teacherName;
    String subject;
    double salary;

    public Teacher(String teacherName, String subject, double salary) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.salary = salary;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}


class Tester {

    public static void main(String[] args){

        Teacher t1 = new Teacher("Alex", "Java Fundamentals", 1200L);
        Teacher t2 = new Teacher("John", "RDBMS", 800L);
        Teacher t3 = new Teacher("Sam", "Networking", 900l);
        Teacher t4 = new Teacher("Maria", "Python", 900L);


        Teacher[] teachers = {t1, t2, t3, t4};

        for (Teacher t : teachers){

            System.out.println("Name : " + t.getTeacherName() + ", Subject : " + t.getSubject() + ", Salary : " + t.getSalary());
        }
    }
}
