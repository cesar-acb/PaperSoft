package br.papelaria.control;

import br.papelaria.model.Cliente;
import br.papelaria.model.Fornecedor;
import br.papelaria.model.Produto;
import br.papelaria.model.Venda;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorBancoDeDados {
	
	public HashMap getConfigBD()
	{
		HashMap<String, String>	cfg		= new HashMap<String, String>();
		Properties				prop		= new Properties();
		InputStream				input	= null;
		String					show_sql	= new String();
		String					user		= new String();
		String					password	= new String();
		String					server	= new String();
		String					port		= new String();
		String					database	= new String();
		
		try
		{
			//Abre arquivo de configurações
			input = new FileInputStream("config/bd.properties");
			
			//Obtem as informações do arquivo
			prop.load(input);
			
			//Seta as propriedades
			show_sql	= prop.getProperty("show_sql");
			user		= prop.getProperty("user");
			password	= prop.getProperty("password");
			server	= prop.getProperty("server");
			port		= prop.getProperty("port");
			database	= prop.getProperty("database");
			
			//Mapeia as propriedades
			cfg.put("hibernate.show_sql",						show_sql);
			cfg.put("javax.persistence.jdbc.user",				user);
			cfg.put("javax.persistence.jdbc.password",			password);
			cfg.put("javax.persistence.jdbc.url",				"jdbc:mysql://"+server+":"+port+"/"+database);
			cfg.put("hibernate.connection.CharSet",				"utf8");
			cfg.put("hibernate.connection.characterEncoding",	"utf8");
			cfg.put("hibernate.connection.useUnicode",			"true");
		}
		catch (IOException e)
		{
			JOptionPane.showMessageDialog	(
					null, 
					"Erro!\nCausa: "+e.getCause()+"\nMensagem: "+e.getMessage(), 
					"Erro",
					JOptionPane.ERROR_MESSAGE 
					);
			return null;
		}
		finally
		{
			if (input != null) 
			{
				try 
				{
					input.close();
				} 
				catch (IOException e) 
				{
					return null;
				}
			}
		}
		return (HashMap)cfg;
	}
	
	/*
	 * Método getConexao
	 * Retorna a conexão com o banco de dados, com DATABASE
	 */
	public Connection getConexao()
	{
		Properties	prop		= new Properties();
		InputStream	input	= null;
		String		user		= new String();
		String		password	= new String();
		String		server	= new String();
		String		port		= new String();
		String		database	= new String();
		
		try
		{
			//Abre arquivo de configurações
			input = new FileInputStream("config/bd.properties");
			
			//Obtem as informações do arquivo
			prop.load(input);
			
			//Seta as propriedades
			user		= prop.getProperty("user");
			password	= prop.getProperty("password");
			server	= prop.getProperty("server");
			port		= prop.getProperty("port");
			database	= prop.getProperty("database");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexao = null;
			conexao = DriverManager.getConnection("jdbc:mysql://"+server+":"+port+"/"+database+"",user, password);
			return conexao;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog	(
					null, 
					"Erro!\nCausa: "+e.getCause()+"\nMensagem: "+e.getMessage(), 
					"Erro",
					JOptionPane.ERROR_MESSAGE 
					);
			return null;
		}
		finally
		{
			if (input != null) 
			{
				try 
				{
					input.close();
				} 
				catch (IOException e) 
				{
					return null;
				}
			}
		}
	}
	
	/*
	 * Método getConexaoSemBanco
	 * Retorna a conexão com o banco de dados, sem DATABASE
	 */
	public Connection getConexaoSemBanco()
	{
		Properties	prop			= new Properties();
		InputStream	input		= null;
		String		user			= new String();
		String		password		= new String();
		String		server		= new String();
		String		port			= new String();
		
		try
		{
			//Abre arquivo de configurações
			input = new FileInputStream("config/bd.properties");
			
			//Obtem as informações do arquivo
			prop.load(input);
			
			//Seta as propriedades
			user		= prop.getProperty("user");
			password	= prop.getProperty("password");
			server	= prop.getProperty("server");
			port		= prop.getProperty("port");
			
			Connection  conexao = DriverManager.getConnection("jdbc:mysql://"+server+":"+port+"/",user,password);
			
			return conexao;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog	(
					null, 
					"Erro!\nCausa: "+e.getCause()+"\nMensagem: "+e.getMessage(), 
					"Erro",
					JOptionPane.ERROR_MESSAGE 
					);
			return null;
		}
		finally
		{
			if (input != null) 
			{
				try 
				{
					input.close();
				} 
				catch (IOException e) 
				{
					JOptionPane.showMessageDialog	(
							null, 
							"Erro!\nCausa: "+e.getCause()+"\nMensagem: "+e.getMessage(), 
							"Erro",
							JOptionPane.ERROR_MESSAGE 
							);
				}
			}
		}
	}
	
	/*
	 * Método existeBanco
	 * Verifica a existencia do Banco
	 */
	public boolean existeBanco()
	{
		boolean		existeBanco	= false;
		Properties	prop			= new Properties();
		InputStream	input		= null;
		ResultSet		resultSet;
		
		String		database		= new String();
		
		try
		{
			//Abre arquivo de configurações
			input = new FileInputStream("config/bd.properties");
			
			//Obtem as informações do arquivo
			prop.load(input);
			
			//Seta as propriedades
			
			database	= prop.getProperty("database");
			
			resultSet	= this.getConexaoSemBanco().getMetaData().getCatalogs();
			
			//iterate each catalog in the ResultSet
			while (resultSet.next()) 
			{
				// Get the database name, which is at position 1
				String databaseName = resultSet.getString(1);
				if (databaseName.equals(database))
				{
					return true;
				}
			}
		}
		catch(Exception exception)
		{
			return false;
		}
		finally
		{
			if (input != null) 
			{
				try 
				{
					input.close();
				} 
				catch (IOException e) 
				{
					return false;
				}
			}
		}
		
		return false;
	}
	
	/*
	 * Método criaBanco
	 * Cria banco de dados
	 */
	public boolean criaBanco()
	{
		Properties	prop		= new Properties();
		InputStream	input	= null;
		String		database	= new String();
		
		try
		{
			//Abre arquivo de configurações
			input = new FileInputStream("config/bd.properties");
			
			//Obtem as informações do arquivo
			prop.load(input);
			
			//Seta as propriedades
			database	= prop.getProperty("database");
			
			Statement stmt = this.getConexaoSemBanco().createStatement();
			
			stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS "+database+";");
		}
		catch(Exception exception)
		{
			return false;
		}
		finally
		{
			if (input != null) 
			{
				try 
				{
					input.close();
				} 
				catch (IOException e) 
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	/*
	 * Método criaTabelas
	 * Cria as tabelas do banco
	 */
	public boolean criaTabelas()
	{
		try
		{
			this.factory    = Persistence.createEntityManagerFactory("papelaria", this.getConfigBD()); 
			factory.close();
			return true;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog	(
					null, 
					"Erro!\nCausa: "+e.getCause()+"\nMensagem: "+e.getMessage(), 
					"Erro",
					JOptionPane.ERROR_MESSAGE 
					);
			return false;
		}
	}
	
	/*
	 * Método populaBanco
	 * Popula o Banco para uso
	 */
	public void populaBanco(JFrame j)
	{		
		//Cliente
		for(int i=0; i<10; i++)
		{
			Cliente c = new Cliente();
			c.incluirCliente("CLIENTE"+String.valueOf(i), "ENDEREÇO"+String.valueOf(i), "TELEFONE"+String.valueOf(i), "EMAIL"+String.valueOf(i));
			c.cadastrar(j);
		}
		
		//Produto
		for(int i=0; i<5; i++)
		{
			Produto p = new Produto();
			p.incluirProduto("NOME "+String.valueOf(i), "TIPO "+String.valueOf(i), 100, 150);
			
			p.cadastrar(j);
		}
		
		//Fornecedor
		for(int i=0; i<20; i++)
		{
			Fornecedor f = new Fornecedor();
			f.incluirFornecedor("NOME "+String.valueOf(i), 1, "ENDEREÇO "+String.valueOf(i), "123456 "+String.valueOf(i), "123456 "+String.valueOf(i), "123123 "+String.valueOf(i), "EMAIL "+String.valueOf(i));
			f.cadastrar(j);
		}
	}
	
	private Map					config;
	private EntityManagerFactory		factory;
	private EntityManager			manager;

}
