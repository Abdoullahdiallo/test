package serveurpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serveur {
   
	public static void main(String[] args)  {
		try {
		
		ServerSocket ss = new ServerSocket(1234);
		
		//permet de reserver une port pour un client qui veut  connecter à server
		
		Socket s = ss.accept();
		//permet d'acccepter un client qui veut connecter
		System.out.println("un client est connecté");
		
		OutputStream os = s.getOutputStream();
		//c'est l'objet pour ecrire un nombre et d'envoyer à client
		
		InputStream is = s.getInputStream();
		//c'est l'objet pour lire un nombre envoyer par client
		
		int nb = is.read();
		//permet de lire le nombre envoyer par le client
		
		int rep = nb*5; 
		//permet de calculer le nb mulitplié par 5 et  stocker dans une variable
		
		os.write(rep);
		//permet d'ecrire le resultats et envoyer à client 
		s.close();//fermé le socket
		
		ss.close();//fermet l'objet de l'accepation 
	
	}catch (Exception e) {
		e.printStackTrace();
	}
}

}

