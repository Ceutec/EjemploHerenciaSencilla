
class Padre
{
	int var_padre;
	Padre()
	{
		System.out.println("Constructor padre 1");
	}
	
	Padre(int x)
	{
		System.out.println("Constructor padre 2");
	}
	
	void funcion()
	{
		System.out.println("padre");
	}
}

class Hijo extends Padre
{
	int var_hijo;
	Hijo()
	{
		super(1);
	}
	void funcion()
	{
		System.out.println("hijo");
		super.funcion();
	}
}

public class Prinicipal
{
	public static void main(String[] args)
	{
		Hijo h = new Hijo();
		h.var_padre = 10;
		h.var_hijo = 20;
		h.funcion();
	}

}
