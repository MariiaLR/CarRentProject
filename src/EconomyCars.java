public class EconomyCars extends Cars implements PriceInfo {
    @Override
    public void price() {
        System.out.println("Prise 25 $");

    }

    public EconomyCars (String model, String engine, String transmission){
        super.setModel(model);
        super.setEngine(engine);
        super.setTransmission(transmission);



    }

    
}
