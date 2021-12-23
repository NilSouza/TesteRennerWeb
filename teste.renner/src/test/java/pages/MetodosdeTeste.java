
package pages;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MetodosdeTeste {

	private static WebDriver driver;

	public WebDriver adriver() {

		return driver;

	}

	public void abrirNavegador(String site) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void frame(int frame) {
		driver.switchTo().frame(frame);
	}

	public void sairFrame() {
		driver.switchTo().defaultContent();
	}

	public void scroll(By elemento) {
		WebElement element = driver.findElement(elemento);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void fecharTodasAbas() {
		driver.quit();
	}

	public String validarClickTShirts() {
		return driver.findElement(By.xpath("//span[@class='category-name'][contains(.,'T-shirts')]")).getText();
	}

	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);

	}

	public void selecionar(By elemento) {
		WebElement el = driver.findElement(elemento);
		Select select = new Select(el);
		select.selectByVisibleText("M");
	}

	public void getTextCompare(By elemento, String texto) {
		String text = driver.findElement(elemento).getText();
		assertEquals(texto, text);
		System.out.println("O TEXTO ESPERADO É " + text);

	}

	public static void print(String fileName, WebDriver driver) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		java.io.File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		java.io.File destFile = new java.io.File("./Evidencias/" + fileName + ".png");
		FileUtils.copyFile(scrFile, destFile);

	}
}