package decorators;
import car.*;

public abstract class AccesoriesDecorator extends KiaCar{
    protected KiaCar car;
    @Override
    public abstract String getDescription();
    
}
