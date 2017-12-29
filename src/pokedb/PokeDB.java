/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedb;

import java.io.IOException;

/**
 *
 * @author admin
 */
public class PokeDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Database.loadDatabase();
        Database.start();
        Frame frame = new Frame();
        frame.setVisible(true);
    }
}
