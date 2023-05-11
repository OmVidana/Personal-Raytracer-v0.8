package com.vro.personalraytracer.objects;

import com.vro.personalraytracer.tools.Vector3D;

import java.awt.*;

public abstract class Object3D implements IsIntersectable {
    private Color color;
    private Vector3D position;

    public Object3D(Vector3D position, Color color) {
        setPosition(position);
        setColor(color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Vector3D getPosition() {
        return position;
    }

    public void setPosition(Vector3D position) {
        this.position = position;
    }

}