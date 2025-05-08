public class App {
    public static void main(String[] args) {
        // Old HDMI cable
        HDMIPort cable = new HDMIPort();

        // Adapter to make it compatible with VGA port
        VGACable adapter = new VgaToHDMIAdapter(cable);

        // PC (Monitor) uses adapter as if it's a VGA cable
        Monitor pc = new Monitor();
        pc.connect(adapter);
    }
}