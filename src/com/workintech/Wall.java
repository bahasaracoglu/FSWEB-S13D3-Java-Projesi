package com.workintech;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width= width<0?0:width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height= height<0?0:height;
    }
    public double getArea () {
        return width*height;
    }

}
