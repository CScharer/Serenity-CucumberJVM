package com.cjs.qa.serenity.cucumberjvm.steps;

import com.cjs.qa.serenity.cucumberjvm.steps.serenity.EndUserSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DefinitionSteps
{
	@Steps
	EndUserSteps endUserSteps;

	@Given("the user is on the Wikionary home page")
	public void givenTheUserIsOnTheWikionaryHomePage()
	{
		endUserSteps.is_the_home_page();
	}

	@When("the user looks up the definition of the word '(.*)'")
	public void whenTheUserLooksUpTheDefinitionOf(String word)
	{
		endUserSteps.looks_for(word);
	}

	@Then("they should see the definition '(.*)'")
	public void thenTheyShouldSeeADefinitionContainingTheWords(String definition)
	{
		endUserSteps.should_see_definition(definition);
	}
}
