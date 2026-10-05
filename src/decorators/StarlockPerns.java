package decorators;

import car.KiaCar;

public class StarlockPerns extends AccesoriesDecorator{
    public StarlockPerns(KiaCar car){
        this.car=car;
        description=car.getDescription()+", Pernos de seguridad Starlock ";
    }
    @Override
    public double cost() {
        return 156100+ car.cost();
    }

    @Override
    public String getDescription() {
        return description;
    }
    
}
