package com.Get_StepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class My_SD_Code {
	 Response response = null;
	@Given("hit the bookstore api")
	public void hit_the_bookstore_api() {
	   response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	}
	

	@Then("validate Status code Matching")
	public void validate_status_code_matching() {
		int statuscode =   response.getStatusCode();
		 System.out.println("Status code = " +statuscode);
		 Assert.assertTrue("Status Code not Matching", statuscode==200);
		  
	}



	@Then("validate Git Pocket Guide title present")
	public void validate_git_pocket_guide_title_present() {
		
		String jsonpathString =response.getBody().asString();
		System.out.println("Json = " + jsonpathString);
		String bookTitle = response.getBody().jsonPath().getString("books[0].title");
		Assert.assertTrue("Title not matching" , bookTitle.equals("Git Pocket Guide"));
		
	   
	}
	
	@Then("validate Learning JavaScript Design Patterns title present")
	public void validate_learning_java_script_design_patterns_title_present() {

		String jsonpathString = response.getBody().asString();
		System.out.println("Json = "+jsonpathString);
		String bookTitle = response.getBody().jsonPath().getString("books[1].title");
		System.out.println("Book Title   = " + bookTitle);
		Assert.assertTrue("Book Title Not Matching", bookTitle.equals("Learning JavaScript Design Patterns"));
		
	}
	
	@Then("validate {string} at jsonpath {string} title present")
	public void validate_at_jsonpath_title_present(String title, String jsonpath) {
	String jsonpathString = response.getBody().asString();
	System.out.println("Json = " +jsonpathString);
	String actualTitle = response.getBody().jsonPath().getString(jsonpath);
	Assert.assertTrue("Title Not Matching", actualTitle.equals(title));
	
	}
	
	//Assignment - Validate page numbers of any 2 books
	
	
	  
	@Then("validate {string} at jsonpath {string} pageNumbers present")
	public void validate_at_jsonpath_page_numbers_present(String pageNumbers, String jsonpath) {
		int actualPageNum = response.getBody().jsonPath().getInt(jsonpath);
        int expectedPageNum = Integer.parseInt(pageNumbers);    //code for string to integer and stored that in one variable 
	    Assert.assertTrue("Page Number Not matching", actualPageNum == expectedPageNum);

	
	
	}












}
