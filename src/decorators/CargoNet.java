package decorators;

import car.KiaCar;

public class CargoNet extends AccesoriesDecorator{
    public CargoNet(KiaCar car){
        this.car=car;
        description=car.getDescription()+", Malla de carga ";
    }
    @Override
    public double cost() {
        return 110000 + car.cost();
    }

    @Override
    public String getDescription() {
        return description;
    }   
    
}
