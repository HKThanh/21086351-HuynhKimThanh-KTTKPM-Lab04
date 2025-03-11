package ObserverPattern.src;

import java.util.ArrayList;
import java.util.List;

public class ClassMonitor implements ClassMonitorSubject{
    private final List<StudentObserver> observerList = new ArrayList<>();

    @Override
    public void attach(StudentObserver studentObserver) {
        observerList.add(studentObserver);
    }

    @Override
    public void detach(StudentObserver studentObserver) {
        observerList.remove(studentObserver);
    }

    @Override
    public void notifyStudents(String message) {
        for(StudentObserver studentObserver : observerList) {
            studentObserver.update(message);
        }
    }
}
