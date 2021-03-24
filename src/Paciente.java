
public class Paciente {
	double quilos;
	double altura;
	double IMC;
	
	public Paciente(double kg, double altura)
	{
		this.altura=altura;
		quilos=kg;
	}
	public void calcularIMC()
	{
		IMC = quilos/ (altura * altura);
	}
	
	public String diagnostico()
	{
		calcularIMC();
		if(IMC<16)
			return "Baixo peso muito grave";
		else if(IMC<17)
			return "Baixo peso grave";
		else if(IMC<18.50)
			return "Baixo peso";
		else if(IMC<25)
			return "Peso normal";
		else if(IMC<30)
			return "Sobrepeso";
		else if(IMC<35)
			return "Obesidade grau I";
		else if(IMC<40)
			return "Obesidade grau II";
		else
			return "Obesidade grau III (obesidade mórbida)";
	}
}
