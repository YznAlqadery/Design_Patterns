public class DatabaseCon {

    private static  DatabaseCon intsance;

    private DatabaseCon(){
        System.out.println("Database Connection instantiated");
    }

    public static DatabaseCon getInstance(){
        if (intsance == null){
            synchronized (DatabaseCon.class){
                if (intsance == null){
                    intsance = new DatabaseCon();
                }
            }
        }
        return intsance;
    }

    public void connect(){
        System.out.println("Database connected.");
    }
}
