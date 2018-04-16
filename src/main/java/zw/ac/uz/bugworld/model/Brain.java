package zw.ac.uz.bugworld.model;

import zw.ac.uz.bugworld.enums.BugColor;

import java.util.Set;

public class Brain {
    private BugColor type;
    private String[] instructions;

    Set<Bug> bugs;

    public BugColor getType() {
        return type;
    }

    public void setType(BugColor type) {
        this.type = type;
    }

    public String[] getInstructions() {
        return instructions;
    }

    public void setInstructions(String[] instructions) {
        this.instructions = instructions;
    }

    public Set<Bug> getBugs() {
        return bugs;
    }

    public void setBugs(Set<Bug> bugs) {
        this.bugs = bugs;
    }

}
