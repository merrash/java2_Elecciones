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
		
		Scanner sc = new Scanner(System.in);

		/*

			//*****HABITANTE*****

		Habitante habitante = new Habitante("0","","",0,"",0,"");


		System.out.print("\nNombre del habitante: ");//pide el nombre del habitante
		cadena = sc.nextLine();
		habitante.setNombre(cadena);

		System.out.print("\nApellido del habitante: ");//pide el apellido del habitante
		cadena = sc.next();
		habitante.setApellido(cadena);

		System.out.print("\nDNI del habitante: ");//pide el DNI del habitante
		cadena = sc.next();
		habitante.setDni(cadena);

		System.out.print("\nEdad del habitante: ");//pide la edad el habitante
		num = sc.nextInt();
		habitante.setEdad(num);

		System.out.print("\nSexo del habitante: ");//pide el sexo del habitante
		cadena = sc.next();
		habitante.setSexo(cadena);

		System.out.print("\nTelefono del habitante: ");//pide el telefono del habitante
		num = sc.nextInt();
		habitante.setTelefono(num);

		System.out.print("\nPoblacion del habitante: ");//pide la poblacion del habitante
		cadena = sc.next();
		habitante.setPoblacion(cadena);


		System.out.print("\nEl nombre del habitante es: " + habitante.getNombre()+ "\n");//muestra el nombre del habitante
		System.out.print("\nEl apellido del habitante es: " + habitante.getApellido()+ "\n");//muestra el apellido del habitante
		System.out.print("\nEl DNI del habitante es: " + habitante.getDni()+ "\n");//muestra el DNI del habitante
		System.out.print("\nLa edad del habitante es: " + habitante.getEdad()+ "\n");//muestra la edad del habitante
		System.out.print("\nEl sexo del habitante es: " + habitante.getSexo()+ "\n");//muestra el sexo del habitante
		System.out.print("\nEl telefono del habitante es: " + habitante.getTelefono()+ "\n");//muestra el telefono del habitante
		System.out.print("\nLa poblacion del habitante es: " + habitante.getPoblacion()+ "\n");//muestra la poblacion del habitante


		//*****INMUEBLE*****

		Inmueble inmueble = new Inmueble(0,"","",0);


		System.out.print("\nID del inmueble: ");//pide el ID del inmueble
		num = sc.nextInt();
		inmueble.setId(num);

		System.out.print("\nTipo de inmueble: ");//pide el tipo de inmueble
		cadena = sc.next();
		inmueble.setTipo(cadena);
		
		System.out.print("\nLa direccion del inmueble: ");//pide la direccion del inmueble
		cadena = sc.next();
		inmueble.setDireccion(cadena);
		
		System.out.print("\nMetros del inmueble: ");//pide los metros que tiene el inmueble
		num = sc.nextInt();
		inmueble.setMetros(num);

		


		System.out.print("\nEl ID del inmueble es: " + inmueble.getId()+ "\n");//muestra el nombre del habitante
		System.out.print("\nEl tipo de inmueble es: " + inmueble.getTipo()+ "\n");//muestra el tipo de inmueble
		System.out.print("\nLa dirrecion del inmueble es: " + inmueble.getDireccion()+ "\n");//muestra la direccion del inmueble
		System.out.print("\nLos metros del inmueble son: " + inmueble.getMetros()+ "\n");//muestra los metros del inmueble
		



		//***************ESPACIO PUBLICO***********************************************************

		EspacioPublico espaciopublico = new EspacioPublico(0,"","","","",0);


		System.out.print("\nID del espacio publico: ");//pide el ID del espacio publico
		num = sc.nextInt();
		espaciopublico.setId(num);

		System.out.print("\nNombre del espacio publico: ");//pide el nombre del espacio publico
		cadena = sc.next();
		espaciopublico.setNombre(cadena);

		System.out.print("\nTipo de espacio publico: ");//pide el tipo de espacio publico
		cadena = sc.next();
		espaciopublico.setTipo(cadena);
		
		System.out.print("\nLa direccion del espacio publico: ");//pide la direccion del espacio publico
		cadena = sc.next();
		espaciopublico.setDireccion(cadena);


		System.out.print("\nLa poblacion del espacio publico: ");//pide la poblacion en la que esta
		cadena = sc.next();
		espaciopublico.setPoblacion(cadena);
		
		System.out.print("\nMetros del espacio publico: ");//pide los metros del espacio publico
		num = sc.nextInt();
		espaciopublico.setMetros(num);

		
		System.out.print("\nEl ID del espacio publico es: " + espaciopublico.getId()+ "\n");//muestra el ID del espacio publico
		System.out.print("\nEl ID del espacio publico es: " + espaciopublico.getNombre()+ "\n");//muestra el nombre del espacio publico
		System.out.print("\nEl tipo del espacio publico es: " + espaciopublico.getTipo()+ "\n");//muestra  el tipo de espacio publico
		System.out.print("\nLa direccion del espacio publico es: " + espaciopublico.getDireccion()+ "\n");//muestra la direccion del espacio publico
		System.out.print("\nLa poblacion del espacio publico es: " + espaciopublico.getPoblacion()+ "\n");//recoge la poblacion en la que esta el espacio publico
		System.out.print("\nLos metros del espacio publico es: " + espaciopublico.getMetros()+ "\n");//recoge los metros del espacio publico
		
		


		//*****AYUNTAMIENTO*****

		Ayuntamiento ayuntamiento = new Ayuntamiento(0,"","","");


		System.out.print("\nID del ayuntamiento: ");//pide el ID del ayuntamiento
		num = sc.nextInt();
		ayuntamiento.setId(num);

		System.out.print("\nPoblacion del ayuntamiento: ");//pide la poblacion del ayuntamiento
		cadena = sc.next();
		ayuntamiento.setPoblacion(cadena);
		
		System.out.print("\nLa direccion del ayuntamiento: ");//pide la direccion del ayuntamiento
		cadena = sc.next();
		ayuntamiento.setDireccion(cadena);


		System.out.print("\nEl nombre del alcalde: ");//pide el nombre del alcalde
		cadena = sc.next();
		ayuntamiento.setNombreAlcalde(cadena);

		
		System.out.print("\nEl ID del ayuntamiento es: " + ayuntamiento.getId()+ "\n");//muestra el ID del ayuntamiento
		System.out.print("\nLa poblacion del ayuntamiento es: " + ayuntamiento.getPoblacion()+ "\n");//muestra la poblacion del ayuntamiento
		System.out.print("\nLa direcciondel ayuntamiento es: " + ayuntamiento.getDireccion()+ "\n");//muestra la dirrecion del ayuntamiento
		System.out.print("\nEl nombre del alcalde es: " + ayuntamiento.getNombreAlcalde()+ "\n");//muestra el nombre del alcalde



		//**************PARTIDO*****************************************

		Partido partido = new Partido(0,"","",0,"");


		System.out.print("\nId del partido");//pide el ID del partido
		num = sc.nextInt();
		partido.setId(num);

		System.out.print("\nNombre del partido: ");//pide el nombre del partido
		cadena = sc.next();
		partido.setNombre(cadena);

		System.out.print("\nSiglas del partido: ");//pide las siglas del partido
		cadena = sc.next();
		partido.setSiglas(cadena);

		System.out.print("\nNumero de afiliados en el partido: ");//pide el numero de afiliados en el partido
		num = sc.nextInt();
		partido.setAfiliados(num);

		System.out.print("\nNombre del secretario general: ");//pide el nombre del secretario general del partido
		cadena = sc.next();
		partido.setSecretario(cadena);

				
		System.out.print("\nEl id del partido es: " + partido.getId()+ "\n");//muestra el ID del partido
		System.out.print("\nEl nombre del partido es: " + partido.getNombre()+ "\n");//muestra el nombre del partido
		System.out.print("\nLas siglas del partido son" + partido.getSiglas()+ "\n");//muestra las siglas del partido
		System.out.print("\nEl numero de afiliados es: " + partido.getAfiliados()+ "\n");//muestra el numero de afiliados
		System.out.print("\nEl nombre del secretario general es: " + partido.getSecretario()+ "\n");//muestra el nombre del secretario
				
		*/


		/*
		//************LEER ARCHIVO PARTIDO Y GUARDARLO EN EL ARRAYLIST*******************************************
		try
		{
		
        	//File archivo = new File ("/home/zubiri/ProyectosJava/java2_Elecciones/src/listadoPartidos.txt");
        	File archivo = new File ("/home/zubiri/ProyectosJava/java2_Elecciones/src/listadoPartidos.txt");
        	
        	//FileReader lector = new FileReader (archivo);
        	//BufferedReader bufer = new BufferedReader(lector);
 			Scanner linea = new Scanner(archivo);
        	
        	//ArrayList <String> lista = new ArrayList <String>() ;

        	//Cremos el objeto Arraylist del tipo partido
        	ArrayList <Partido> partido = new ArrayList <Partido>() ; 
        	
        	
			while (linea.hasNextLine())
			{     

				//obtenemos la linea
 				String concoma = linea.nextLine();

 				//asigno al array los atributos de la fila leida sin comas
				String[] separadas = concoma.split(",");

				//creamos el nuevo partido y le asignamos los datos obtenido en el String separadas.
				Partido aux = new Partido(Integer.parseInt(separadas[0]),separadas[1],separadas[2],Integer.parseInt(separadas[3]),separadas[4]);
			
				//estas sentencias es lo mismo que poner la linea de arriba
				
				//ponemos los datos en los atributos del objeto
				//aux.setId(Integer.parseInt(separadas[0]));
				//aux.setNombre(separadas[1]);
				///aux.setSiglas(separadas[2]);
				//aux.setAfiliados(Integer.parseInt(separadas[3]));
				//aux.setSecretario(separadas[4]);
				

				//añadimos el objeto aux al ArrayList
				partido.add(aux);

				//obtenemos los datos del ultimo partido añadido
				System.out.println("\nEste es el ID del partido: " + aux.getId());
				System.out.println("\nNombre del partido: " + aux.getNombre());
				System.out.println("\nSiglas del partido: " + aux.getSiglas());
				System.out.println("\nAfiliados del partido: " + aux.getAfiliados());
				System.out.println("\nSecretario general: " + aux.getSecretario() + "\n");
			
			}
						
			System.out.println("antes del vaciado del arraylist PARTIDO:" + (partido.size()-1) + "elementos") ; 		
			System.out.println("antes del vaciado del arraylist AUX:" + (aux.size()-1) + "elementos") ; 		

			//vaciamos los ArryList
			partido.clear();
			aux.clear();

			System.out.println("despues del vaciado del arraylist PARTIDO:" + partido.size() + "elementos") ; 
			System.out.println("despues del vaciado del arraylist AUX:" + aux.size() + "elementos") ; 
			

        }
        
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        */


        //************LEER FICHERO CENSO Y GUARDAR EN ARRAYLIST. IMPRIMIR SOLO A LOS MAYORES DE 18 AÑOS

        try
		{
		
        	//File archivo = new File ("/home/zubiri/ProyectosJava/java2_Elecciones/src/censo.txt");
        	File archivo = new File ("/home/zubiri/ProyectosJava/java2_Elecciones/src/censo.txt");
        	
        	//FileReader lector = new FileReader (archivo);
        	//BufferedReader bufer = new BufferedReader(lector);
 			Scanner linea = new Scanner(archivo);
        	
        	//ArrayList <String> lista = new ArrayList <String>() ;

        	//Cremos el objeto Arraylist del tipo habitante
        	ArrayList <Habitante> habitante = new ArrayList <Habitante>() ; 
        	
        	
			while (linea.hasNextLine())
			{     

				//obtenemos la linea
 				String concoma = linea.nextLine();

 				//asigno al array los atributos de la fila leida sin comas
				String[] separadas = concoma.split(",");

				//creamos el nuevo partido y le asignamos los datos obtenido en el String separadas.
				Habitante aux = new Habitante(separadas[0],separadas[1],separadas[2],Integer.parseInt(separadas[3]),separadas[4],Integer.parseInt(separadas[5]),separadas[6]);
			
				//estas sentencias es lo mismo que poner la linea de arriba
				/*
				//ponemos los datos en los atributos del objeto
				aux.setNombre(separadas[0]);
				aux.setApellido(separadas[1]);
				aux.setDni(separadas[2]);
				aux.setEdad(Integer.parseInt(separadas[3]));
				aux.setSexo(separadas[4]);
				aux.setTelefono(Integer.parseInt(separadas[5]));
				aux.setPoblacion(separadas[6]);
				*/


				//Comprobamos si es mayor de edad
				if (aux.getEdad()>=18)
				{

					//añadimos el objeto aux al ArrayList
					habitante.add(aux);

					//obtenemos los datos del ultimo partido añadido
					System.out.println("\nNombre del habitante: " + aux.getNombre());
					System.out.println("\nApellido del habitante: " + aux.getApellido());
					System.out.println("\nDNI del habitante: " + aux.getDni());
					System.out.println("\nEdad del habitante: " + aux.getEdad());
					System.out.println("\nSexo del habitante " + aux.getSexo());
					System.out.println("\nTelefono del habitante: " + aux.getTelefono());
					System.out.println("\nPoblacion del habitante: " + aux.getPoblacion() + "\n");
			
				}

			}/*
					System.out.println("antes del vaciado del arraylist HABITANTE:" + (habitante.size()-1) + "elementos") ; 		
					System.out.println("antes del vaciado del arraylist AUX:" + (aux.size()-1) + "elementos") ; 		

					//vaciamos los ArryList
					habitante.clear();
					aux.clear();

					System.out.println("despues del vaciado del arraylist HABITANTE:" + habitante.size() + "elementos") ; 
					System.out.println("despues del vaciado del arraylist AUX:" + aux.size() + "elementos") ; 
					*/

        }
        
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}
}