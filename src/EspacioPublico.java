public class EspacioPublico
{

	private int id;
	private String nombre;//nombre del espacio publico
	private String tipo;//vivienda, oficina
	private String direccion;
	private String poblacion;
	private int metros;//
	

	public EspacioPublico(int i, String n, String t, String d, String p, int m)
	{
		id=i;
		nombre=n;
		tipo=t;
		direccion=d;
		poblacion=p;
		metros=m;
	}

	
	public void setId(int i)
	{
		this.id=i;
	}
	public int getId()
	{
		return id;
	}

	public void setNombre(String n)
	{
		this.nombre=n;
	}
	public String getNombre()
	{
		return nombre;
	}

	public void setTipo(String t)
	{
		this.tipo=t;
	}
	public String getTipo()
	{
		return tipo;
	}

	public void setDireccion(String d)
	{
		this.direccion=d;
	}
	public String getDireccion()
	{
		return direccion;
	}

	public void setPoblacion(String p)
	{
		this.poblacion=p;
	}
	public String getPoblacion()
	{
		return poblacion;
	}

	public void setMetros(int m)
	{
		this.metros=m;
	}
	public int getMetros()
	{
		return metros;
	}
}