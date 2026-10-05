package car;

public abstract  class KiaCar {
    protected String description="";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
