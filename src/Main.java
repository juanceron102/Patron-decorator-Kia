
import car.GtLine;
import car.KiaCar;
import car.VibrantMt;
import car.ZenithAt;
import car.ZenithMt;
import decorators.BicycleRack;
import decorators.BlackRim14v1;
import decorators.BlackRim14v2;
import decorators.CargoNet;
import decorators.KitOnBottonAlarm;
import decorators.MatSet;
import decorators.MatrixAlarm;
import decorators.ParkingSensor;
import decorators.Rim13;
import decorators.StarlockPerns;
import decorators.TowingHitch;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola bienvenido a Kia Motors");

        //GT Line
        KiaCar gtLine= new GtLine();
        System.out.println(gtLine.getDescription()+"\n$"+gtLine.cost());
        //agregar rines de 14', kit de boton y alarma, tapetes y sensor de parqueo
        gtLine = new BlackRim14v1(gtLine);
        gtLine = new BlackRim14v1(gtLine);
        gtLine = new BlackRim14v2(gtLine);
        gtLine = new BlackRim14v2(gtLine);
        gtLine = new KitOnBottonAlarm(gtLine);
        gtLine = new MatSet(gtLine);
        gtLine = new ParkingSensor(gtLine);
        System.out.println(gtLine.getDescription()+"\n$"+gtLine.cost());

        System.out.println("-----------------------------------------------------");

        //zenithat
        KiaCar zenithat= new ZenithAt();
        System.out.println(zenithat.getDescription()+"\n$"+zenithat.cost());
        //agregar tiro de arraste, alarmas matrix porta bicicletas
        zenithat = new TowingHitch(zenithat);
        zenithat = new MatrixAlarm(zenithat);
        zenithat = new BicycleRack(zenithat);
        System.out.println(zenithat.getDescription()+"\n$"+zenithat.cost());

        System.out.println("-----------------------------------------------------");

        //ZenithMt
        KiaCar zenithmt = new ZenithMt();
        System.out.println(zenithmt.getDescription()+"\n$"+zenithmt.cost());
        //agregar rines de 13 pernos de seguridad mallar de carga, akarma
        zenithmt = new Rim13(zenithmt);
        zenithmt = new StarlockPerns(zenithmt);
        zenithmt = new StarlockPerns(zenithmt);
        zenithmt = new StarlockPerns(zenithmt);
        zenithmt = new StarlockPerns(zenithmt);
        zenithmt = new CargoNet(zenithmt);
        zenithmt = new CargoNet(zenithmt);
        zenithmt = new MatrixAlarm(zenithmt);
        System.out.println(zenithmt.getDescription()+"\n$"+zenithmt.cost());

        System.out.println("-----------------------------------------------------");

        //VibrantMt
        KiaCar vibrant=new VibrantMt();
        System.out.println(vibrant.getDescription()+"\n$"+vibrant.cost());
        //agregar rones portabicicletas. sensor, tiro d arranque, kit boton de encendido
        vibrant = new BlackRim14v1(vibrant);
        vibrant = new BlackRim14v2(vibrant);
        vibrant = new Rim13(vibrant);
        vibrant = new Rim13(vibrant);
        vibrant = new BicycleRack(vibrant);
        vibrant = new TowingHitch(vibrant);
        vibrant = new KitOnBottonAlarm(vibrant);
        System.out.println(vibrant.getDescription()+"\n$"+vibrant.cost());

        
    }
}
