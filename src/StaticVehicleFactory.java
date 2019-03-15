import car.BMW;
import car.BYD;
import car.Benz;
import car.Volkswagon;
import inter.Vehicle;

public class StaticVehicleFactory {

    public static Vehicle createVehicle(String type) {
        switch (type) {
            case "Benz":
                return new Benz();
            case "BMW":
                return new BMW();
            case "BYD":
                return new BYD();
            case "Volkswagon":
                return new Volkswagon();
        }
        return null;
    }

}
