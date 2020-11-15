package com.nagra;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\com\\nagra\\testcases"}

                    ,plugin = {"pretty", "html:target/cucumber"})
public class AppTest 
{

}
