Feature: Aprender Cucumber
Como um aluno
Eu quero aprender a utilizar Cucumber
Para que eu possa automatizar crit�rios de aceita��o


Scenario: Deve executar especifica��o
Given que criei o arquivo corretamente
When execut�-lo
Then a especifica��o deve finalizar com sucesso


Scenario: Deve incrementar contador
Given que o valor do contador � 15
When eu incremenar em 5
Then o valor do contador ser� 18


Scenario: Deve incrementar contador
Given que o valor do contador � 123
When eu incremenar em 35
Then o valor do contador ser� 158


Scenario: Deve calcular atraso na entrega
Given que a entrega � dia 05/04/2018
When a entrega atrasar em 2 dias
Then a entrega ser� efetuada em 07/04/2018


Scenario: Deve calcular atraso no prazo de entrega da China
Given que o prazo � dia 05/04/2018
When a entrega atrasar em 2 meses
Then a entrega ser� efetuada em 05/06/2018


Scenario: Deve criar steps gen�ricos para estes passos
   Given que o ticket � AF345
   And que o valor da passagem � R$ 230,45
   And que o nome do passageiro � "Fulano da Silva"
   And que o telefone do passageiro � 9999-9999
   When criar os steps
   Then o teste vai funcionar
	
	
Scenario: Deve reaproveitar os steps "Dado" do cen�rio anterior
   Given que o ticket � AB167
   Given que o ticket especial � AB167
   Given que o valor da passagem � R$ 1120,23
   Given que o nome do passageiro � "Cicrano de Oliveira"
   Given que o telefone do passageiro � 9888-8888


Scenario: Deve negar todos os steps "Dado" dos cen�rios anteriores
    Given que o ticket � CD123
    Given que o ticket � AG1234
    Given que o valor da passagem � R$ 1.1345,56
    Given que o nome do passageiro � "Beltrano Souza Matos de Alc�ntara Azevedo"
    Given que o telefone do passageiro � 1234-5678
    Given que o telefone do passageiro � 999-2223 
    
    
    

