/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.ElTest;

import java.util.ArrayList;

/**
 *
 * @author alumne
 */
public class ElTest {

    public static void main(String[] args) {
        // Crear l'ArrayList de preguntes
        ArrayList<Pregunta> preguntes = inicialitzarPreguntes();
        
        // Crear el test passant l'ArrayList
        Test test = new Test(preguntes);


        // 
        // Mentre l'usuari no tria Finalitzar , es pot anar endavant, endarrera, respondre
        // Quan finalitza el test es mostra la seva puntució
        
    }

    public static ArrayList<Pregunta> inicialitzarPreguntes() {
        ArrayList<Pregunta> preguntes = new ArrayList<>();
        
        preguntes.add(new Pregunta("Qui va pintar el Guernica",
                new String[]{"Velàzquez", "Goya", "Picasso"}, 2));
        preguntes.add(new Pregunta("Qui va escriure Alicia al país de les meravelles",
                new String[]{"Grimm", "Stevenson", "Carrol"}, 2));
        preguntes.add(new Pregunta("Quina és la magnitud que relaciona espai i temps",
                new String[]{"velocitat", "temperatura", "pes"}, 0));
        preguntes.add(new Pregunta("Si el radi d'una circumferència és 4, el seu diàmetre és",
                new String[]{"4", "8", "12", "14"}, 1));
        preguntes.add(new Pregunta("Quants segons té 1 hora",
                new String[]{"420", "760", "3600"}, 2));
        preguntes.add(new Pregunta("Quin no és un llenguatge de programació",
                new String[]{"java", "php", "samsung"}, 2));
        preguntes.add(new Pregunta("Dins un termòmetre hi trobem",
                new String[]{"aigua", "aigua amb gas", "mercuri"}, 2));
        preguntes.add(new Pregunta("L'Acropolis es troba a",
                new String[]{"Atenes", "Roma", "París"}, 0));
        preguntes.add(new Pregunta("L'element químic amb símbol Fe és ",
                new String[]{"Estronci", "Ferro", "Feril·li"}, 1));
        preguntes.add(new Pregunta("La capital d'Estats Units és",
                new String[]{"Georgetown", "New York", "Washington"}, 2));
        
        return preguntes;
    }
    
    
}
