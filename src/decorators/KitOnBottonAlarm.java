package decorators;

import car.KiaCar;

public class KitOnBottonAlarm extends AccesoriesDecorator{
    public KitOnBottonAlarm(KiaCar car){
        this.car=car;
        description=car.getDescription()+", Kit boton de encendido + alarma + dos controles tipo disparador ";
    }
    @Override
    public double cost() {
        return 1500000+ car.cost();
    }

    @Override
    public String getDescription() {
        return description;
    }
    
}
