package br.papelaria.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorPersistencia {
	public boolean cadastrar( JFrame janela)
	{
		try
		{
			this.factory    = Persistence.createEntityManagerFactory("papelaria", new br.papelaria.control.ControladorBancoDeDados().getConfigBD());
			this.manager    = factory.createEntityManager();

			this.manager.getTransaction().begin();

			this.manager.persist(this);

			this.manager.getTransaction().commit();

			this.manager.close();
			this.factory.close();

			

			return true;
		}
		catch (Exception e)
		{
			
			return false;
		}
	}
	
	/*
	 * Método atualiza
	 * Atualiza o objeto no banco de dados
	 * PARAMETROS
	 *		JFrame	janela	= janela que chamou o método
	 *							Usado em caso de erro para setar a janela de erro como modal
	 */
	public boolean atualizar(JFrame janela)
	{
		try
		{
			this.factory    = Persistence.createEntityManagerFactory("papelaria", new br.papelaria.control.ControladorBancoDeDados().getConfigBD());
			this.manager     = factory.createEntityManager();

			this.manager.getTransaction().begin();

			this.manager.merge(this);

			this.manager.getTransaction().commit();

			this.manager.close();
			this.factory.close();

			/*JOptionPane.showMessageDialog	(
											janela, 
											"Sucesso ao cadastrar!",
											"Sucesso ao atualizar!", 
											JOptionPane.INFORMATION_MESSAGE, 
											new javax.swing.ImageIcon(getClass().getResource("/biblioteca/view/img/dialog-accept.png"))
										);*/

			return true;
		}
		catch (Exception e)
		{
			/*JOptionPane.showMessageDialog	(
											janela, 
											"Erro!\nCausa: "+e.getCause()+"\nMensagem: "+e.getMessage(), 
											"Erro ao atualizar!",
											JOptionPane.ERROR_MESSAGE, 
											new javax.swing.ImageIcon(getClass().getResource("/biblioteca/view/img/dialog-cancel.png"))
										);*/
			return false;
		}
	}
	
	/*
	 * Método apagar
	 * Apaga o objeto do banco de dados
	 * PARAMETROS
	 *		Long		codigo	= Codigo do objeto que sera buscado
	 *		JFrame	janela	= janela que chamou o método
	 *							Usado em caso de erro para setar a janela de erro como modal
	 */
	public boolean apagar(Long codigo,  JFrame janela)
	{
		try
		{
			this.factory    = Persistence.createEntityManagerFactory("papelaria", new br.papelaria.control.ControladorBancoDeDados().getConfigBD());
			this.manager = this.factory.createEntityManager();

			this.manager.getTransaction().begin();

			//Apagando
			Object o = manager.find(this.getClass(), codigo);
			this.manager.remove(o);

			this.manager.getTransaction().commit();

			this.manager.close();
			this.factory.close();

			/*JOptionPane.showMessageDialog	(
											janela, 
											"Sucesso ao cadastrar!",
											"Sucesso ao apagar!", 
											JOptionPane.INFORMATION_MESSAGE, 
											new javax.swing.ImageIcon(getClass().getResource("/biblioteca/view/img/dialog-accept.png"))
										);*/

			return true;
		}
		catch (Exception e)
		{
			/*JOptionPane.showMessageDialog	(
											janela, 
											"Erro!\nCausa: "+e.getCause()+"\nMensagem: "+e.getMessage(), 
											"Erro ao apagar!",
											JOptionPane.ERROR_MESSAGE, 
											new javax.swing.ImageIcon(getClass().getResource("/biblioteca/view/img/dialog-cancel.png"))
										);*/
			return false;
		}
	}
	
	private EntityManager			manager;
	private EntityManagerFactory		factory;
	

}
