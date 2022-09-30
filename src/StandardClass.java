public class StandardClass extends Cars implements PriceInfo {

    public StandardClass (String model,String engine, String transmission){
        super.setModel(model);
        super.setEngine(engine);
        super.setTransmission(transmission);

    }

    @Override
    public void price() {
        System.out.println("Prise 50 $");

    }
}
