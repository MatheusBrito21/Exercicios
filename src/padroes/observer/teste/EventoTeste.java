package padroes.observer.teste;

public class EventoTeste {
	public static void main(String[] args) {
		
		Subject s = new Subject();
		Observador o = new Observador();
		
		s.registrarObservador(o);
		s.monitorarEvento();
		
	}
}
