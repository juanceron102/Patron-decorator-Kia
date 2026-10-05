package decorators;

import car.KiaCar;

public class MatSet extends AccesoriesDecorator{
    public MatSet(KiaCar car){
        this.car=car;
        description=car.getDescription()+", Tapete tres piezas alfombra ";
    }
    @Override
    public double cost() {
        return 92000+ car.cost();
    }

    @Override
    public String getDescription() {
        return description;
    }
    
}
