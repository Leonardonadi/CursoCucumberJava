import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import CursoCucumber.entidades.Filme;
import CursoCucumber.entidades.NotaAluguel;
import CursoCucumber.servicos.AluguelService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlugarFilmesSteps {
	
	
	private Filme filme;
	private AluguelService aluguel = new AluguelService();
	private NotaAluguel nota;
	
	@Given("um filme com estoque de (\\d+) unidades")
	public void umFilmeComEstoqueDeUnidades(int arg1) {
		
		filme = new Filme();
		filme.setEstoque(arg1);
	    
	}

	@Given("e que o pre?o de aluguel seja R\\$ (\\d+)")
	public void eQueOPreODeAluguelSejaR$(int arg1) {
	 
		filme.setAluguel(arg1);
		
		
	}

	@When("alugar")
	public void alugar() {
	 
		nota = aluguel.alugar(filme);
		
	}

	@Then("o pre?o do aluguel ser? R\\$ (\\d+)")
	public void oPreODoAluguelSerR$(int arg1) {
		
		Assert.assertEquals(arg1, nota.getPreco());
			
	    
	}

	@Then("a data de entrega ser? no dia seguinte")
	public void aDataDeEntregaSerNoDiaSeguinte() {  
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		
		Date dataRetorno = nota.getDataEntrega();
		Calendar calRetorno = Calendar.getInstance();
		calRetorno.setTime(dataRetorno);
		
		Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH), calRetorno.get(Calendar.DAY_OF_MONTH));
		Assert.assertEquals(cal.get(Calendar.MONTH), calRetorno.get(Calendar.MONTH));
		Assert.assertEquals(cal.get(Calendar.YEAR), calRetorno.get(Calendar.YEAR));
	}

	@Then("o estoque do filme ser? (\\d+) unidade")
	public void oEstoqueDoFilmeSerUnidade(int arg1) {
    Assert.assertEquals(arg1, filme.getEstoque());
	   
	}

}
