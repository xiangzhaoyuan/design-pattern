package com.xzy.pattern.builder;

/**
 * Created by Administrator on 2017/12/22.
 */
public class Client {

    public static void main(String[] args) {
        AirShipDirector director = new MyAirShipDirector(new MyAirShipBuilder());
        AirShip airShip = director.createAirShip();
        //System.out.println(airShip.getEngine().getName());
        //System.out.println(airShip.getOrbitalModule().getName());
        //System.out.println(airShip.getEscapeTower().getName());
        airShip.lauch();
    }

}
