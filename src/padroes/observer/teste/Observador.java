package padroes.observer.teste;

public class Observador implements ObservadorEvento{
	
	@Override
	public void eventoOcorreu(Evento e) {
		System.out.println(e.getEvento());
	}
}
