public class MobileAppSubscriber implements Observer{

    @Override
    public void update(String article) {
        System.out.println("Mobile app shows new article: " + article);
    }
}
