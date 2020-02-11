import java.time.LocalDate;

class Trabajador
{
	private String nombre;
	private LocalDate fechaNacimiento;
	private LocalDate fechaAlta;
	private String ciudad;
	private String país;
	double sueldoBruto;
	double porcientoIrpf;
	double porcientoSSocial;
	public Trabajador(String n,LocalDate fechaN,
			LocalDate  fechaAlt, String ciu,
			String pais, double bruto, double irpf,
			double social)
	{
		nombre = n;
		fechaNacimiento = fechaN;
		fechaAlta = fechaAlt;
		ciudad = ciu;
		país = pais;
		sueldoBruto = bruto;
		porcientoIrpf = irpf;
		porcientoSSocial = social;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPaís() {
		return país;
	}
	public void setPaís(String país) {
		this.país = país;
	}
	
}
