/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedb;

/**
 *
 * @author nieznosnybahor
 */
public class Pokemon {

    int number;
    String name;
    String type_1;
    String type_2;
    int valueSTA;
    int valueATT;
    int valueDEF;
    int valueMaxCP;

    public Pokemon(int number, String name, String type_1, String type_2,
                   int valueSTA, int valueATT, int valueDEF, int valueMaxCP) {
        this.number = number;
        this.name = name;
        this.type_1 = type_1;
        this.type_2 = type_2;
        this.valueSTA = valueSTA;
        this.valueATT = valueATT;
        this.valueDEF = valueDEF;
        this.valueMaxCP = valueMaxCP;
    }
    String getInfo()
    {
        String line = number + " " + name + " " + type_1 + " " + type_2 + " "
                    + valueSTA + " " + valueATT + " " + valueDEF + " " + valueMaxCP;
        return line;
    }
}
