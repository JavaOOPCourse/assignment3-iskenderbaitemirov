public abstract class User {
    // TODO: declare fields
    // name
    // id
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    // TODO: constructor
    public User(String n, int id){
        name = n;
        this.id = id;
    }

    // TODO: abstract method manageService(Service s)
    public abstract void manageService(Service s);

    // TODO: abstract method useService(Service s)
    public abstract void useService(Service s);
}