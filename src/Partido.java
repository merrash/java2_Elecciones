public class Partido
{

	private int id;//id del partido
	private String nombre;//nombre del partido
	private String siglas;//siglas de partido
	private int afiliados;//numero de afiliados en el partido
	private String tipo;//derechas, izquierdas
	private int votos;//numero de votos conseguidos
	

	public Partido(int i, String n, String s, int a, String t,int v)
	{
		id=i;
		nombre=n;
		siglas=s;
		afiliados=a;
		tipo=t;
		votos=v;
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
	public String getnombre()
	{
		return nombre;
	}

	public void setSiglas(String s)
	{
		this.siglas=s;
	}
	public String getSiglas()
	{
		return siglas;
	}

	public void setAfiliados(int a)
	{
		this.afiliados=a;
	}

	public int getAfiliados()
	{
		return afiliados;
	}
	public void setTipo(String t)
	{
		this.tipo=t;
	}
	public String getTipo()
	{
		return tipo;
	}
	public void setVotos(int v)
	{
		this.votos=v;
	}
	public int getVotos()
	{
		return votos;
	}
}