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
	
		Scanner sc = new Scanner(System.in);

		int num;
		String cadena;


		//************************************** MENU ********************************************
		
		String mineleccion="", eleccion="";

		do
		{
			System.out.print("\n\nMENU:");
			System.out.print("\nAñadir un habitante: (Ahabitante)");
			System.out.print("\nAñadir un inmueble: (Ainmueble)");
			System.out.print("\nAñadir un espacio publico: (Aespacio)");
			System.out.print("\nAñadir un ayuntamiento: (Aayuntamiento)");
			System.out.print("\nAñadir un partido politico: (Apartido)");
			System.out.print("\nLeer lista de partidos politicos: (Lpartidos)");
			System.out.println("\nLeer lista de censo (Lcenso):");

			System.out.println("\nPara salir escribe: (SALIR):");

			eleccion=sc.next();	
			mineleccion=eleccion.toLowerCase();
			
			
			switch (mineleccion) 
			{
				case "ahabitante":
				{

					
					//*************************************HABITANTE***************************************

					//creamos el objeto habitante de la clase Habitante y le damos los parametros
					Habitante habitante = new Habitante("0","","",0,"",0,"");

					//pide el nombre del habitante y lo asigna a nombre de Habitante
					System.out.print("\nNombre del habitante: ");
					cadena = sc.nextLine();
					habitante.setNombre(cadena);

					//pide el apellido del habitante y lo asigna a apellido de Habitante
					System.out.print("\nApellido del habitante: ");
					cadena = sc.next();
					habitante.setApellido(cadena);

					//pide el dni del habitante y lo asigna a dni de Habitante
					System.out.print("\nDNI del habitante: ");
					cadena = sc.next();
					habitante.setDni(cadena);

					//pide la edad del habitante y lo asigna a edad de Habitante
					System.out.print("\nEdad del habitante: ");
					num = sc.nextInt();
					habitante.setEdad(num);

					//pide el sexo del habitante y lo asigna a sexo de Habitante
					System.out.print("\nSexo del habitante: ");
					cadena = sc.next();
					habitante.setSexo(cadena);

					//pide el telefono del habitante y lo asigna a telefono de Habitante
					System.out.print("\nTelefono del habitante: ");
					num = sc.nextInt();
					habitante.setTelefono(num);

					//pide la poblacion del habitante y lo asigna a poblacion de Habitante
					System.out.print("\nPoblacion del habitante: ");
					cadena = sc.next();
					habitante.setPoblacion(cadena);

					//muestra el contenido de los atributos de Habitante
					System.out.print("\nEl nombre del habitante es: " + habitante.getNombre()+ "\n");
					System.out.print("\nEl apellido del habitante es: " + habitante.getApellido()+ "\n");
					System.out.print("\nEl DNI del habitante es: " + habitante.getDni()+ "\n");
					System.out.print("\nLa edad del habitante es: " + habitante.getEdad()+ "\n");
					System.out.print("\nEl sexo del habitante es: " + habitante.getSexo()+ "\n");
					System.out.print("\nEl telefono del habitante es: " + habitante.getTelefono()+ "\n");
					System.out.print("\nLa poblacion del habitante es: " + habitante.getPoblacion()+ "\n");
					
					break;

				}
				

				case "ainmueble":
				{

															
					//*************************************** INMUEBLE **************************************

					Inmueble inmueble = new Inmueble(0,"","",0);

					//pide el ID del inmueble y lo asigna a id de Inmueble
					System.out.print("\nID del inmueble: ");
					num = sc.nextInt();
					inmueble.setId(num);

					//pide el tipo de inmueble y lo asigna a tipo de Inmueble
					System.out.print("\nTipo de inmueble: ");
					cadena = sc.next();
					inmueble.setTipo(cadena);
				
					//pide la direccion del inmueble y lo asigna a direccion de Inmueble
					System.out.print("\nLa direccion del inmueble: ");
					cadena = sc.next();
					inmueble.setDireccion(cadena);

					//pide los metros del inmueble y lo asigna a metros de Inmueble
					System.out.print("\nMetros del inmueble: ");
					num = sc.nextInt();
					inmueble.setMetros(num);

					//muestra el contenido de los atributos de Inmueble
					System.out.print("\nEl ID del inmueble es: " + inmueble.getId()+ "\n");
					System.out.print("\nEl tipo de inmueble es: " + inmueble.getTipo()+ "\n");
					System.out.print("\nLa dirrecion del inmueble es: " + inmueble.getDireccion()+ "\n");
					System.out.print("\nLos metros del inmueble son: " + inmueble.getMetros()+ "\n");
					
					break;
				
				}

				case "aespacio":
				{

					
					//***********************************ESPACIO PUBLICO*******************************************

					EspacioPublico espaciopublico = new EspacioPublico(0,"","","","",0);

					//pide el ID del espacio publico y lo asigna a id de EspacioPublico
					System.out.print("\nID del espacio publico: ");
					num = sc.nextInt();
					espaciopublico.setId(num);

					//pide el nombre del espacio publico y lo asigna a nombre de EspacioPublico
					System.out.print("\nNombre del espacio publico: ");
					cadena = sc.next();
					espaciopublico.setNombre(cadena);

					//pide el tipo de espacio publico y lo asigna a tipo de EspacioPublico
					System.out.print("\nTipo de espacio publico: ");
					cadena = sc.next();
					espaciopublico.setTipo(cadena);
				
					//pide la direccion del espacio publico y lo asigna a direccion de EspacioPublico				
					System.out.print("\nLa direccion del espacio publico: ");
					cadena = sc.next();
					espaciopublico.setDireccion(cadena);

					//pide la poblacion del espacio publico y lo asigna a poblacion de EspacioPublico
					System.out.print("\nLa poblacion del espacio publico: ");
					cadena = sc.next();
					espaciopublico.setPoblacion(cadena);
					
					//pide los metros del espacio publico y lo asigna a metros de EspacioPublico
					System.out.print("\nMetros del espacio publico: ");
					num = sc.nextInt();
					espaciopublico.setMetros(num);

					//muestra el contenido de los atributos de EspacioPublico
					System.out.print("\nEl ID del espacio publico es: " + espaciopublico.getId()+ "\n");
					System.out.print("\nEl ID del espacio publico es: " + espaciopublico.getNombre()+ "\n");
					System.out.print("\nEl tipo del espacio publico es: " + espaciopublico.getTipo()+ "\n");
					System.out.print("\nLa direccion del espacio publico es: " + espaciopublico.getDireccion()+ "\n");
					System.out.print("\nLa poblacion del espacio publico es: " + espaciopublico.getPoblacion()+ "\n");
					System.out.print("\nLos metros del espacio publico es: " + espaciopublico.getMetros()+ "\n");
					
					break;
				
				}


				case "ayuntamiento":
				{

					System.out.print("AYUNTAMIENTO OK");
					break;

					/*
					//**************************** AYUNTAMIENTO ****************************************

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
					*/
				}

				case "apartido":
				{

					System.out.print("APARTIDO OK");
					break;
					/*
					//**************PARTIDO POLITICO*****************************************

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
				}

				case "lpartidos":
				{

					System.out.print("LEER PARTIDO OK");
					break;
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

		    	}


				case "lcenso":
				{

					System.out.print("LEER CENSO OK");
					break;

			        /*
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
							
							//ponemos los datos en los atributos del objeto
							//aux.setNombre(separadas[0]);
							//aux.setApellido(separadas[1]);
							//aux.setDni(separadas[2]);
							//aux.setEdad(Integer.parseInt(separadas[3]));
							//aux.setSexo(separadas[4]);
							//aux.setTelefono(Integer.parseInt(separadas[5]));
							//aux.setPoblacion(separadas[6]);
							


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

						}
								System.out.println("antes del vaciado del arraylist HABITANTE:" + (habitante.size()-1) + "elementos") ; 		
								System.out.println("antes del vaciado del arraylist AUX:" + (aux.size()-1) + "elementos") ; 		

								//vaciamos los ArryList
								habitante.clear();
								aux.clear();

								System.out.println("despues del vaciado del arraylist HABITANTE:" + habitante.size() + "elementos") ; 
								System.out.println("despues del vaciado del arraylist AUX:" + aux.size() + "elementos") ; 
								

			        }
			        
			        catch(Exception e)
			        {
			        	e.printStackTrace();
			        }
			        */
		    	}

		    	case "salir":
		    	break;

		    	default:
		    		System.out.println("No has elegido la opcion correcta");

		    }
	    
	    }while(!eleccion.equalsIgnoreCase("salir"));
	}
}