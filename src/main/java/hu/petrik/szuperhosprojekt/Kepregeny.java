package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Kepregeny {
    public static ArrayList<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String filePath) throws IOException {
        try (
               BufferedReader br = new BufferedReader(new FileReader(filePath))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String tipus = parts[0];
                int szam = Integer.parseInt(parts[1]);

                if (tipus.equals("Vasember")) {
                    Vasember vasember = new Vasember();
                    for (int i = 0; i < szam; i++) {
                        vasember.kutyutKeszit();
                    }
                    szuperhosLista.add(vasember);
                } else if (tipus.equals("Batman")) {
                    Batman batman = new Batman();
                    for (int i = 0; i < szam; i++) {
                        batman.kutyutKeszit();
                    }
                    szuperhosLista.add(batman);
                }
            }
        }
    }

    public static void szuperhosok() {
        for (Szuperhos szuperhos : szuperhosLista) {
            System.out.println(szuperhos);
        }
    }

    public static void main(String[] args) {
        try {
            szereplok("input.txt"); // Replace with your file path
            szuperhosok();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
