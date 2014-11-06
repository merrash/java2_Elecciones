public class Habitante
{
	public String nombre;
	private String apellido;
	private String dni;
	private int edad;
	private String sexo;
	private int telefono;
	private String poblacion;

	public Habitante(String n, String a, String d, int e, String s, int t, String p)
	{
		nombre=n;
		apellido=a;
		dni=d;
		edad=e;
		sexo=s;
		telefono=t;
		poblacion=p;
	}

	public void setNombre(String n)
	{
		this.nombre=n;
	}
	public String getNombre()
	{
		return nombre;
	}

	public void setApellido(String a)
	{
		this.apellido=a;
	}
	public String getApellido()
	{
		return apellido;
	}

	public void setDni(String d)
	{
		this.dni=d;
	}
	public String getDni()
	{
		return dni;
	}

	public void setEdad(int e)
	{
		this.edad=e;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setSexo(String s)
	{
		this.sexo=s;
	}
	public String getSexo()
	{
		return sexo;
	}

	public void setTelefono(int t)
	{
		this.telefono=t;
	}
	public int getTelefono()
	{
		return telefono;
	}
	public void setPoblacion(String p)
	{
		this.poblacion=p;
	}

	public String getPoblacion()
	{
		return poblacion;
	}

}