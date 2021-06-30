package com.codingdojo.manipulacion;

public class Test {

	public static void main(String[] args) {
		StringManipulator manipulator = new StringManipulator();
		String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
		System.out.println(str); // HolaMundo 
		
		System.out.println("***********************");
		
		char letter = 'n';
		int a = manipulator.getIndexOrNull("Coding", letter);
		int b = manipulator.getIndexOrNull("Hola Mundo", letter);
		int c = manipulator.getIndexOrNull("Saludar", letter);
		System.out.println(a); // 4
		System.out.println(b); // 7
		System.out.println(c); // -1
		
		System.out.println("***********************");
		
		String word = "Fernando";
		String subString = "nan";
		String notSubString = "mundo";
		int d = manipulator.getIndexOrNull(word, subString);
		int e = manipulator.getIndexOrNull(word, notSubString);
		System.out.println(d); // 2
		System.out.println(e); // -1
		
		System.out.println("***********************");
		
		String word2 = manipulator.concatSubstring("Hola", 2, 4, "mundo");
		System.out.println(word2); // olmundo
	}

}
