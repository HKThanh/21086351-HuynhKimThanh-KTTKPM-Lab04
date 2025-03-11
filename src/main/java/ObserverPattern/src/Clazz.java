package ObserverPattern.src;

public class Clazz {
    private String tenLop;
    private ClassMonitor classMonitor;

    public Clazz(String tenLop, ClassMonitor classMonitor) {
        this.tenLop = tenLop;
        this.classMonitor = classMonitor;
    }

    public void thongBao(String message) {
        System.out.println("Thông báo từ lớp trưởng " + tenLop + ": " + message);
        classMonitor.notifyStudents(message);
    }
}
