package ObserverPattern.src;

public class Demo {
    public static void main(String[] args) {

        ClassMonitor classMonitor = new ClassMonitor();

        Student student1 = new Student(1, "Nguyen Van A");
        Student student2 = new Student(2, "Nguyen Van B");
        Student student3 = new Student(3, "Nguyen Van C");

        classMonitor.attach(student1);
        classMonitor.attach(student2);
        classMonitor.attach(student3);

        Clazz clazz = new Clazz("KTPM", classMonitor);

        clazz.thongBao("Thong bao hoc phi");
    }
}
