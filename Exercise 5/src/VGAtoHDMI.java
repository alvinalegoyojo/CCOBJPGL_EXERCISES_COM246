public class VGAtoHDMI implements VGA {
    private HDMI hdmiDevice;
    public VGAtoHDMI(HDMI hdmiDevice) {
        this.hdmiDevice = hdmiDevice;
    }
    
    @Override 
    public void connectVGA(){
        System.out.println("Converting VGA to HDMI...");
        hdmiDevice.connectHDMI();
    }
}