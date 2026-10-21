
package com.mycompany.ejercicios;
import java.util.Scanner;


/**
 *
 * @author jessi
 */
public class brindarinformacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre de un artista, película, serie u otro tema: ");
        String tema = scanner.nextLine();

        tema = tema.toLowerCase();

        String info;

        switch (tema) {
            case "shakira":
                info = "Shakira es una cantante colombiana reconocida mundialmente por su estilo único y su éxito 'Hips Don't Lie'.";
                break;
            case "the matrix":
                info = "The Matrix es una película de ciencia ficción estrenada en 1999, dirigida por las hermanas Wachowski.";
                break;
            case "friends":
                info = "Friends es una serie de televisión estadounidense emitida entre 1994 y 2004, considerada una de las más populares de la historia.";
                break;
            case "bad bunny":
                info = "Bad Bunny es un cantante y rapero puertorriqueño, pionero del trap latino y reguetón moderno.";
                break;
            case "avatar":
                info = "Avatar es una película dirigida por James Cameron en 2009, famosa por sus innovadores efectos visuales.";
                break;
            default:
                info = "No tengo información registrada sobre ese tema.";
        }

        System.out.println(info);

        scanner.close();
    }
}
