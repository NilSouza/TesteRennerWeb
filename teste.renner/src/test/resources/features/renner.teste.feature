

Feature: Cadastro e Compras 
Como cliente cadastrado quero fazer compras para ficar bem vestido

 @renner1
  Scenario: Comprar produtos
  Given que eu esteja no site
  And clicar em sign in
  And preencher email e password clicar no botaoSignIn 
  And clicar em Dresses comprar Printed Chiffon Dress cor verde e tamanho M Adc ao carrinho 
  And clicar em T-SHIRTS escolher o modelo Faded Short Sleeve na cor azul adi no carrinho
  And  clicar Women selecionar o modelo Blouse Adc ao carrinho 
  And clicar em Dresses Adc ao carrinho  Printed Dresse
	When selecionado os produtos clicar em Proceed to Checkout tres vezes
	And clicar em Terms of service clicar novamente em Proceed to Checkout
 	And clicar Pay by bank wire
 	Then compra efetuada com sucesso

  
  
  
  