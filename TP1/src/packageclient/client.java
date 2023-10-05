package packageclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
        public static void main(String[] args)  {
        	System.out.println("je suis un client pas encore connecté");
        	try {
        	Socket s = new Socket("localhost",1234);
        	//permet de client de connecter un serveur via à son port 
        	
        	System.out.println("je suis connecté au server");
        	//afffichage pour tester le client est ce q'ilà connecter ou pas 
        	int nb ; 
        	//declaration d'un variable de type entier 
        	
        	Scanner scanner = new Scanner(System.in);
        	//permer à l'utilisateur d'entrer un nombre 
        	
        	nb=scanner.nextInt();//permet de lire le nombre entrer par utisateur
        	
        	OutputStream os = s.getOutputStream();
        	//c'est l'objet pour ecrire un nombre et d'envoyer à server
        	
        	InputStream is = s.getInputStream();
        	//c'est l'objet pour lire un nombre envoyer par server
        	
        	os.write(nb);//pour envoyer le nombre à server 
        	
        	int rep = is.read(); //pour lire le resultat envoyer par server 
        	
        	System.out.println("le produit est "+nb+"*5="+rep);
        	
        	s.close(); //permet de fermer le socketserver
  
        	//affichage le resultats
        	}catch (Exception e) {
				e.printStackTrace();
			}	
        }
}

