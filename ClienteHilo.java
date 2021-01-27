import java.io.*;
import java.net.*;
import java.util.*;


public class ClienteHilo extends Thread{
	static Socket cliente;
	static ClienteHilo usuarios[] = new ClienteHilo[10];
	int maxUsuarios;
	PrintWriter salida;
	BufferedReader entrada;

	ArrayList <User> arrayUser = new ArrayList<> (nick, pass);

	public ClienteHilo(Socket cliente, ClienteHilo t[]){
		this.cliente = cliente;
		this.usuarios = t;
		this.maxUsuarios = t.length;
	}

	arraySet();

	public void run(){
		int i;
		try{
			salida = new PrintWriter(cliente.getOutputStream(), true);
			entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			String nick, pass;

			do{
			salida.println("Bienvenido al servidor de chat ");
			salida.println("Teclea un nickname: ");
			nick = entrada.readLine();
			salida.println("Teclea tu password: ");
			pass = entrada.readLine();
			}while(login(nick, pass));
			
			for(i=0; i< maxUsuarios;i++){
				if(usuarios[i] != null && usuarios[i] != this){
					usuarios[i].salida.println("Se ha conectado:" + nickname);
				}
			}

			while(true){
				String mensaje = entrada.readLine();
				if(mensaje.startsWith("/salir"))
					break;
/*
				if(mensaje.startsWith("/listar"))

				if(mensaje.startsWith("/dm")

				if(mensaje.startsWith("/mute")

				if(mensaje.startsWith("/patear")
*/

				for(i=0; i< maxUsuarios;i++){
					if(usuarios[i] != null && usuarios[i] != this){
						usuarios[i].salida.println(nickname + " > " + mensaje);
					}
				}
			}

			salida.println("Adios..");

			for(i=0; i< maxUsuarios;i++){
				if(usuarios[i] != null && usuarios[i] != this){
					usuarios[i].salida.println(nickname + " salió.");
				}
			}

			salida.close();
			entrada.close();

		}catch(IOException e){

		}

	}

	void arraySet(){
		arrayUser.add("Luis", "1234");
		arrayUser.add("Simon", "9876");
		return 
	}

	void login(String u, String p){
		int b=1;
		Iterator<User> it = arrayUser.iterator();

		while(it.hasNext()){
		if(arrayUser.indexOf(u)==arrayUser.indexOf(p))
			b=0;
		}
		return b;
	}
}
