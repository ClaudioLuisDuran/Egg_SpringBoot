/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Claudio Durán
 */
public class Main_coleccionespruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     final Set hashSet = new HashSet(1_000_000);
final Long startHashSetTime = System.currentTimeMillis();
for (int i = 0; i < 1_000_000; i++) {
    hashSet.add(i);
}
final Long endHashSetTime = System.currentTimeMillis();
System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));
 
final Set treeSet = new TreeSet();
final Long startTreeSetTime = System.currentTimeMillis();
for (int i = 0; i < 1_000_000; i++) {
    treeSet.add(i);
}
final Long endTreeSetTime = System.currentTimeMillis();
System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));
 
final Set linkedHashSet = new LinkedHashSet(1_000_000);
final Long startLinkedHashSetTime = System.currentTimeMillis();
for (int i = 0; i < 1_000_000; i++) {
    linkedHashSet.add(i);
}
final Long endLinkedHashSetTime = System.currentTimeMillis();
System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
    }
    
}
