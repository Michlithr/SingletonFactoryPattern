import units.Unit;
import units.UnitFactory;
import units.UnitType;

public class Main {
    public static void main(String[] argv){

        UnitFactory factory = UnitFactory.getInstance();
        UnitFactory factory2 = UnitFactory.getInstance();

        System.out.println(factory == factory2);

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit rifleman = factory.createUnit(UnitType.RIFLEMAN);

        System.out.println(tank);
        System.out.println(rifleman);

    }
}
