package heren�a;

public class Tecnico extends Aluno
{
	private float registroProfissional;
	
	public void praticar()
	{
		System.out.println("Tecnico est� praticando no momento");
	}

//Getters and Setters
	
	public float getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(float registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

	@Override
	public String toString() {
		return "Tecnico [registroProfissional=" + registroProfissional + "]";
	}
	
}
