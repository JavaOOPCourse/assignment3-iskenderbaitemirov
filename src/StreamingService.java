public class StreamingService extends Service implements PremiumFeature {

    // TODO: declare premium field
    private boolean premium;

    // TODO: constructor
    public StreamingService(String name,int id){
        super(name,id);
        premium = false;
    }

    // TODO:
    // check if service is active
    // print different message for premium and normal
    @Override
    public void performService() {
        if(!isActive()){
            System.out.println(("Streaming service: "+getServiceName()+" is inactive"));
        }
        else{
            if (!premium){
                System.out.println("Streaming service: "+getServiceName()+" is active in default mode");
            }
            else{
                System.out.println("Streaming service: "+getServiceName()+" is active in premium mode");
            }
        }
    }

    // TODO:
    // set premium = true
    // print message
    @Override
    public void upgradeToPremium() {
        premium = true;
        System.out.println("upgraded to premium");
    }
}