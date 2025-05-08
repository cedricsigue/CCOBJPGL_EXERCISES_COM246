class VgaToHDMIAdapter implements VGACable {
    private HDMIPort hdmicable;

    public VgaToHDMIAdapter(HDMIPort hdmicable) {
        this.hdmicable = hdmicable;
    }

    @Override
    public void connectWithVga() {
        System.out.println("Adapting VGA to HDMI...");
        hdmicable.connectWithHDMI();
    }
}