public class Student {
    public Student() {
        System.out.println("5543, Jon, 13.09, jon568@gamil.com, street_Baikalska,17");
    }
    public Student(int id) {
        this();
        System.out.println("2");
    }

    public Student(int id, String name, String date, String email, String adress) {
        this();
        System.out.println("2334, Joe, 12.07, joe434@gamil.com, street_Yangel,15");
    }
    public static void main(String[] args) {
        Student student = new Student(2445, "Jon", "02.07", "jon2993@gamil.com", "street_Zaporozkoe,2A");
    }
}
