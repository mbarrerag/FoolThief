/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.foolthief;


public class FoolThief {

    public static void main(String[] args) {
        Stolen stolen = new Stolen("111");
        Node<Stolen> obj1 = new Node<Stolen>(stolen);
        System.out.println(obj1.getData().getId());
    }
}
