import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FrancoArielRochaVallejos1Eva extends Trabajador implements CalculadorNominaInterface
{
	private String funcion;
	private String especialidad;
	
	public static void main(String[] args)
	{
		ArrayList<FrancoArielRochaVallejos1Eva> listaM = new ArrayList<FrancoArielRochaVallejos1Eva>();
		ArrayList<FrancoArielRochaVallejos1Eva> listaE = new ArrayList<FrancoArielRochaVallejos1Eva>();
		ArrayList<FrancoArielRochaVallejos1Eva> listaD = new ArrayList<FrancoArielRochaVallejos1Eva>();
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Cuántos profesionales, entre médic@s, enfermer@s y otr@s desea dar de alta?");
		System.out.print(" Teclee su número a continuación: ");
		int darAlta = teclado.nextInt();
		String fechaN="", fechaAlta="";
		double irpf,social,bruto;
		for(int i = 0;i < darAlta;i++)
		{
			System.out.println("Introduzca los siguientes datos del profesional:");
			System.out.print("Nombre: ");
			String nombre = teclado.next();
			System.out.print("Fecha Nacimiento (aaaa-mm-dd): ");
			fechaN = teclado.next();
			LocalDate fechaNaci = null;
			try
			{
				fechaNaci = LocalDate.parse(fechaN);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.print("Fecha Alta en la empresa (aaaa-mm-dd)");
			fechaAlta = teclado.next();
			
			LocalDate fechaDeAlta = null;
			try
			{
				fechaDeAlta = LocalDate.parse(fechaAlta);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			System.out.print("País: ");
			String pais = teclado.next();
			System.out.print("Ciudad: ");
			String ciudad = teclado.next();
			System.out.print("Sueldo bruto: ");
			bruto = teclado.nextDouble();
			System.out.print("Porcentaje IRPF: ");
			irpf = teclado.nextDouble();
			System.out.print("Porcentaje Seguridad Social: ");
			social = teclado.nextDouble();
			System.out.print("Función.(Teclee M, E, O[M]édico,[E]nfermero,[O]tra):");
			String funcion = teclado.next();
			System.out.println("Especialidad Médica o de Enfermería");
			System.out.println("Médica:(Oftalmólogo,UVI,Internista,Traumatólogo,Cirugía)");
			System.out.println("Enfermería:(Quirófano,UVI,Urgencias,Planta)");
			System.out.println("Otra");
			System.out.print("-------->");
			String especialidad = teclado.next();
			if(funcion.equalsIgnoreCase("m"))
			{
				listaM.add(new FrancoArielRochaVallejos1Eva(nombre,fechaNaci,fechaDeAlta,pais,ciudad,bruto,irpf,social,funcion,especialidad));
			}
			if(funcion.equalsIgnoreCase("e"))
			{
				listaE.add(new FrancoArielRochaVallejos1Eva(nombre,fechaNaci,fechaDeAlta,pais,ciudad,bruto,irpf,social,funcion,especialidad));
			}
			if(funcion.equalsIgnoreCase("o"))
			{
				listaD.add(new FrancoArielRochaVallejos1Eva(nombre,fechaNaci,fechaDeAlta,pais,ciudad,bruto,irpf,social,funcion,especialidad));
			}
		}
		
		teclado.close();
		
		if(!listaM.isEmpty())
		{
				System.out.println("Información del personal Médico");
				System.out.println("=================================");
				for(FrancoArielRochaVallejos1Eva z:listaM)
				{
					System.out.println("El/La profesional " + z.getNombre());
					System.out.println(z.toString());
					System.out.println("\nFecha de alta: " + z.getFechaAlta());
					System.out.println(". Fecha de Nacimiento: " + z.getFechaNacimiento());
					System.out.println("Total sueldo NETO:");
				}
				System.out.println("");
		}
		
		if(!listaE.isEmpty())
		{
				System.out.println("Información del personal de Enfermería");
				System.out.println("=======================================");
				for(FrancoArielRochaVallejos1Eva x: listaE)
				{
					System.out.println("El/La profesional " + x.getNombre());
					System.out.println(x.toString());
					System.out.println("\nFecha de alta: " + x.getFechaAlta());
					System.out.println(". Fecha de Nacimiento: " + x.getFechaNacimiento());
					System.out.println("Total sueldo NETO:");
				}
				System.out.println("");
		}
		
		if(!listaD.isEmpty())
		{
				System.out.println("Información del personal con Otra función");
				System.out.println("==========================================");
				for(FrancoArielRochaVallejos1Eva y: listaE)
				{
					System.out.println("El/La profesional " + y.getNombre());
					System.out.println(y.toString());
					System.out.println("\nFecha de alta: " + y.getFechaAlta());
					System.out.println(". Fecha de Nacimiento: " + y.getFechaNacimiento());
					System.out.println("Total sueldo NETO:");
				}
				System.out.println("");
		}
	}
	public double calculoIRPF()
	{
		
		return 0;
	}
	public double calculoSSocial()
	{
		
		return 0;
	}
	
	public double calculoSueldoNeto(double a, double b)
	{
		return 0;
	}
	public FrancoArielRochaVallejos1Eva(String n,LocalDate fechaN,
			LocalDate  fechaAlt, String ciu,
			String pais, double bruto, double irpf,
			double social,String funcion,String especialidad
			)
	{
		super(n,fechaN,fechaAlt,ciu,pais,bruto,irpf,social);
		this.funcion = funcion;
		this.especialidad = especialidad;
	}
	
	public String toString()
	{
		String msj =
				". Su función es " + funcion +
				".\nSu especialidad es: " + especialidad +
				"\nTiene un sueldo bruto de " + sueldoBruto +
				".\nDescuentos:" + "\nPor IRPF(" + porcientoIrpf + "%):" +
				"\nPor seguridad Social(" + porcientoSSocial + "%):";
		return msj;
	}

}
