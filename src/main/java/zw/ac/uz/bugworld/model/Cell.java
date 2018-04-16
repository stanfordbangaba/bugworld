package zw.ac.uz.bugworld.model;

import zw.ac.uz.bugworld.enums.HomeColor;
import zw.ac.uz.bugworld.iface.CellItem;

import java.util.Set;

public class Cell {
    private int positionX;
    private int positionY;
    private int coordinateX;
    private int coordinateY;
    private boolean homeArea;
    private HomeColor homeColor;
    private boolean foodSource;

    private World world;
    private Set<CellItem> cellItems;

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public boolean isHomeArea() {
        return homeArea;
    }

    public void setHomeArea(boolean homeArea) {
        this.homeArea = homeArea;
    }

    public HomeColor getHomeColor() {
        return homeColor;
    }

    public void setHomeColor(HomeColor homeColor) {
        this.homeColor = homeColor;
    }

    public boolean isFoodSource() {
        return foodSource;
    }

    public void setFoodSource(boolean foodSource) {
        this.foodSource = foodSource;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public Set<CellItem> getCellItems() {
        return cellItems;
    }

    public void setCellItems(Set<CellItem> cellItems) {
        this.cellItems = cellItems;
    }
}
