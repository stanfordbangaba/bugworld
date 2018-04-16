package zw.ac.uz.bugworld.model;

import java.util.Set;

public class World {
    private String name;
    private int sizeX;
    private int sizeY;
    private Set<Cell> cells;

    public World(String name, int sizeX, int sizeY, Set<Cell> cells) {
        this.name = name;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.cells = cells;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public Set<Cell> getCells() {
        return cells;
    }

    public void setCells(Set<Cell> cells) {
        this.cells = cells;
    }
}
