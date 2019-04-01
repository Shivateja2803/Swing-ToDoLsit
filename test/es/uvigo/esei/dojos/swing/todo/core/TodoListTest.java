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
    @Test
    public void testMoveDown() {
        System.out.println("moveDown");
        TodoList instance = new TodoList();
        String name = "Suresh";
        instance.add(name);
        name = "Siva";
        instance.add(name);
        name = "ABCD";
        instance.add(name); 
        instance.moveDown(1);//entry moving up to the position one 
        String Expresult = "Siva";
        String result = instance.elementAt(2); // check position at one
        assertEquals(Expresult,result);
        System.out.println("entry is moved down to the one postion");
    }
    
    @Test
    public void testAdd() {
        System.out.println("add");
        String item = "ABCD";
        TodoList instance = new TodoList();
        instance.add(item);
        int i = instance.size();
        assertTrue(i>0);
        System.out.println("entry is added to the list");
    }
    
    @Test
    public void testEditAt() {
        System.out.println("editAt");
        TodoList instance = new TodoList();
        int i = 0;
        String item = "ABCD";
        instance.add(item);
        item = "STEEVE";
        instance.add(item); 
        item = "BENETT";
        instance.add(item);
        String result = instance.elementAt(1); // check position at one
        System.out.println("entry is at position 1"+result);
        String newValue = "JOHN";
        instance.editAt(1, newValue);
        result = instance.elementAt(1); // check position at one
        System.out.println("After editing the entry at positon at 1"+result);
        assertEquals(newValue,result);
        System.out.println("entry is successfully edited");
    }
    
    @Test
    public void testRemoveAt() {
        System.out.println("removeAt");
        int i = 0;
        TodoList instance = new TodoList();
        String item = "ABCD";
        instance.add(item);
        item = "STEEVE";
        instance.add(item); 
        item = "BENETT";
        instance.add(item);
        i = instance.size();
        i = i - 2; // get position of 1
        instance.removeAt(i);// removing the entry at postion 1
        //check the entry STEEVE is removed
        String ExpResult = "STEEVE"; 
        String result = instance.elementAt(i); // check position at one
        assertNotEquals(ExpResult,result);
        System.out.println("entry is deleted successfully");
    }
    
    @Test
    public void testSize() {
        System.out.println("size");
        TodoList instance = new TodoList();
        String item = "ABCD";
        instance.add(item);
        item = "STEEVE";
        instance.add(item); 
        item = "BENETT";
        instance.add(item);
        int expResult = 3;
        int result = instance.size();
        assertEquals(expResult, result);
         System.out.println("size of the list is"+result);
    }
    

}
