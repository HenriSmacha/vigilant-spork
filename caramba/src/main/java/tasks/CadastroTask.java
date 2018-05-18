package tasks;


import org.openqa.selenium.WebDriver;
import appobject.CadastroAppObject;

public class CadastroTask {
	
	private CadastroAppObject cadastroAppObject;
	
	public CadastroTask(WebDriver driver) {
		this.cadastroAppObject = new CadastroAppObject(driver);
	}
	
	public void preenchercadastro(String nome, String email, String senha, String confirmaSenha, String telefone, String cidade) {
		this.cadastroAppObject.getNomeCompletoTextField().sendKeys(nome);
		this.cadastroAppObject.getEmailTextField().sendKeys(email);
		this.cadastroAppObject.getSenhatextField().sendKeys(senha);
		this.cadastroAppObject.getConfirmarSenhaTextField().sendKeys(confirmaSenha);
		this.cadastroAppObject.getTelefoneTextField().sendKeys(telefone);
	}
	
	public void enviarFormulario() {
		this.cadastroAppObject.getCadastrarButton().click();		
	}

}
