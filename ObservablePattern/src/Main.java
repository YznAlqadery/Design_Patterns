public class Main{

    public static void main(String[] args) {

        // Subject
        NewsPublisher newsPublisher = new NewsPublisher();
        // Observers
        EmailSubscriber emailSubscriber = new EmailSubscriber();
        MobileAppSubscriber mobileAppSubscriber = new MobileAppSubscriber();

        // Attaching Observers to the station
        newsPublisher.attach(emailSubscriber);
        newsPublisher.attach(mobileAppSubscriber);

        newsPublisher.publishArticle("Observer Pattern in Java.");

//        newsPublisher.detach(emailSubscriber);
//        newsPublisher.publishArticle("Hello!");

    }

}