public class Monitor {
    private VGA port;

    public Monitor(VGA port){
        this.port = port;
    }
    public void display(){
        System.out.println("Monitor: Connecting via VGA");
        port.connectVGA();
        System.out.println("Connected.");
    }
}