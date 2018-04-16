package zw.ac.uz.bugworld.model;

import zw.ac.uz.bugworld.enums.CellItemType;
import zw.ac.uz.bugworld.iface.CellItem;

public class Marker implements CellItem {

    private Bug bug;

    private Cell cell;

    public Bug getBug() {
        return bug;
    }

    public void setBug(Bug bug) {
        this.bug = bug;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public CellItemType itemType() {
        return CellItemType.MARKER;
    }
}