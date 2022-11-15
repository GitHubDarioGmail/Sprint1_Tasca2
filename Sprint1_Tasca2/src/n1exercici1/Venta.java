package n1exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Venta {

	private List<Producto> productos = new ArrayList<>();
	private double precioTotal;

	Producto p = new Producto();

	public void calcularTotal() {
		
		double total = 0;
		
		for (Producto producto : productos) {
			total = total + producto.getPrecio();
		}

		System.out.println("Total: " + total);
	}

	public void cargarDatosFactura() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Presione 1 para ingresar los productos a facturar: ");
		int respuesta = sc.nextInt();

		while (respuesta == 1) {
			
			
			System.out.println("Ingrese producto");
			p.setNombre(sc.nextLine());
			System.out.println("Ingrese precio");
			p.setPrecio(sc.nextDouble());
			productos.add(p);
			System.out.println("Presione 1 para ingresar otro producto: ");
			respuesta = sc.nextInt();
		}
		calcularTotal();
	}
}