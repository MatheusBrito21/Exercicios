package classesVSmetodos;

public class Calculadora {
	
	double resultado;
	
	//entrada - processo - saída
	double somar(double a, double b) {
		resultado = a+b;
		return resultado;
	}
	
	//entrada - processo
	void acrescentar(double a) {
		resultado+=a;
	}
	
	//saída
	double obterResultado() {
		return resultado;
	}
	
	//processo
	void limpar() {
		resultado = 0;
	}

}
