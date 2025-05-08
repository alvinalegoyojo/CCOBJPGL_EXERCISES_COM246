                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
public class App {
    public static void main(String[] args) throws Exception {

            HDMI pc = new HDMI();
            VGA adapter = new VGAtoHDMI(pc);
            Monitor monitor = new Monitor(adapter);
            
            monitor.display();
    }
        }