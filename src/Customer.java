public class Customer extends User {
    // TODO: constructor
    public Customer(String n , int i){
        super(n,i);
    }

    // TODO:
    // print that customer cannot manage services
    @Override
    public void manageService(Service s) {
        System.out.println("Customer " + getName() + " cannot manage services: " + s.getServiceName());
    }

    @Override
    public void useService(Service s) {
        // TODO:
        // print customer using message
        // call performService()
        System.out.println("Customer " + getName() + " uses: " + s.getServiceName());
        if (!s.isActive()) {
            System.out.println("error Service is inactive");
            return;
        }
        s.performService();
    }
}