/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Library;
import view.Menu;

/**
 *
 * @author MSII
 */
public class Manager extends Menu<String> {

    private final Library library;

    public Manager() {
        super("Main Menu", new String[]{"Create New Account", "login System", "Exit"});
        library = new Library(); 
    }

    @Override
    public void execute(int n) {
        
        switch (n) {
            case 1:
                library.createNewAccount();
                break;
            case 2:
                library.loginSystem();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

}
