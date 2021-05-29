package calculoImc;

public class ValoresImc {

//declarando valores pra calcular IMC
	public double peso;
	public double altura;

	public ValoresImc(double peso, double altura) {
		
// declarando que peso e altura são os mesmos do metodo
		this.peso = peso;
		this.altura = altura;
	}

//metodo do calculo do IMC

	public double calculaImc() {
		double imc = peso / (altura * altura);
		return imc;
	}

}
