package com.basic;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyDemo {
	
	@Given("Login to HRMS system with valid user")
	public void login_to_hrms_system_with_valid_user() {
	     System.out.println("Login");
	}
	@When("go to PIM tab")
	public void go_to_pim_tab() {
	    System.out.println("Clicked PIM");
	}
	@Then("Then add button check")
	public void then_add_button_check() {
	    System.out.println("Checked Add Button");
	}
	@When("go to Admin tab")
	public void go_to_admin_tab() {
	    System.out.println("Now Clicked Admin");
	}
	@Then("Then delete button check")
	public void then_delete_button_check() {
	    System.out.println("Checked Delete button");
	    
	    Assert.assertTrue(false);
	}


}
