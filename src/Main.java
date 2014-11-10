import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.ArrayList; 

import java.util.Scanner;

public class Main 
{



	public static void main (String args[]) 
	{
	
		int num;
		String cadena;
		//char caracter;

		Scanner sc = new Scanner(System.in);

		File archivo = null;
    	FileReader lector = null;
    	BufferedReader bufer = null;
			/*

			//*****HABITANTE*****

		Habitante habitante = new Habitante("feo","feo","1234feo",1234,"fea",1234,"feo");


		System.out.print("\nNombre del habitante: ");//pide el nombre
		cadena = sc.nextLine();
		habitante.setNombre(cadena);

		System.out.print("\nApellido del habitante: ");//pide el nombre
		cadena = sc.next();
		habitante.setApellido(cadena);

		System.out.print("\nDNI del habitante: ");//pide el nombre
		cadena = sc.next();
		habitante.setDni(cadena);

		System.out.print("\nEdad del habitante: ");//pide el nombre
		num = sc.nextInt();
		habitante.setEdad(num);

		System.out.print("\nSexo del habitante: ");//pide el nombre
		cadena = sc.next();
		habitante.setSexo(cadena);

		System.out.print("\nTelefono del habitante: ");//pide el nombre
		num = sc.nextInt();
		habitante.setTelefono(num);

		System.out.print("\nPoblacion del habitante: ");//pide el nombre
		cadena = sc.next();
		habitante.setPoblacion(cadena);


		System.out.print("\nEl nombre del habitante es: " + habitante.getNombre()+ "\n");//recoge el nombre del habitante
		System.out.print("\nEl apellido del habitante es: " + habitante.getApellido()+ "\n");//recoge el nombre del habitante
		System.out.print("\nEl DNI del habitante es: " + habitante.getDni()+ "\n");//recoge el nombre del habitante
		System.out.print("\nLa edad del habitante es: " + habitante.getEdad()+ "\n");//recoge el nombre del habitante
		System.out.print("\nEl sexo del habitante es: " + habitante.getSexo()+ "\n");//recoge el nombre del habitante
		System.out.print("\nEl telefono del habitante es: " + habitante.getTelefono()+ "\n");//recoge el nombre del habitante
		System.out.print("\nLa poblacion del habitante es: " + habitante.getPoblacion()+ "\n");//recoge el nombre del habitante


		//*****INMUEBLE*****

		Inmueble inmueble = new Inmueble(1234,"feo","1234feo",1234);


		System.out.print("\nID del inmueble: ");//pide el nombre
		num = sc.nextInt();
		inmueble.setId(num);

		System.out.print("\nTipo de inmueble: ");//pide el nombre
		cadena = sc.next();
		inmueble.setTipo(cadena);
		
		System.out.print("\nLa direccion del inmueble: ");//pide el nombre
		cadena = sc.next();
		inmueble.setDireccion(cadena);
		
		System.out.print("\nMetros del inmueble: ");//pide el nombre
		num = sc.nextInt();
		inmueble.setMetros(num);

		


		System.out.print("\nEl ID del inmueble es: " + inmueble.getId()+ "\n");//recoge el nombre del habitante
		System.out.print("\nEl tipo de inmueble es: " + inmueble.getTipo()+ "\n");//recoge el nombre del habitante
		System.out.print("\nLa dirrecion del inmueble es: " + inmueble.getDireccion()+ "\n");//recoge el nombre del habitante
		System.out.print("\nLos metros del inmueble son: " + inmueble.getMetros()+ "\n");//recoge el nombre del habitante
		



		//*****ESPACIO PUBLICO*****

		EspacioPublico espaciopublico = new EspacioPublico(1234,"feo","1234feo","feo",1234);


		System.out.print("\nID del espacio publico: ");//pide el nombre
		num = sc.nextInt();
		espaciopublico.setId(num);

		System.out.print("\nTipo de espacio publico: ");//pide el nombre
		cadena = sc.next();
		espaciopublico.setTipo(cadena);
		
		System.out.print("\nLa direccion del espacio publico: ");//pide el nombre
		cadena = sc.next();
		espaciopublico.setDireccion(cadena);


		System.out.print("\nLa poblacion del espacio publico: ");//pide el nombre
		cadena = sc.next();
		espaciopublico.setPoblacion(cadena);
		
		System.out.print("\nMetros del espacio publico: ");//pide el nombre
		num = sc.nextInt();
		espaciopublico.setMetros(num);

		
		System.out.print("\nEl ID del espacio publico es: " + espaciopublico.getId()+ "\n");//recoge el nombre del habitante
		System.out.print("\nEl tipo del espacio publico es: " + espaciopublico.getTipo()+ "\n");//recoge el nombre del habitante
		System.out.print("\nLa direccion del espacio publico es: " + espaciopublico.getDireccion()+ "\n");//recoge el nombre del habitante
		System.out.print("\nLa poblacion del espacio publico es: " + espaciopublico.getPoblacion()+ "\n");//recoge el nombre del habitante
		System.out.print("\nLos metros del espacio publico es: " + espaciopublico.getMetros()+ "\n");//recoge el nombre del habitante
		
		


		//*****AYUNTAMIENTO*****

		Ayuntamiento ayuntamiento = new Ayuntamiento(1234,"feo","1234feo","feo");


		System.out.print("\nID del ayuntamiento: ");//pide el nombre
		num = sc.nextInt();
		ayuntamiento.setId(num);

		System.out.print("\nPoblacion del ayuntamiento: ");//pide el nombre
		cadena = sc.next();
		ayuntamiento.setPoblacion(cadena);
		
		System.out.print("\nLa direccion del ayuntamiento: ");//pide el nombre
		cadena = sc.next();
		ayuntamiento.setDireccion(cadena);


		System.out.print("\nEl nombre del alcalde: ");//pide el nombre
		cadena = sc.next();
		ayuntamiento.setNombreAlcalde(cadena);

		
		System.out.print("\nEl ID del ayuntamiento es: " + ayuntamiento.getId()+ "\n");//recoge el nombre del habitante
		System.out.print("\nLa poblacion del ayuntamiento es: " + ayuntamiento.getPoblacion()+ "\n");//recoge el nombre del habitante
		System.out.print("\nLa direcciondel ayuntamiento es: " + ayuntamiento.getDireccion()+ "\n");//recoge el nombre del habitante
		System.out.print("\nEl nombre del alcalde es: " + ayuntamiento.getNombreAlcalde()+ "\n");//recoge el nombre del habitante



		//*****PARTIDO*****

		Partido partido = new Partido(1,"feo","feo",1,"1234feo",1234);


		System.out.print("\nId del partido");//pide el nombre
		num = sc.nextInt();
		partido.setId(num);

		System.out.print("\nNombre del partido: ");//pide el nombre
		cadena = sc.next();
		partido.setNombre(cadena);

		System.out.print("\nSiglas del partido: ");//pide el nombre
		cadena = sc.next();
		partido.setSiglas(cadena);

		System.out.print("\nNumero de afiliados en el partido: ");//pide el nombre
		num = sc.nextInt();
		partido.setAfiliados(num);

		System.out.print("\nTipo de partido: ");//pide el nombre
		cadena = sc.next();
		partido.setTipo(cadena);

		System.out.print("\nVotos conseguidos : ");//pide el nombre
		num = sc.nextInt();
		partido.setVotos(num);

		
		System.out.print("\nEl id del partido es: " + partido.getId()+ "\n");//recoge el nombre del habitante
		System.out.print("\nEl nombre del partido es: " + partido.getNombre()+ "\n");//recoge el nombre del habitante
		System.out.print("\nLas siglas del partido son" + partido.getSiglas()+ "\n");//recoge el nombre del habitante
		System.out.print("\nEl numero de afiliados es: " + partido.getAfiliados()+ "\n");//recoge el nombre del habitante
		System.out.print("\nEl tipo de partido es: " + partido.getTipo()+ "\n");//recoge el nombre del habitante
		System.out.print("\nEl numero de votos obtenido es: " + partido.getVotos()+ "\n");//recoge el nombre del habitante
		
		*/

		try
		{
		// Apertura del fichero y creacion de BufferedReader para poder
        // hacer una lectura comoda (disponer del metodo readLine()).
        	archivo = new File ("/home/ibalenciaga/ProyectosJava/java2_Elecciones/src/ListadoPartidos.txt");
        	lector = new FileReader (archivo);
        	bufer = new BufferedReader(lector);
 
        	// Lectura del fichero
        	//int i=0;
         
        	ArrayList lista = new ArrayList() ; 
			

			int i;
        	/*while(bufer.readLine()!=null)
        	{


         		lista.add(i, bufer.readLine());
         		
						//imprime el valor de la lista en la posicion i
						System.out.println(lista.get(i)) ; 
						i++;
				
			}*/
			for (i=0; bufer.readLine()!=null;i++) // int size() El tamaño actual 
				{
			//imprime el valor de la lista en la posicion i
					lista.add(i, bufer.readLine());
			System.out.println(lista.get(i)) ; 	}	

			System.out.println("antes del vaciado del arraylist:" + lista.size() + "elementos") ; 		

			lista.clear();

			System.out.println("despues del vaciado del arraylist:" + lista.size() + "elementos") ; 		

        }
        
        catch(Exception e)
        {
        	e.printStackTrace();
        }

	}
}