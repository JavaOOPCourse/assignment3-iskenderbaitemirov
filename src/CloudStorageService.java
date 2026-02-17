public class CloudStorageService
extends Service
implements PremiumFeature, Billable {

    // TODO: declare premium field
    private boolean premium;
    private double storageSize;
    private double rate;

    // TODO: constructor
    public CloudStorageService(String name, int id){
        super(name,id);
        premium =false;
        storageSize = 0;
    }

    @Override
    public void performService() {
        if(!isActive()){
            System.out.println("error, not active");
        }
        else{
            System.out.println("cloud access granted,default storage size");
            storageSize =5;
        }
        // TODO:
        // check if active
        // print cloud access message

    }

    @Override
    public void upgradeToPremium() {
        if(isActive() && storageSize==5 && rate>0){
            premium = true;
            storageSize = 20;
            rate *= 2.5;
            System.out.println("premium added");
            return;
        }
        System.out.println("error premium not granted");
        // TODO:
        // enable premium
        // print message
    }

    @Override
    public void generateBill() {
        if(isActive() && storageSize>0 && rate>0){
            System.out.println("cloudService:"+getServiceName()+"\nsum = "+storageSize*rate);
            return;
        }
        System.out.println("error occurred");
        // TODO:
        // print billing message

    }
}