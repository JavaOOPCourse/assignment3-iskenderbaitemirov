public abstract class Service {

    // TODO: declare private fields
    // serviceName
    // serviceId
    // isActive
    private String serviceName;
    private int serviceId;
    private boolean isActive;

    // TODO: constructor
    public Service(String serviceName,int serviceId){
        this.serviceId = serviceId;
        this.isActive = false;
        this.serviceName = serviceName;
    };

    // TODO: activateService()
    // should set isActive = true
    // print activation message
    public void activateService(){
        isActive = true;
        System.out.println("activated: " +serviceName);
    }

    // TODO: deactivateService()
    // should set isActive = false
    // print deactivation message
    public void deactivateService(){
        isActive = false;
        System.out.println("deactivated: " +serviceName);
    }

    // TODO: getter for serviceName
    public String getServiceName() {
        return serviceName;
    }

    // TODO: getter for isActive
    public boolean isActive() {
        return isActive;
    }

    // TODO: abstract method performService()
    public abstract void performService();
}