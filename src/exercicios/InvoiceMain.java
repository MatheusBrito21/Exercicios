package exercicios;

import java.util.ArrayList;
import java.util.List;

public class InvoiceMain {
	public static void main(String[] args) {
		List<Invoice> listaCompra = new ArrayList<Invoice>();
		
		Invoice item1 = new Invoice("Teclado", 100200, 2, 49.9);
			
		  listaCompra.add(item1);
		  listaCompra.add(new Invoice("Mouse",100300,1,29.9));
		  listaCompra.add(new Invoice("Pen Drive",100400,2,9.9));
		  listaCompra.add(new Invoice("Fone de Ouvido",100300,1,149.9));
		  //construtor padrão - sem passar valores
		  listaCompra.add(new Invoice());
		  
		  
		  
		  for(Invoice lista:listaCompra) {
			 System.out.println(lista);
		 }
		 
		  double totalCompra=0;
			for(Invoice lista:listaCompra) { 
				totalCompra+= lista.getInvoice(); 
			 }
		 
			System.out.println(String.format("Total da Compra:R$%.2f", totalCompra));
	}//main
}//class