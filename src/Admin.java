public class Admin extends User {

    // TODO: constructor
    public Admin(String n, int i){
        super(n,i);
    }

    @Override
    public void manageService(Service s) {

        // TODO:
        // print admin managing message
        System.out.println("Admin: "+getName()+ " manages: "+s.getServiceName());
        if (!s.isActive()) {
            System.out.println("Admin action: activating " + s.getServiceName());
            s.activateService();
        }
        else {
            System.out.println("Admin action: service already active");
        }
    }

    @Override
    public void useService(Service s) {
        // TODO:
        // print admin using message
        // call performService()
        System.out.println("Admin " + getName() + " uses: " + s.getServiceName());
        s.performService();
    }
}