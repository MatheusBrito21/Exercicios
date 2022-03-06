package padroes.observer.teste;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<ObservadorEvento> observadores = new ArrayList<>();
	
	public void registrarObservador(ObservadorEvento obs) {
		observadores.add(obs);
	}
	
	public void monitorarEvento() {
		AlertaEvento alerta = new AlertaEvento();
		int i = 0;
		do {
			i++;
			if(i<=3) {
				alerta.setEventoOcorreu(false);
				System.out.println("Espera um pouquinho...");
			}else {
				alerta.setEventoOcorreu(true);
				Evento e = new Evento();
				observadores.stream().forEach(o -> o.eventoOcorreu(e));
			}
			
		} while (alerta.EventoOcorreu == false);
	}
		
}
