package herença;

public class PessoaTester {

	public static void main(String[] args) 
	{
         Pessoa p1= new Pessoa();

         p1.setNome("Daniel");
         p1.setIdade(25);
         p1.setSexo("Masculino");
         //System.out.println(p1.toString());
         
         Aluno a1 = new Aluno();
         a1.setNome("Isabella Freitas");
         a1.setIdade(24);
         a1.setSexo("Feminino");
         a1.setMatricula("0050010533");
         a1.setCurso("Radiologia");
         a1.pagarMensalidade(1000);
         //System.out.println(a1.toString()); 
         
         Professor prof = new Professor();
         prof.setEspecialidade("Mestre");
         prof.setIdade(40);
         prof.setNome("Alex");
         prof.setSalario(7000);
         prof.setSexo("Masculino");
         prof.receberAumento(450);
         //System.out.println(prof.toString()); 
         
         
         Visitante vis = new Visitante();
         
         
         Bolsista bol = new Bolsista();
         bol.setBolsa(100);
         bol.setNome("Maria");
         bol.setIdade(22);
         bol.pagarMensalidade(900);
         
         Tecnico tec = new Tecnico();
         tec.praticar();
         tec.setRegistroProfissional(1994);
         
         System.out.println("------------------------------------------------");
         
         System.out.println(p1.toString());
         System.out.println(a1.toString());
         System.out.println(prof.toString());
         System.out.println(bol.toString());
         System.out.println(tec.toString());
         
	}

}
