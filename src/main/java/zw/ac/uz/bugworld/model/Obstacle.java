package zw.ac.uz.bugworld.model;

import zw.ac.uz.bugworld.enums.CellItemType;
import zw.ac.uz.bugworld.iface.CellItem;

public class Obstacle implements CellItem {

    private Cell cell;

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public CellItemType itemType() {
        return CellItemType.OBSTACLE;
    }
}