package decorators;

import car.KiaCar;

public class MatrixAlarm extends AccesoriesDecorator{
    public MatrixAlarm(KiaCar car){
        this.car=car;
        description=car.getDescription()+", 2 controles alarmas matrix general ";
    }
    @Override
    public double cost() {
        return 110000+ car.cost();
    }

    @Override
    public String getDescription() {
        return description;
    }
    
}
