package com.nagra;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/report/report.html"
                ,"json:target/report/cucumber.json"
                ,"junit:target/report/cucumber.xml"
                ,"rerun:target/report/rerun.txt"}
                ,monochrome = true
                ,publish = true)
public class AppTest {

}
