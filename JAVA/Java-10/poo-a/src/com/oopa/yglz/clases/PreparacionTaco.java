package com.oopa.yglz.clases;

public class PreparacionTaco {
    private Taco taco;

    public PreparacionTaco(Taco taco) {
        this.taco = taco;
    }

    public void preparar() {
        System.out.println("Preparando el taco de " + taco.getGuisado() + " serán " + taco.getNumeroDeTortilla() + " tortillas de " + taco.getTipoDeTortilla() + " de tamaño " + taco.getTamañoDeTortilla());
    }

    public void vender() {
        System.out.println("Vendiendo el taco de " + taco.getGuisado() + " en tortila de " + taco.getTipoDeTortilla());
    }
}