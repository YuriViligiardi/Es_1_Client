package it.viligiardi;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("Il client è partito");

        Socket mySocket = new Socket("localhost", 5637); //Creazione Socket del server che andrà in comunicazione con quello del server
        
        System.out.println("Il client si è collegato");
    }
}