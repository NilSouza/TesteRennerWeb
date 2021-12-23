package steps;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import elementos.ElementosTestes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.MetodosdeTeste;

public class RennerStepTeste {

	WebDriver driver;
	MetodosdeTeste page = new MetodosdeTeste();
	ElementosTestes elementos = new ElementosTestes();
	LoginPage login = new LoginPage ();

@BeforeClass

	@Given("que eu esteja no site")
	public void que_eu_esteja_no_site() {
		page.abrirNavegador("http://automationpractice.com/.");
	}

	@Given("clicar em sign in")
	public void clicar_em_sign_in() {
		page.clicar(elementos.getLinkSignin());
	}

	@Given("preencher email e password clicar no botaoSignIn")
	public void preencher_email_e_password_clicar_no_botao_sign_in() {
		login.login();
		
	}

	@Given("clicar em Dresses comprar Printed Chiffon Dress cor verde e tamanho M Adc ao carrinho")
	public void clicar_em_dresses_comprar_printed_chiffon_dress_cor_verde_e_tamanho_m_adc_ao_carrinho() throws InterruptedException {
		page.clicar(elementos.getBtnDresses());
		page.clicar(elementos.getPrintedChiffonDress());
		page.clicar(elementos.getCorVerde());
		page.selecionar(elementos.getTamM());
		page.clicar(elementos.getAddToCart());
		page.pausa(1000);
		page.clicar(elementos.getBtncontinueshopping());
		
	
	}

	@Given("clicar em T-SHIRTS escolher o modelo Faded Short Sleeve na cor azul adi no carrinho")
	public void clicar_em_t_shirts_escolher_o_modelo_faded_short_sleeve_na_cor_azul_adi_no_carrinho() throws InterruptedException {
		page.clicar(elementos.gettShirts());
		System.out.println(page.validarClickTShirts());
		assertEquals("T-shirts", page.validarClickTShirts());
		page.clicar(elementos.getFadedShortSleeveTshirts());
		page.clicar(elementos.getCorBlue());
		page.clicar(elementos.getAddToCart());
		page.pausa(1000);
		page.clicar(elementos.getBtncontinueshopping());

	}

	@Given("clicar Women selecionar o modelo Blouse Adc ao carrinho")
	public void arrastar_o_mouse_em_women_e_clicar_no_modelo_blouse_adc_ao_carrinho() throws InterruptedException {
		page.clicar(elementos.getWomen());
		page.clicar(elementos.getBlouse());
		page.pausa(1000);
		page.clicar(elementos.getQuantity());
		page.clicar(elementos.getAddToCart());
		page.clicar(elementos.getBtncontinueshopping());
		
	}

	@Given("clicar em Dresses Adc ao carrinho  Printed Dresse")
	public void clicar_em_dresses_adc_ao_carrinho_printed_dresse() throws InterruptedException {
		page.clicar(elementos.getBtnDresses());
		page.scroll(elementos.getModeloPrintedDress());
		page.clicar(elementos.getPrinteddress());
		page.pausa(500);
		page.frame(0);
		page.clicar(elementos.getAddTocart3());
		page.sairFrame();
		page.pausa(500);
		page.clicar(elementos.getBtnProceedtocheckout());
		
		
	}
	@When("selecionado os produtos clicar em Proceed to Checkout tres vezes")
	public void selecionado_os_produtos_clicar_em_proceed_to_checkout_tres_vezes() {
		page.scroll(elementos.getFallows());
		page.clicar(elementos.getBtnProceedtocheckout1());
	    
	}

	@When("clicar em Terms of service clicar novamente em Proceed to Checkout")
	public void clicar_em_terms_of_service_clicar_novamente_em_proceed_to_checkout() throws InterruptedException {
		page.scroll(elementos.getFallows());
		page.clicar(elementos.getBtnProceedtocheckout2());
		page.pausa(1000);
		page.clicar(elementos.getTermOfService());
		page.clicar(elementos.getBtnProceedtocheckout3());
	}

	@When("clicar Pay by bank wi"
			+ "re")
	public void clicar_pay_by_bank_wire() {
	   page.scroll(elementos.getPaybybank());	
	   page.clicar(elementos.getPaybybank());
	}
	
	@Then("compra efetuada com sucesso")
	public void compra_efetuada_com_sucesso() throws InterruptedException {
	    page.clicar(elementos.getConfirmyorder());
	    page.pausa(1000);
	    page.getTextCompare(elementos.getTextoconfirmacao(), "Your order on My Store is complete.");
	    page.fecharTodasAbas();
	}
}


