package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.CadastroTask;

public class CadastroTestCase {
	
	private WebDriver driver;
	private CadastroTask cadastro;


	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();   
		this.driver = new ChromeDriver();
		this.driver.get("http://www.xiru.rs/d/trocas/homolog/usuarios/cadastrar");
		this.driver.manage().window().maximize();
		this.cadastro = new CadastroTask(driver);
	}
		
	@Test
	public void testMain() {
		this.cadastro.preenchercadastro("Maria", "teste@test", "senha", "senha", "999999999", "Porto Alegre");
		this.cadastro.enviarFormulario();
	}
		
	@After
	public void tearDown() {
		this.driver.quit();
	}
}
