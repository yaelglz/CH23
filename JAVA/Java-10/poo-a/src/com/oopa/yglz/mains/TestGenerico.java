package com.oopa.yglz.mains;

import com.oopa.yglz.clases.ClaseGenerica;

public class TestGenerico {

	public static void main(String[] args) {
		ClaseGenerica <Integer> intObj = new ClaseGenerica<Integer>(55);
		
		ClaseGenerica <String> caracteresObj = new ClaseGenerica<String>("Hey");
		
		intObj.claseTipo();
		caracteresObj.claseTipo();

	}

}
