package homework2;

public class TransportRoute {

    private String transport;
    private String route;
    private int distance;
    private double tankLitr;
    private double fuelConsumptionHundredKm;
    private double literRoute;
    private double kmOneTank;
    private boolean oneTankFuel;

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getLiterRoute() {
        return literRoute;
    }

    public void setLiterRoute(double literRoute) {
        this.literRoute = literRoute;
    }

    public double getKmOneTank() {
        return kmOneTank;
    }

    public void setKmOneTank(double kmOneTank) {
        this.kmOneTank = kmOneTank;
    }

    public double getTankLitr() {
        return tankLitr;
    }

    public void setTankLitr(double tankLitr) {
        this.tankLitr = tankLitr;
    }

    public double getFuelConsumptionHundredKm() {
        return fuelConsumptionHundredKm;
    }

    public void setFuelConsumptionHundredKm(double fuelConsumptionHundredKm) {
        this.fuelConsumptionHundredKm = fuelConsumptionHundredKm;
    }

    public boolean isOneTankFuel() {
        return oneTankFuel;
    }

    public void setOneTankFuel(boolean oneTankFuel) {
        this.oneTankFuel = oneTankFuel;
    }
}

