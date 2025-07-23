public class Main {

    public static void main(String[] args) {

        DatabaseCon databaseCon = DatabaseCon.getInstance();

        DatabaseCon databaseCon1 = DatabaseCon.getInstance();

        databaseCon.connect();
        databaseCon1.connect();

        System.out.println(databaseCon1 == databaseCon);
    }
}