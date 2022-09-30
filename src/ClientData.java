public class ClientData {

    private final String fName;
    private final String lMame;
    private final String mName;
    private final String drivingLicence;

    public ClientData(String fName, String lMame, String mName, String drivingLicence) {
        this.fName = fName;
        this.lMame = lMame;
        this.mName = mName;
        this.drivingLicence = drivingLicence;
    }

    public String getfName() {
        return fName;
    }

    public String getlMame() {
        return lMame;
    }

    public String getmName() {
        return mName;
    }

    public String getDrivingLicence() {
        return drivingLicence;
    }
}
