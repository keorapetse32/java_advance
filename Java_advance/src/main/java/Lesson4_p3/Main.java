/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4_p3;

/**
 *
 * @author keora
 */
public class Main {
    public static void main(String[] args) {
    PeerSingleton peerList01 = PeerSingleton.getInstance();
    PeerSingleton peerList02 = PeerSingleton.getInstance();
    
    for(String hostName:peerList01.getHostNames()){
      System.out.println("Host name: " + hostName);
    }

    System.out.println();
    for(String hostName:peerList02.getHostNames()){
      System.out.println("Host name: " + hostName);
    }
  }
}
