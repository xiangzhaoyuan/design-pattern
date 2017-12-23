package com.xzy.pattern.builder;

/**
 * Created by Administrator on 2017/12/22.
 */
public class MyAirShipDirector implements AirShipDirector {

    private AirShipBuilder builder;

    public MyAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip createAirShip() {
        Engine engine = builder.buildEngine();
        EscapeTower escapeTower = builder.buildEscapeTower();
        OrbitalModule orbitalModule = builder.buildOrbitalModule();

        AirShip ship = new AirShip();
        ship.setEngine(engine);
        ship.setEscapeTower(escapeTower);
        ship.setOrbitalModule(orbitalModule);
        return ship;
    }

}
