public class ConsultationService
extends Service
implements Billable {

    private int minutesUsed;
    private int rate = 5;

    // TODO: constructor
    public ConsultationService(String name, int id){
        super(name,id);
    }

    // TODO:
    // check active
    // print consultation message
    @Override
    public void performService() {
        if (!isActive()){
            System.out.println("no consultation - not active");
        }else{
            System.out.println("consultation started");
            minutesUsed+=5;
            System.out.println("consultation ended");
        }
    }

    // TODO:
    // print billing message
    @Override
    public void generateBill() {
        if(isActive() && minutesUsed>0 && rate>0){
            System.out.println("sum for all sessions = "+ (minutesUsed*rate));
            return;
        }
        System.out.println("no bill invalid session ,sum = 0");
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }
}