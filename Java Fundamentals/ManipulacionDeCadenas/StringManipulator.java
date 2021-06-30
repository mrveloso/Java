package com.codingdojo.manipulacion;

public class StringManipulator {
	String trimAndConcat(String cadena1, String cadena2) {
		cadena1=cadena1.trim();
		cadena2=cadena2.trim();
		return cadena1+" "+cadena2;
	}
	int getIndexOrNull(String cadena1, char caracter) {
		int indice = cadena1.indexOf(caracter);
		return indice;
	}
	
	int getIndexOrNull(String cadena1, String cadena2) {
		int indice=cadena1.indexOf(cadena2);
		return indice;
	}
	
	String concatSubstring(String cadena1, int inicio, int fin, String cadena2) {
		String subCadena=cadena1.substring(inicio, fin);
		
		return subCadena.concat(cadena2);
	}
}
