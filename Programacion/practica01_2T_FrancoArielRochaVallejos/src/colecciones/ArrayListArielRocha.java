package colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListArielRocha 
{

	public static void main(String[] args) 
	{
		Arboles roble = new Arboles();
		roble.setNombre("Roble");
		roble.setLugarOrigen("Canad�");
		roble.setHojaCaduca(true);
		roble.setA�osEdad(80);
		roble.setAltura(12.5);
		Arboles encina = new Arboles();
		encina.setNombre("Encina");
		roble.setLugarOrigen("Espa�a");
		roble.setHojaCaduca(false);
		roble.setA�osEdad(90);
		roble.setAltura(5.25);
		Arboles pinoLaricio = new Arboles();
		pinoLaricio.setNombre("Pino Laricio");
		roble.setLugarOrigen("Italia");
		roble.setHojaCaduca(false);
		roble.setA�osEdad(80);
		roble.setAltura(22.5);
		Arboles roble2 = new Arboles();
		roble2.setNombre("Roble");
		roble.setLugarOrigen("Canad�");
		roble.setHojaCaduca(true);
		roble.setA�osEdad(15);
		roble.setAltura(5.5);
		Arboles manzano = new Arboles();
		manzano.setNombre("Manzano");
		roble.setLugarOrigen("India");
		roble.setHojaCaduca(false);
		roble.setA�osEdad(60);
		roble.setAltura(3.5);
		
		ArrayList<Arboles> lista = new ArrayList<Arboles>();
		
		lista.add(roble);
		lista.add(manzano);
		lista.add(pinoLaricio);
		lista.add(roble2);
		lista.add(encina);
		Object[] listaArray;
		if(!lista.isEmpty())
		{
			listaArray = lista.toArray();
			
			
		}
		Iterator<Arboles> iterator = lista.iterator();
		
		for(Arboles a:lista)
		{
			if(a.getNombre().equals("Encina"))
			{
				a.setA�osEdad(95);
			}
		}
		
		for(Arboles b:lista)
		{
			System.out.println(b.getNombre());
		}
	}

}
