import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Subject{

    List<Observer> observers = new ArrayList<>();
    private String article;

    public void publishArticle(String article) {
        this.article = article;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(article);
        }
    }
}
