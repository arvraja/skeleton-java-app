package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

//  @Test
//  public void knowsWhoWroteRomeoAndJuliet() throws Exception {
//    assertThat(queryProcessor.process("Who wrote Romeo And Juliet"), containsString("Shakespeare"));
//  }
//
//  @Test
//  public void isNotCaseSensitive() throws Exception {
//    assertThat(queryProcessor.process("who wrote romeo and juliet"), containsString("Shakespeare"));
//  }
//
  @Test
  public void testReturnMaxNumber() throws Exception {
    assertThat(queryProcessor.process("c35647e0: which of the following numbers is the largest: 673, 98, 74, 940\n"), is("940"));
  }

  @Test
  public void testReturnPlus() throws Exception {
    assertThat(queryProcessor.process("c35647e0: what is 15 plus 1\n"), is("16"));
  }
  @Test
  public void testReturnSqaureCube() throws Exception {
    assertThat(queryProcessor.process("c35647e0: which of the following numbers is both a square and a cube: 729, 1444, 4, 563\n"), is("729"));
  }
  @Test
  public void testPrime() throws Exception {
    assertThat(queryProcessor.process("c35647e0: which of the following numbers are primes: 275, 409\n"), is("409"));
  }
  @Test
  public void testReturnmult() throws Exception {
    assertThat(queryProcessor.process("c35647e0: what is 19 multiplied by 2\n"), is("38"));
  }
  @Test
  public void testReturnMinus() throws Exception {
    assertThat(queryProcessor.process("  0ab3c7e0: what is 10 minus 14\n"), is("-4"));
  }
  @Test
  public void testReturnFib() throws Exception {
    assertThat(queryProcessor.process("   5131d0c0: what is the 18th number in the Fibonacci sequence\n"), is("2584"));
  }

}
