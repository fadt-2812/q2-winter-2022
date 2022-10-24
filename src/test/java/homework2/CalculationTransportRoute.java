package homework2;

import org.junit.jupiter.api.Test;

public class CalculationTransportRoute {

    @Test
    public void workingWithAuto() {
        TransportRoute autoRigaRezekne = new TransportRoute();

        autoRigaRezekne.setRoute("Rīga - Rezekne");
        autoRigaRezekne.setTransport("Сar ");
        autoRigaRezekne.setTankLitr(40.00);
        autoRigaRezekne.setFuelConsumptionHundredKm(4.50);
        autoRigaRezekne.setDistance(241);
        autoRigaRezekne.setLiterRoute(autoRigaRezekne.getFuelConsumptionHundredKm() * autoRigaRezekne.getDistance() / 100);
        autoRigaRezekne.setKmOneTank(autoRigaRezekne.getTankLitr() * 100 / autoRigaRezekne.getFuelConsumptionHundredKm());
        autoRigaRezekne.setOneTankFuel(autoRigaRezekne.getKmOneTank() > autoRigaRezekne.getDistance());

        System.out.print(autoRigaRezekne.getTransport());
        System.out.print("route: ");
        System.out.print(autoRigaRezekne.getRoute());
        System.out.print(", distance route ");
        System.out.print(autoRigaRezekne.getDistance());
        System.out.println(" km.");
        System.out.print("Fuel consumed per rout: ");
        System.out.print(String.format("%.2f", autoRigaRezekne.getLiterRoute()));
        System.out.println(" liter.");
        System.out.print("Is it possible to drive a route on one tank of fuel?  - ");
        //System.out.println(String.format("%.2f",autoRigaRezekne.getKmOneTank()));   - сколько км можно проехать на одном баке
        //System.out.println(autoRigaRezekne.isOneTankFuel());     -  печать true или false
        if (autoRigaRezekne.isOneTankFuel()==true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        System.out.println();


        TransportRoute autoMoscowVladivostok = new TransportRoute();

        autoMoscowVladivostok.setRoute("Moskva - Vladivostok");
        autoMoscowVladivostok.setTransport("Car");
        autoMoscowVladivostok.setTankLitr(40.00);
        autoMoscowVladivostok.setFuelConsumptionHundredKm(4.50);
        autoMoscowVladivostok.setDistance(9146);
        autoMoscowVladivostok.setLiterRoute(autoMoscowVladivostok.getFuelConsumptionHundredKm() * autoMoscowVladivostok.getDistance() / 100);
        autoMoscowVladivostok.setKmOneTank(autoMoscowVladivostok.getTankLitr() * 100 / autoMoscowVladivostok.getFuelConsumptionHundredKm());
        autoMoscowVladivostok.setOneTankFuel(autoMoscowVladivostok.getKmOneTank() > autoMoscowVladivostok.getDistance());

        System.out.print(autoMoscowVladivostok.getTransport());
        System.out.print(" route: ");
        System.out.print(autoMoscowVladivostok.getRoute());
        System.out.print(", distance route ");
        System.out.print(autoMoscowVladivostok.getDistance());
        System.out.println(" km.");
        System.out.print("Fuel consumed per rout: ");
        System.out.print(String.format("%.2f", autoMoscowVladivostok.getLiterRoute()));
        System.out.println(" liter.");
        System.out.print("Is it possible to drive a route on one tank of fuel?  - ");
        if (autoMoscowVladivostok.isOneTankFuel()==true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println();

        TransportRoute autoViennaKlagenfurt = new TransportRoute();

        autoViennaKlagenfurt.setRoute("Vena - Klagenfurt");
        autoViennaKlagenfurt.setTransport("Car");
        autoViennaKlagenfurt.setTankLitr(40.00);
        autoViennaKlagenfurt.setFuelConsumptionHundredKm(4.50);
        autoViennaKlagenfurt.setDistance(302);
        autoViennaKlagenfurt.setLiterRoute(autoViennaKlagenfurt.getFuelConsumptionHundredKm() * autoViennaKlagenfurt.getDistance() / 100);
        autoViennaKlagenfurt.setKmOneTank(autoViennaKlagenfurt.getTankLitr() * 100 / autoViennaKlagenfurt.getFuelConsumptionHundredKm());
        autoViennaKlagenfurt.setOneTankFuel(autoViennaKlagenfurt.getKmOneTank() > autoViennaKlagenfurt.getDistance());

        System.out.print(autoViennaKlagenfurt.getTransport());
        System.out.print(" route: ");
        System.out.print(autoViennaKlagenfurt.getRoute());
        System.out.print(", distance route ");
        System.out.print(autoViennaKlagenfurt.getDistance());
        System.out.println(" km.");
        System.out.print("Fuel consumed per rout: ");
        System.out.print(String.format("%.2f", autoViennaKlagenfurt.getLiterRoute()));
        System.out.println(" liter.");
        System.out.print("Is it possible to drive a route on one tank of fuel?  - ");
        if (autoViennaKlagenfurt.isOneTankFuel()==true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println();

    }


    @Test
    public void workingWithLocomotive() {

        TransportRoute locomotiveRigaRezekne = new TransportRoute();

        locomotiveRigaRezekne.setRoute("Rīga - Rezekne");
        locomotiveRigaRezekne.setTransport("Locomotive");
        locomotiveRigaRezekne.setTankLitr(6350.00);
        locomotiveRigaRezekne.setFuelConsumptionHundredKm(20.00);
        locomotiveRigaRezekne.setDistance(222);
        locomotiveRigaRezekne.setLiterRoute(locomotiveRigaRezekne.getFuelConsumptionHundredKm() * locomotiveRigaRezekne.getDistance() / 100);
        locomotiveRigaRezekne.setKmOneTank(locomotiveRigaRezekne.getTankLitr() * 100 / locomotiveRigaRezekne.getFuelConsumptionHundredKm());
        locomotiveRigaRezekne.setOneTankFuel(locomotiveRigaRezekne.getKmOneTank() > locomotiveRigaRezekne.getDistance());

        System.out.print(locomotiveRigaRezekne.getTransport());
        System.out.print(" route: ");
        System.out.print(locomotiveRigaRezekne.getRoute());
        System.out.print(", distance route ");
        System.out.print(locomotiveRigaRezekne.getDistance());
        System.out.println(" km.");
        System.out.print("Fuel consumed per rout: ");
        System.out.print(String.format("%.2f", locomotiveRigaRezekne.getLiterRoute()));
        System.out.println(" liter.");
        System.out.print("Is it possible to drive a route on one tank of fuel?  - ");
        if (locomotiveRigaRezekne.isOneTankFuel()==true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println();


        TransportRoute locomotiveMoscowVladivostok = new TransportRoute();

        locomotiveMoscowVladivostok.setRoute("Moskva - Vladivostok");
        locomotiveMoscowVladivostok.setTransport("Locomotive");
        locomotiveMoscowVladivostok.setTankLitr(6350.00);
        locomotiveMoscowVladivostok.setFuelConsumptionHundredKm(20.00);
        locomotiveMoscowVladivostok.setDistance(9260);
        locomotiveMoscowVladivostok.setLiterRoute(locomotiveMoscowVladivostok.getFuelConsumptionHundredKm() * locomotiveMoscowVladivostok.getDistance() / 100);
        locomotiveMoscowVladivostok.setKmOneTank(locomotiveMoscowVladivostok.getTankLitr() * 100 / locomotiveMoscowVladivostok.getFuelConsumptionHundredKm());
        locomotiveMoscowVladivostok.setOneTankFuel(locomotiveMoscowVladivostok.getKmOneTank() > locomotiveMoscowVladivostok.getDistance());

        System.out.print(locomotiveMoscowVladivostok.getTransport());
        System.out.print(" route: ");
        System.out.print(locomotiveMoscowVladivostok.getRoute());
        System.out.print(", distance route ");
        System.out.print(locomotiveMoscowVladivostok.getDistance());
        System.out.println(" km.");
        System.out.print("Fuel consumed per rout: ");
        System.out.print(String.format("%.2f", locomotiveMoscowVladivostok.getLiterRoute()));
        System.out.println(" liter.");
        System.out.print("Is it possible to drive a route on one tank of fuel?  - ");
        if (locomotiveMoscowVladivostok.isOneTankFuel()==true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println();


        TransportRoute locomotiveViennaKlagenfurt = new TransportRoute();

        locomotiveViennaKlagenfurt.setRoute("Vienna - Klagenfurt");
        locomotiveViennaKlagenfurt.setTransport("Locomotive");
        locomotiveViennaKlagenfurt.setTankLitr(6350.00);
        locomotiveViennaKlagenfurt.setFuelConsumptionHundredKm(20.00);
        locomotiveViennaKlagenfurt.setDistance(324);
        locomotiveViennaKlagenfurt.setLiterRoute(locomotiveViennaKlagenfurt.getFuelConsumptionHundredKm() * locomotiveViennaKlagenfurt.getDistance() / 100);
        locomotiveViennaKlagenfurt.setKmOneTank(locomotiveViennaKlagenfurt.getTankLitr() * 100 / locomotiveViennaKlagenfurt.getFuelConsumptionHundredKm());
        locomotiveViennaKlagenfurt.setOneTankFuel(locomotiveViennaKlagenfurt.getKmOneTank() > locomotiveViennaKlagenfurt.getDistance());

        System.out.print(locomotiveViennaKlagenfurt.getTransport());
        System.out.print(" route: ");
        System.out.print(locomotiveViennaKlagenfurt.getRoute());
        System.out.print(", distance route ");
        System.out.print(locomotiveViennaKlagenfurt.getDistance());
        System.out.println(" km.");
        System.out.print("Fuel consumed per rout: ");
        System.out.print(String.format("%.2f", locomotiveViennaKlagenfurt.getLiterRoute()));
        System.out.println(" liter.");
        System.out.print("Is it possible to drive a route on one tank of fuel?  - ");
        if (locomotiveViennaKlagenfurt.isOneTankFuel()==true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println();

         }

         @Test
         public void workingWithAirplane() {

             TransportRoute airplaneRigaRezekne = new TransportRoute();

             airplaneRigaRezekne.setRoute("Rīga - Rezekne");
             airplaneRigaRezekne.setTransport("Airplane");
             airplaneRigaRezekne.setTankLitr(198380.00);
             airplaneRigaRezekne.setFuelConsumptionHundredKm(1983.80);
             airplaneRigaRezekne.setDistance(202);
             airplaneRigaRezekne.setLiterRoute(airplaneRigaRezekne.getFuelConsumptionHundredKm() * airplaneRigaRezekne.getDistance() / 100);
             airplaneRigaRezekne.setKmOneTank(airplaneRigaRezekne.getTankLitr() * 100 / airplaneRigaRezekne.getFuelConsumptionHundredKm());
             airplaneRigaRezekne.setOneTankFuel(airplaneRigaRezekne.getKmOneTank() > airplaneRigaRezekne.getDistance());

             System.out.print(airplaneRigaRezekne.getTransport());
             System.out.print(" route: ");
             System.out.print(airplaneRigaRezekne.getRoute());
             System.out.print(", distance route ");
             System.out.print(airplaneRigaRezekne.getDistance());
             System.out.println(" km.");
             System.out.print("Fuel consumed per rout: ");
             System.out.print(String.format("%.2f", airplaneRigaRezekne.getLiterRoute()));
             System.out.println(" liter.");
             System.out.print("Is it possible to drive a route on one tank of fuel?  - ");
             if (airplaneRigaRezekne.isOneTankFuel()==true) {
                 System.out.println("Yes");
             }
             else {
                 System.out.println("No");
             }
             System.out.println();


             TransportRoute airplaneMoscowVladivostok = new TransportRoute();

             airplaneMoscowVladivostok.setRoute("Moskva - Vladivostok");
             airplaneMoscowVladivostok.setTransport("Airplane");
             airplaneMoscowVladivostok.setTankLitr(198380.00);
             airplaneMoscowVladivostok.setFuelConsumptionHundredKm(1983.80);
             airplaneMoscowVladivostok.setDistance(6422);
             airplaneMoscowVladivostok.setLiterRoute(airplaneMoscowVladivostok.getFuelConsumptionHundredKm() * airplaneMoscowVladivostok.getDistance() / 100);
             airplaneMoscowVladivostok.setKmOneTank(airplaneMoscowVladivostok.getTankLitr() * 100 / airplaneMoscowVladivostok.getFuelConsumptionHundredKm());
             airplaneMoscowVladivostok.setOneTankFuel(airplaneMoscowVladivostok.getKmOneTank() > airplaneMoscowVladivostok.getDistance());

             System.out.print(airplaneMoscowVladivostok.getTransport());
             System.out.print(" route: ");
             System.out.print(airplaneMoscowVladivostok.getRoute());
             System.out.print(", distance route ");
             System.out.print(airplaneMoscowVladivostok.getDistance());
             System.out.println(" km.");
             System.out.print("Fuel consumed per rout: ");
             System.out.print(String.format("%.2f", airplaneMoscowVladivostok.getLiterRoute()));
             System.out.println(" liter.");
             System.out.print("Is it possible to drive a route on one tank of fuel?  - ");
             if (airplaneMoscowVladivostok.isOneTankFuel()==true) {
                 System.out.println("Yes");
             }
             else {
                 System.out.println("No");
             }
             System.out.println();

             TransportRoute airplaneViennaKlagenfurt = new TransportRoute();

             airplaneViennaKlagenfurt.setRoute("Vienna - Klagenfurt");
             airplaneViennaKlagenfurt.setTransport("Airplane");
             airplaneViennaKlagenfurt.setTankLitr(198380.00);
             airplaneViennaKlagenfurt.setFuelConsumptionHundredKm(1983.80);
             airplaneViennaKlagenfurt.setDistance(235);
             airplaneViennaKlagenfurt.setLiterRoute(airplaneViennaKlagenfurt.getFuelConsumptionHundredKm() * airplaneViennaKlagenfurt.getDistance() / 100);
             airplaneViennaKlagenfurt.setKmOneTank(airplaneViennaKlagenfurt.getTankLitr() * 100 / airplaneViennaKlagenfurt.getFuelConsumptionHundredKm());
             airplaneViennaKlagenfurt.setOneTankFuel(airplaneViennaKlagenfurt.getKmOneTank() > airplaneViennaKlagenfurt.getDistance());

             System.out.print(airplaneViennaKlagenfurt.getTransport());
             System.out.print(" route: ");
             System.out.print(airplaneViennaKlagenfurt.getRoute());
             System.out.print(", distance route ");
             System.out.print(airplaneViennaKlagenfurt.getDistance());
             System.out.println(" km.");
             System.out.print("Fuel consumed per rout: ");
             System.out.print(String.format("%.2f", airplaneViennaKlagenfurt.getLiterRoute()));
             System.out.println(" liter.");
             System.out.print("Is it possible to drive a route on one tank of fuel?  - ");
             if (airplaneViennaKlagenfurt.isOneTankFuel()==true) {
                 System.out.println("Yes");
             }
             else {
                 System.out.println("No");
             }
             System.out.println();


         }
}