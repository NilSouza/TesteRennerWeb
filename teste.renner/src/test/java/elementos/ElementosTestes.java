package elementos;

import org.openqa.selenium.By;

public class ElementosTestes {

	// Elementos Login

	private By linkSignin = By.xpath("//div[@class='header_user_info']//a");
	private By Emailaddress = By.id("email");
	private By Password = By.id("passwd");
	private By botaoSignIn = By.id("SubmitLogin");

	// Elementos de Compra 1

	private By btnDresses = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
	private By PrintedChiffonDress = By.xpath("//a[@class='product-name'][contains(.,'Printed Chiffon Dress')]");
	private By corVerde = By.name("Green");
	private By tamM = By.name("group_1");
	private By AddToCart = By.xpath("//span[contains(.,'Add to cart')]");
	private By btncontinueshopping = By.xpath("//div[@class='button-container']/span/span");
	
	
	// Elementos de Compra 2

	private By tShirts = By.xpath("(//li)[14]");
	private By FadedShortSleeveTshirts = By.xpath("//a[contains(.,'Faded Short Sleeve T-shirts')]");
	private By corBlue = By.name("Blue");
	

	// Elementos de Compra 3

	private By Women = By.xpath("//a[text()=\"Women\"]");
	private By Blouse = By.xpath("//a[@class='product-name'][contains(.,'Blouse')]");
	private By Quantity = By.xpath("//i[contains(@class,'icon-plus')]");
	
	// Elementos de Compra 4

	private By modeloPrintedDress = By.xpath("//*[@id=\"ul_layered_id_attribute_group_3\"]/li[8]/label/a");
	private By Printeddress = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img");
	private By AddTocart3 = By.cssSelector("#buy_block > div > div.box-cart-bottom > div:nth-child(1)");
	private By btnProceedtocheckout = By.xpath("//a[@title=\"Proceed to checkout\"]");
	
	// Elementos de Checkout
	
	private By btnProceedtocheckout1 = By.xpath("(//a)[66][span='Proceed to checkout']");
	private By fallows = By.xpath("//section[@id='social_block']");
	private By btnProceedtocheckout2 = By.xpath("(//button)[2][span='Proceed to checkout']");
	private By TermOfService = By.xpath("(//input)[6]");
	private By btnProceedtocheckout3 = By.xpath("(//button)[2]");
	private By paybybank = By.xpath("(//p)[7]");
	private By confirmyorder = By.xpath("(//button)[2]/span");
	private By textoconfirmacao = By.xpath("(//strong)[7]");
	
	

	public By getLinkSignin() {
		return linkSignin;
	}

	public By getEmailaddress() {
		return Emailaddress;
	}

	public By getPassword() {
		return Password;
	}

	public By getBotaoSignIn() {
		return botaoSignIn;
	}

	public By getBtnDresses() {

		return btnDresses;
	}

	public By getPrintedChiffonDress() {
		return PrintedChiffonDress;
	}

	public By getCorVerde() {
		return corVerde;
	}

	public By getTamM() {
		return tamM;
	}

	public By getAddToCart() {
		return AddToCart;
	}

	public By getBtncontinueshopping() {
		return btncontinueshopping;
	}

	public By gettShirts() {
		return tShirts;
	}

	public By getFadedShortSleeveTshirts() {
		return FadedShortSleeveTshirts;
	}

	public By getCorBlue() {
		return corBlue;
	}

	public By getWomen() {
		return Women;
	}

	public By getBlouse() {
		return Blouse;
	}

	public By getQuantity() {
		return Quantity;
	}

	public By getModeloPrintedDress() {
		return modeloPrintedDress;
	}

	public By getBtnProceedtocheckout() {
		return btnProceedtocheckout;
	}

	public By getBtnProceedtocheckout1() {
		return btnProceedtocheckout1;
	}

	public By getFallows() {
		return fallows;
	}

	public By getBtnProceedtocheckout2() {
		return btnProceedtocheckout2;
	}

	public By getTermOfService() {
		return TermOfService;
	}

	public By getBtnProceedtocheckout3() {
		return btnProceedtocheckout3;
	}

	public By getPaybybank() {
		return paybybank;
	}

	public By getConfirmyorder() {
		return confirmyorder;
	}

	public By getTextoconfirmacao() {
		return textoconfirmacao;
	}

	public By getPrinteddress() {
		return Printeddress;
	}

	public By getAddTocart3() {
		return AddTocart3;
	}

	

}
