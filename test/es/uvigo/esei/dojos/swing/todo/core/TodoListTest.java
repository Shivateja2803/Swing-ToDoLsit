/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.dojos.swing.todo.core;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class TodoListTest {
    
    public TodoListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testMoveUp() {
        System.out.println("moveUp");
        int i = 0;
        TodoList instance = new TodoList();
        String name = "Suresh";
        instance.add(name);
        name = "Siva";
        instance.add(name);
        name = "ABCD";
        instance.add(name); 
        instance.moveUp(2);//entry moving up to the position one 
        String Expresult = "ABCD";
        String result = instance.elementAt(1); // check position at one
        assertEquals(Expresult,result);
        System.out.println("entry is moved up one postion");
    }
}
