package model;

import java.math.BigInteger;

public class Response {
    public Coord coord;
    public Weather[] weather;
    public Main main;
    public Wind wind;
    public Clouds clouds;
    public Sys sys;

    public String base;
    public Integer visibility;
    public Long dt;
    public Integer id;
    public String name;
    public Integer cod;
}
