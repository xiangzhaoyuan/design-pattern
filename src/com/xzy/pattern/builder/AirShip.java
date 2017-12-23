package com.xzy.pattern.builder;

/**
 * 表示被构造的复杂对象。
 * Created by Administrator on 2017/12/22.
 */
public class AirShip {

    private OrbitalModule orbitalModule;//轨道舱
    private Engine engine;//引擎
    private EscapeTower EscapeTower;//逃逸塔


    public void lauch(){
        System.out.println("发射...");
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return EscapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        EscapeTower = escapeTower;
    }
}


class OrbitalModule{
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class Engine{
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EscapeTower{
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}