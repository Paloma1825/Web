package Funciones;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Localizadores.Localizadores;

public class Funciones {

	Localizadores identificador = new Localizadores();
	
	public void Buscar(WebDriver driver) {
		
		
		driver.findElement(identificador.Buscador).sendKeys("Toledo");
		driver.findElement(identificador.Buscador).sendKeys(Keys.ENTER);
	}
	
	public void Navegar (WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement Element = (WebElement)driver.findElement(identificador.Enlace);

        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
        Element.click();
	}
	
	
}
