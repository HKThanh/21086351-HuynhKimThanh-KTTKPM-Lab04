package ObserverPattern.src;

public interface ClassMonitorSubject {
    void attach(StudentObserver studentObserver);
    void detach(StudentObserver studentObserver);
    void notifyStudents(String message);
}
