package PART_3_1;
import java.util.Date;
public abstract class GeometricObject // Abstract Class is Created.
{
    private String color="RED";
    private boolean filled;
    private Date dateCreated;
    protected GeometricObject()
    {
        dateCreated = new java.util.Date();
    }
    protected GeometricObject(String color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "Created on: " + dateCreated + "\ncolor: " + color + "\nfilled: " +filled;
    }
}

