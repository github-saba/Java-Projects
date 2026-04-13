/* Singleton pattern - The Vibe: "There can be only one." It ensures a class has just one instance and provides a global access point to it.
   Perfect for things like loggers or database connections where having multiple copies would cause chaos. */

public class DatabaseConnection {
    private static DatabaseConnection instance;

    // Private constructor prevents others from using 'new'
    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
