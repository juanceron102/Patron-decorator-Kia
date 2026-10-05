package decorators;

import car.KiaCar;

public class ParkingSensor extends AccesoriesDecorator{
    public ParkingSensor(KiaCar car){
        this.car=car;
        description=car.getDescription()+", Sensor de parqueo ";
    }
    @Override
    public double cost() {
        return 150000+ car.cost();
    }

    @Override
    public String getDescription() {
        return description;
    }
    
}
