class Hybrid implements InternalCombustion, Electric {
    
    public void chargebattery() {
        System.out.println("Charging battery");
    }

    public void fillgas() {
        System.err.println("Refueling gas");
    }
}
