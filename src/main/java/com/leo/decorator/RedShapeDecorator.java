package com.leo.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(shape);
    }

    public void setRedBorder(Shape shape){
        System.out.println("添加红色边框");
    }
}
