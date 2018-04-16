package zw.ac.uz.bugworld.model;

import zw.ac.uz.bugworld.enums.CellItemType;
import zw.ac.uz.bugworld.iface.CellItem;

public class FoodParticle implements CellItem {

    private Bug bug;
    private boolean carried;

    public boolean isCarried() {
        return carried;
    }

    public void setCarried(boolean carried) {
        this.carried = carried;
    }

    public CellItemType itemType() {
        return CellItemType.FOOD_PARTICLE;
    }
}