package com.oopa.yglz.mains;

import com.oopa.yglz.clases.PreparacionTaco;
import com.oopa.yglz.clases.Taco;

public class TestTaco {

    public static void main(String[] args) {
        Taco taco1 = new Taco();

        taco1.setGuisado("pollo");
        taco1.setNumeroDeTortilla(2);
        taco1.setTamañoDeTortilla("grande");
        taco1.setTipoDeTortilla("harina");
        taco1.setPrecio(15.5f);

        PreparacionTaco pt = new PreparacionTaco(taco1);

        pt.preparar();
    }
}