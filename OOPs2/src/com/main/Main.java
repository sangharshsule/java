package com.main;

import com.animal.Animal;

public class Main {
	public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "Lion";
        a1.species = "Panthera leo";
        a1.habitat = "Savannah";
        a1.age = 8;
        a1.weight = 190.5;

        Animal a2 = new Animal();
        a2.name = "Elephant";
        a2.species = "African Elephant";
        a2.habitat = "Forest";
        a2.age = 25;
        a2.weight = 5400.0;

        Animal a3 = new Animal();
        a3.name = "Tiger";
        a3.species = "Bengal Tiger";
        a3.habitat = "Jungle";
        a3.age = 6;
        a3.weight = 220.4;

        Animal a4 = new Animal();
        a4.name = "Dog";
        a4.species = "Labrador";
        a4.habitat = "Household";
        a4.age = 4;
        a4.weight = 28.3;

        Animal a5 = new Animal();
        a5.name = "Cat";
        a5.species = "Persian";
        a5.habitat = "Household";
        a5.age = 3;
        a5.weight = 4.5;
        
        
        System.out.println("\n--- All Animal Entries ---");
        System.out.println("Animal 1: " + a1.name + ", " + a1.species + ", " + a1.habitat + ", " + a1.age + ", " + a1.weight);
        System.out.println("Animal 2: " + a2.name + ", " + a2.species + ", " + a2.habitat + ", " + a2.age + ", " + a2.weight);
        System.out.println("Animal 3: " + a3.name + ", " + a3.species + ", " + a3.habitat + ", " + a3.age + ", " + a3.weight);
        System.out.println("Animal 4: " + a4.name + ", " + a4.species + ", " + a4.habitat + ", " + a4.age + ", " + a4.weight);
        System.out.println("Animal 5: " + a5.name + ", " + a5.species + ", " + a5.habitat + ", " + a5.age + ", " + a5.weight);
	}

}
