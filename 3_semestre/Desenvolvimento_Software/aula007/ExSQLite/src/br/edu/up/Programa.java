package br.edu.up;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Programa {

	public static void main(String[] args) throws SQLException {
		
		
		Inserir("Anaa", "2000/05/12", "123445", "email");
		Listar();
		
		
		
		//insert into Cliente (nome, dtaNas, cpf, email) values("ana", "2000/12/25", "123465", "aaaaa@hotm.com");  
		//Update Cliente set nome = "ana maria" where codigo = 2
		//delete from cliente where codigo = 1
	}
	
	public static void Listar() throws SQLException {
		String url = "jdbc:sqlite:C:\\Users\\Aluno\\Desktop\\UP_ADS\\3_semestre\\Desenvolvimento_Software\\aula007\\ExSQLite\\db\\PrimeiroBancoDeDados.db";
		Connection conexao = DriverManager.getConnection(url) ;
		
		Statement comando = conexao.createStatement();
		String querySelect = "select * from Cliente";
		ResultSet resultado = comando.executeQuery(querySelect);
		while(resultado.next()) {
			int codigo = resultado.getInt(1);
			String nome = resultado.getString(2);
			String dataNas = resultado.getString(3);
			String cpf = resultado.getString(4);
			String email = resultado.getString(5);
			
			System.out.println(codigo);
			System.out.println(nome);
			System.out.println(dataNas);
			System.out.println(cpf);
			System.out.println(email);
			System.out.println();
		}
	}
	
	public static void Inserir(String nome, String dtaNas, String cpf, String email) throws SQLException {
		String url = "jdbc:sqlite:C:\\Users\\Aluno\\Desktop\\UP_ADS\\3_semestre\\Desenvolvimento_Software\\aula007\\ExSQLite\\db\\PrimeiroBancoDeDados.db";
		Connection conexao = DriverManager.getConnection(url) ;
		
		Statement comando = conexao.createStatement();
		String querySelect = "insert into Cliente (nome, dtaNas, cpf, email) values " + "(" + nome + "," + dtaNas + "," + cpf + "," + email + ")";
		ResultSet resultado = comando.executeQuery(querySelect);
			
	}

}
