package Desafio1;

public class Main {
    public static void main(String[] args) {
        //Ninja1
        String nomeNinja1 = "Naruto Uzumaki";
        int idade = 18;
        String missao = "encontrar O Bandido";
        String statusDaMissao = "Em Andamento";
        char nivelDaMissao = 'A';

        //Verificar Nivel Da Missão e Idade do ninja
        if(idade < 15){
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D'){
                statusDaMissao = "Concluida";
            } else {
                statusDaMissao = "Não Concluida, Idade não Perimitda";
            }
        } else {
            statusDaMissao = "Concluida";

        }

        System.out.println("-------------------------------------");

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do Ninja: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel Da Missao: " + nivelDaMissao);
        System.out.println("Status Da Missao: " + statusDaMissao);


        //Ninja2
        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 17;
        String missao2 = "Reconhecimento Da Aldeia";
        String statusDaMissao2 = "Em Andamento";
        char nivelDaMissao2 = 'S';

        if(idade2 < 15){
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D'){
                statusDaMissao2 = "Concluida";
            } else {
                statusDaMissao2 = "Não Concluida, Idade não Perimitda";
            }
        } else {
            statusDaMissao2 = "Concluida";

        }
        System.out.println("-------------------------------------");

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do Ninja: " + idade2);
        System.out.println("Missao: " + missao2);
        System.out.println("Status Da Missao: " + statusDaMissao2);
        System.out.println("Nivel Da Missao: " + nivelDaMissao2);


        //Ninja3
        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 14;
        String missao3 = "Curar Feridos";
        String statusDaMissao3 = "Em Andamento";
        char nivelDaMissao3 = 'B';

        if(idade2 < 15){
            if (nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D'){
                statusDaMissao3 = "Concluida";
            } else {
                statusDaMissao3 = "Não Concluida, Idade não Perimitda";
            }
        } else {
            statusDaMissao3 = "Concluida";

        }

        System.out.println("-------------------------------------");

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do Ninja: " + idade3);
        System.out.println("Missão: " + missao3);
        System.out.println("Status Da Missao: " + statusDaMissao3);
        System.out.println("Nivel Da Missao: " + nivelDaMissao3);

        System.out.println("-------------------------------------");
    }
}