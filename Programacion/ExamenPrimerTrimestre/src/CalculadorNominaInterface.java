
public interface CalculadorNominaInterface {
	String MEDICO = "M�dico";
	String ENFERMERO = "Enfermero";
	String OTRA = "Otra";
	
	double calculoIRPF();
	double calculoSSocial();
	double calculoSueldoNeto(double a,double b);
	
}
