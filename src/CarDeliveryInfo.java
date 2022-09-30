public class CarDeliveryInfo{
    private String deliveryAddress;
    private int duration;

    public CarDeliveryInfo(String deliveryAddress, int duration) {
        this.deliveryAddress = deliveryAddress;
        this.duration = duration;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
