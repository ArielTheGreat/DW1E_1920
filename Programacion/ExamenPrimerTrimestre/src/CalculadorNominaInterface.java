
public interface CalculadorNominaInterface {
	String MEDICO = "Médico";
	String ENFERMERO = "Enfermero";
	String OTRA = "Otra";
	
	double calculoIRPF();
	double calculoSSocial();
	double calculoSueldoNeto(double a,double b);
	
}
