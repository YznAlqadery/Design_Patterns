public class EmailSubscriber implements Observer{

    @Override
    public void update(String article) {
        System.out.println("Email received new article: " + article);
    }
}
