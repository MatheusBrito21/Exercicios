package exercicios.ex19;

public class ComprarMain {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Matheus");
		ListaDeCompra l1 = new ListaDeCompra();
		
		l1.listaDeCompra.add(new Eletronico("Notebook",2000, 1));
		l1.listaDeCompra.add(new Eletronico("Tablet", 2500, 1));
		l1.listaDeCompra.add(new Comida("Arroz", 10, 3));
		l1.listaDeCompra.add(new Moveis("Sofá", 5000, 1));
		l1.listaDeCompra.add(new Eletrodomesticos("Geladeira", 6000, 1));
		l1.listaDeCompra.add(new Comida("Feijao", 5, 1));
		
		l1.listaDeCompra.forEach(System.out::println);
		
		System.out.println(c1.calcularCompra(l1));
		
	}

}
