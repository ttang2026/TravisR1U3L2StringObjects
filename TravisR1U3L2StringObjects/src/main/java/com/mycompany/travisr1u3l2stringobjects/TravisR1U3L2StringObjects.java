/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.travisr1u3l2stringobjects;

/**
 *
 * @author TTang2026
 */
public class TravisR1U3L2StringObjects {

    public static void main(String[] args) {
        String name = "Travis Tang";
        System.out.println("My name is \"" + name + "\" ");
        System.out.println("My name length is " + name.length());
        System.out.println("My name in upper case is \"" + name.toUpperCase() + "\" ");
        System.out.println("My name in upper case is \"" + name.toLowerCase() + "\" ");
        System.out.println("The first letter in my name is \"" + name.charAt(0) + "\" ");
        System.out.println("The last letter in my name is \"" + name.charAt(name.length() - 1) + "\"");
        System.out.println("The index of the space between the names is " + name.indexOf(' '));
    }
}
