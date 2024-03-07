package com.Get_DataTable;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_DataTable_StepDefinition {
	
	 Response  response = null;
	@Given("Hit the book store api")
	public void hit_the_book_store_api() {
	response = RestAssured.get("https://demoqa.com/BookStore/v1/Books"); 
	}
	@Then("validate as status code")
	public void validate_as_status_code() {
	    int statuscode = response.getStatusCode();
	    System.out.println("Staus Code = " + statuscode);
	    Assert.assertTrue("Status Code Not Matching", statuscode==200);
	}
	@Then("validate data from response")
	public void validate_data_from_response(DataTable alldata) {
		List<List <String>> allListItemsList = alldata.asLists();
		for(int i = 0; i<allListItemsList.size(); i++) {
			String expValue  = allListItemsList.get(i).get(0);
			String actualValue = response.getBody().jsonPath().getString(allListItemsList.get(i).get(1));
			Assert.assertTrue("Value not maching", expValue.equals(actualValue) );
		
		}   
	}
	




}
