/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedb;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nieznosnybahor
 */
public abstract class Database {

    static List<Pokemon> pokemonArray = new ArrayList<>();                             // <- załadowane wszystkie pokemony jako wzór 
    static List<Pokemon> viewArray = new ArrayList<>();                                // <- załadowany widok widoczny dla usera
    static String Types[] = {"null","normal", "flying", "water", "fire", "grass",
                      "bug", "ghost", "dark", "psychic", "ground",
                      "rock", "steel", "fairy", "ice", "dragon",
                      "poison", "fight", "electro"};
    static String Stats[] = {"mcp", "sta", "att", "def"};
    
    
    static void start() {
        //
    }

    static void loadDatabase() throws IOException {
        InputStream stream = Database.class.getResourceAsStream("db.csv");
        Scanner sc = new Scanner(stream);

        while (sc.hasNext()) 
        {
            String line = sc.nextLine();
            String parts[] = line.split(",");
            
            // 1,Bulbasaur,Grass,Poison,90,118,118,981
            
            int number = Integer.parseInt(parts[0]);
            int sta = Integer.parseInt(parts[4]);
            int att = Integer.parseInt(parts[5]);
            int def = Integer.parseInt(parts[6]);
            int mcp = Integer.parseInt(parts[7]);
            pokemonArray.add(new Pokemon(number, parts[1], parts[2], parts[3], sta, att, def, mcp));
        }
        stream.close();
        
        
    }                                                // Ładowanie bazy z pliku resources

    static void deleteDatabase() {
        pokemonArray.clear();
        if(pokemonArray.isEmpty())
        {
            System.out.println("Clear");
        }
        else
        {
            System.out.println("Something went wrong :(");
        }
                                    }                                              // Usuwa całą bazę danych

    static void clearArray() {
    }

    static void showDatabase() {
    }                                                // Pokazuje całą bazę danych

    static void showDatabaseByType() {
    }                                          // Pokazuje pokemony z danego typu

    static void sortDatabaseByStats() {
    }

    static void showDatabaseByStats() {
    }                                         // 

    static void showDatabaseByName() {
    }

    static void getSelectedPokemon() {
    }

}
