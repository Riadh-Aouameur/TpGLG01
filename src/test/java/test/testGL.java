package test;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static org.junit.Assert.assertEquals;

public class testGL {


    @When("^ADD Function (\\d+),(\\d+)$")
    public int add_Function(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        return arg1+arg2;
    }

    @Then("^ADD Function Test$")
    public void add_Function_Test() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(19,add_Function(11,8));
    }

    @When("^FACT Function  (\\d+)$")
    public int fact_Function(int arg1) throws Throwable {
        int fact = 1;
        for(int i=1;i<=arg1;i++){
            fact=fact*i;
        }


        return fact;
    }

    @Then("^FACT Function Test$")
    public void fact_Function_Test() throws Throwable {
        assertEquals(6,fact_Function(3));

    }

    @When("^PSO Function \"([^\"]*)\" \"([^\"]*)\"$")
    public int pso_Function(Character arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        return arg2.indexOf(arg1);
    }

    @Then("^PSO Function Test$")
    public void pso_Function_Test() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(3,pso_Function('s',"adasd"));
    }
    @When("^ADD_BIN Function (\\d+) ,(\\d+)$")
    public String add_bin_Function(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        int b1 = arg1;
        int b2 = arg2;
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }

    @Then("^ADD_BIN Function Test$")
    public void add_bin_Function_Test() throws Throwable {
        assertEquals("111",add_bin_Function(6,1));

    }
    @When("^MUL Function(\\d+) ,(\\d+)$")
    public String mul_Function(int arg1, int arg2) throws Throwable {
        int b1 = arg1;
        int b2 = arg2;
        int sum = b1 * b2;
        return Integer.toBinaryString(sum);
    }

    @Then("^MUL Function Test$")
    public void mul_Function_Test() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("110",mul_Function(6,1));
    }


}
