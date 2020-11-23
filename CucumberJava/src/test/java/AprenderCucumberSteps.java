
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AprenderCucumberSteps {
	
	
    private int contador = 0;
	
	@Given("que o valor do contador é (\\d+)")
	public void que_o_valor_do_contador(Integer int1) {
	   contador = int1; 
	}

	@When("eu incremenar em (\\d+)")
	public void eu_incremenar_em(Integer int1) {
		contador = contador + int1;
	    
	}

	@Then("o valor do contador ser? (\\d+)")
	public void o_valor_do_contador_será1(Integer int1) {
		
    System.out.println(int1);
	
	}
	
	
	Date entrega = new Date();
	private String dataFormatada;


	@Given("que a entrega é dia {data}")
	public void que_a_entrega_dia(Date data) {
		
		entrega = data;
		
		System.out.println(entrega);
		
	}
		

	@When("^a entrega atrasar em (\\d+) dias (.+)$")
	public void a_entrega_atrasar_em_dias(String tempo) throws Throwable {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if(tempo.equals("dias")) {
		cal.add(Calendar.DAY_OF_MONTH,  contador);
		entrega = cal.getTime();
		
		}
		
		if (tempo.equals("meses"))
			cal.add(Calendar.MONTH, contador);
	}

	@Then("^a entrega será efetuada em (\\d+\\/\\d+\\/\\d+)$")
	public void a_entrega_ser_efetuada_em(String data) {
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		setDataFormatada(format.format(entrega));
		
		
	 Assert.assertEquals(dataFormatada, dataFormatada);
	   
	}

	public String getDataFormatada() {
		return dataFormatada;
	}

	public void setDataFormatada(String dataFormatada) {
		this.dataFormatada = dataFormatada;
	}
	
	
	
	@Given("que o ticket é AF(\\d+)")
	public void que_o_ticket_AF(int arg1) throws Throwable{
	    
	}

	@Given("que o valor da passagem é R\\$ (\\d+),(\\d+)")
	public void que_o_valor_da_passagem_R$(Double double1) {
	    
	}

	@Given("que o nome do passageiro é \"(.{5,20})\"$")
	public void que_o_nome_do_passageiro(String string) {
	   
	}

	@Given("^que o telefone do passageiro é (9\\d{3}-\\d{4})$")
	public void que_o_telefone_do_passageiro(String telefone) {
	    
	}

	@When("criar os steps")
	public void criar_os_steps() {
	    
	}

	@Then("o teste vai funcionar")
	public void o_teste_vai_funcionar() {
	    
	}
	
	

@Given("^que o ticket é A.(\\d+)$")
public void que_o_ticket_AB167() {
    
}

@Given("^que o ticket (  especial) é A.(\\d+)$")
public void que_o_ticket_especial_AB167(String tipo, int arg1) {
    
	
}

@Given("^que o valor da passagem é R\\$ (\\d+),(\\d+)$")
public void que_o_valor_da_passagem_R$(int arg1, int arg2) {
    
	   
}


@Given("que o ticket é CD123")
public void que_o_ticket_CD123() {
    
}

@Given("que o ticket ? AG1234")
public void que_o_ticket_AG1234() {
  
}

@Given("que o valor da passagem ? R\\$ (\\d+),(\\d+)$")
public void que_o_valor_da_passagem_R$(Double double1, Integer int1) {
  
}



}

	

