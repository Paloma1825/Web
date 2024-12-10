package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Funciones.Funciones;

public class Ejercicio {

	@Test
	public void  Test() throws InterruptedException {
		
		WebDriver driver;

		driver = new ChromeDriver ();
		
		driver.get("https://duckduckgo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		Funciones funcion= new Funciones();
		
		funcion.Buscar(driver);
		
		funcion.Navegar(driver);
		
		Thread.sleep(3000);
		
		
		driver.quit();
	}
}
