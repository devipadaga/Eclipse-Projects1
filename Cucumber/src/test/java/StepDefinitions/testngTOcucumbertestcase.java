package StepDefinitions;

import io.cucumber.java.en.*;

public class testngTOcucumbertestcase {
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA");
	}
	

	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("BBBBBBBBBBBBBBBBBBBBBBB");
	    
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("CCCCCCCCCCCCCCCCCCCCCCCC");
	   
	}

	@When("some other action")
	public void some_other_action() {
		System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
	    
	}

	@When("yet another action")
	public void yet_another_action() {
		System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEE");
	    
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("FFFFFFFFFFFFFFFFFFFFFFFFFFF");
	    
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
	    
	}


}
