class Monitor {
    public void connect(VGACable adapter) {
        System.out.println("Monitor expecting VGA input...");
        adapter.connectWithVga();
        System.out.println("Monitor connected to PC.");
    }
}