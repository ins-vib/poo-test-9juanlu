package org.yourcompany.ElTest;

import java.util.ArrayList;

public class Test {

    private ArrayList<Pregunta> preguntes = new ArrayList<>();
    private int[] respostes;
    private int posicio = 0;

    public Test(ArrayList<Pregunta> preguntes) {
        this.preguntes = preguntes;
        this.respostes = new int[preguntes.size()];
        
        for (int i = 0; i < respostes.length; i++) {
            respostes[i] = -1;
        }
    }

    public String getEnunciatPreguntaActual() {
        return preguntes.get(posicio).getEnunciat();
    }

    public String[] getRespostesPreguntaActual() {
        return preguntes.get(posicio).getRespostes();
    }

    public int getNumeroPregunta() {
        return posicio + 1;
    }

    public void respondre(int resposta) {
        respostes[posicio] = resposta;
    }

    public boolean anarEndavant() {
        if (posicio < preguntes.size() - 1) {
            posicio++;
            return true;
        }
        return false;
    }

    public boolean anarEndarrera() {
        if (posicio > 0) {
            posicio--;
            return true;
        }
        return false;
    }

    public double solucionarTest() {
        int correctes = 0;
        for (int i = 0; i < preguntes.size(); i++) {
            if (respostes[i] == preguntes.get(i).getCorrecta()) {
                correctes++;
            }
        }
        return (double) correctes / preguntes.size() * 100;
    }
}
