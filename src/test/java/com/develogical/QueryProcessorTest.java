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
//  which of the following numbers is both a square and a cube: 162, 1444, 4, 563
}
