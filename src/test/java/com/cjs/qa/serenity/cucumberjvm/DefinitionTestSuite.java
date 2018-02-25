package com.cjs.qa.serenity.cucumberjvm;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/consult_dictionary/LookupADefinition.feature")
public class DefinitionTestSuite
{
}