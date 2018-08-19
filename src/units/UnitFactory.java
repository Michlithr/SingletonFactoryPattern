package units;

public class UnitFactory{
    private static UnitFactory instance;

    private UnitFactory(){}

    public Unit createUnit(UnitType unitType) {

        switch(unitType){
            case TANK:
                return new Tank(200, 0, 20);
            case RIFLEMAN:
                return new Rifleman(50, 0, 10);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }

    public static UnitFactory getInstance(){
        if(instance == null) {
            synchronized (UnitFactory.class){
                if(instance == null)
                    instance = new UnitFactory();
            }
        }
        return instance;
    }
}

