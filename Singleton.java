// The singleton pattern is a design pattern that restricts a class to one object. 
// It can be useful when only one object is needed to coordinate/save state/actions across the application 
// It seems like the term comes from mathematics - the concept of a singleton.
// The singleton class can be for example UserAuthentication and can be used across the application to authenticate the user.
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // methods etc. for the instance
}
