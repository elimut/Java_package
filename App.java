import monpackage.Test;
// import de la classe Test du package monpackage
import com.anneSo.Popit;
import java.util.Scanner;
// import de la classe Ppopit du package com\anneSo

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App{
    public static String name = "anneso";
    public static String salut = "bonjour";
    public static String firstName = "v";
    public static void main(String[] args){
        Test ts = new Test("voici mon test");
        System.out.println(ts);
        // affiche thread, espace alloué à var: Test@2f92e0f4
        Popit ts1 = new Popit("Voici un autre test");
        System.out.println(ts1);
        System.out.println("3"+3);
        // convertit en chaîne de caractères
        System.out.println(3+3);
        // additionne
        // Tout cela prend de la mémoire, cela est coûteux
        System.out.println(salut.concat(name).concat(firstName));
        // moins coûteux en mémoire car les variables sont définies dès le départ
    
        Scanner scanner = new Scanner(System.in);
        int reponse = scanner.nextInt();
        // attente d'un entier, si l'on a en saisie chaîne de caractères: exceptions => catch, sopit on gère ou non les exceptions. Gestion des exceptions => espace mémoire en plus.
        System.out.println(reponse);
        scanner.close();
        // il existe une méthode qui ne traite que des chaînes de caractères, avec optimisation de la mémoire: dans java.io.BufferedReader => si saisie d'un entier convertira en chaîne de caractères.
    
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        // lit ce qu'entre l'user ainsi que d'autres sources: fichier, usb... Il faut importer également import java.io.InputStreamReader, clavier
        System.out.println(br);
    }
}
/*
 * BuffererdReader, synchrone attente fin exécution pour suite programme, contrairement à scanner qui est asynchrone.
 * BufferedReader = thread-safe (mémoire saine), pas de parsing
 * scanner => lecture de données et possibilité parsing
 */