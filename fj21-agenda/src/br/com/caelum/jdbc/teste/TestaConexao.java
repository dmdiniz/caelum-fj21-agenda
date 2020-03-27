package br.com.caelum.jdbc.teste;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		listaContatos();
		
	}
	
	public static void insereContatos() {
		// pronto para gravar
	       Contato contato = new Contato();
	       contato.setNome("Dougllas");
	       contato.setEmail("dougllas@caelum.com.br");
	       contato.setEndereco("R. Vergueiro 3185 cj57");
	       contato.setDataNascimento(Calendar.getInstance());

	       // grave nessa conexão!!!
	       ContatoDao dao = new ContatoDao();

	       // método elegante
	       dao.adiciona(contato);

	       System.out.println("Gravado!");
	}
	
	public static void listaContatos() {
		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getLista();
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		for (Contato contato : contatos) {
	          System.out.println("Nome: " + contato.getNome());
	          System.out.println("Email: " + contato.getEmail());
	          System.out.println("Endereço: " + contato.getEndereco());
	          System.out.println("Data de Nascimento: " + 
	                  data.format(contato.getDataNascimento().getTime()) + "\n");
	      }
	}
	
	

}
