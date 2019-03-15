import inter.Vehicle;

public class FourSStore {

    public Vehicle orderVehicle(String type){

        Vehicle vehicle = StaticVehicleFactory.createVehicle(type);

        if(vehicle != null){
            System.out.println(vehicle.brand()+"\n");
            System.out.println(vehicle.price()+"\n");
            System.out.println(vehicle.oilWear()+"\n");
            System.out.println(vehicle.outputVolumn()+"\n");
            return  vehicle;
        }
        return null;

    }
}
