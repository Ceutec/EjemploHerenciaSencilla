
public class Triangulo {
	private double base;
	private double altura;
	
	Triangulo(double base,double altura)
	{
		this.base = base;
		this.altura = altura;
	}
	
	double getArea()
	{
		return (base*altura)/2;
	}
	
	double getBase()
	{
		return base;
	}
	
	double getAltura()
	{
		return altura;
	}
	
	void setBase(double base)
	{
		this.base = base;
	}
	
	void setAltura(double altura)
	{
		this.altura = altura;
	}
}
