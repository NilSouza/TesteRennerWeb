package pages;


import elementos.ElementosTestes;


public class LoginPage {

	MetodosdeTeste page = new MetodosdeTeste();
	ElementosTestes elementos = new ElementosTestes();
	

	public void login() {
		page.escrever(elementos.getEmailaddress(), "nilsoncorreasouza@gmail.com");
		page.escrever(elementos.getPassword(), "ben23@10");
		page.clicar(elementos.getBotaoSignIn());
	}

}
