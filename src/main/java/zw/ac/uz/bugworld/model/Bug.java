package zw.ac.uz.bugworld.model;

import zw.ac.uz.bugworld.enums.BugColor;
import zw.ac.uz.bugworld.enums.CellItemType;
import zw.ac.uz.bugworld.iface.CellItem;

import java.util.Set;

public class Bug implements CellItem {
    private int identity;
    private int state;
    private int brainState;
    private BugColor color;
    private int resting;
    private int direction;
    private boolean hasFood;

    private Brain brain;
    private Set<Marker> markers;
    private FoodParticle foodParticle;

    private Cell cell;

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getBrainState() {
        return brainState;
    }

    public void setBrainState(int brainState) {
        this.brainState = brainState;
    }

    public BugColor getColor() {
        return color;
    }

    public void setColor(BugColor color) {
        this.color = color;
    }

    public int getResting() {
        return resting;
    }

    public void setResting(int resting) {
        this.resting = resting;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public boolean isHasFood() {
        return hasFood;
    }

    public void setHasFood(boolean hasFood) {
        this.hasFood = hasFood;
    }

    public Brain getBrain() {
        return brain;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }

    public Set<Marker> getMarkers() {
        return markers;
    }

    public void setMarkers(Set<Marker> markers) {
        this.markers = markers;
    }

    public FoodParticle getFoodParticle() {
        return foodParticle;
    }

    public void setFoodParticle(FoodParticle foodParticle) {
        this.foodParticle = foodParticle;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public CellItemType itemType() {
        return CellItemType.BUG;
    }

    public void sense() {

    }

    public void mark() {

    }

    public void unmark() {

    }

    public void pickup() {

    }

    public void drop() {

    }

    public void turn() {

    }

    public void flip() {

    }

    public void placeAt() {

    }

}
