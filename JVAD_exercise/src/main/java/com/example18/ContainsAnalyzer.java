/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example18;

/**
 *
 * @author keora
 */
public class ContainsAnalyzer implements StringAnalyzer {
    @Override
  public boolean analyze(String target, String searchStr){
    return target.contains(searchStr);
  }
}
