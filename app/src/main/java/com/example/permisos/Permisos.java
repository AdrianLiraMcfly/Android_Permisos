package com.example.permisos;

public class Permisos {
    private String name;
    private boolean granted;

    public void permisos(String name, boolean granted) {
        this.name = name;
        this.granted = granted;
    }

    public String getName() { return name; }

    public boolean isGranted() { return granted; }

    public void setGranted(boolean granted) { this.granted = granted; }
}
