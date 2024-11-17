///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
// */
package com.calebjosue.bookstore.repository;
//
//
//
import org.wildfly.arquillian.junit.annotations.WildFlyArquillian;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
//
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
//
///**
// *
// * @author calebjosue
// */
//
@WildFlyArquillian
public class BookRepositoryTest {
//    
    public BookRepositoryTest() {
    }
//    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }
//    
    @Deployment
    public static JavaArchive createDeployment() {
//        
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(BookRepository.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }
//
//    /**
//     * Test of find method, of class BookRepository.
//     */
////    @Test
////    public void testFind() {
////        System.out.println("find");
////        Long id = null;
////        BookRepository instance = new BookRepository();
////        Book expResult = null;
////        Book result = instance.find(id);
////        Assertions.assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        Assertions.fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of create method, of class BookRepository.
//     */
    @Test
    public void testCreate() {
////        System.out.println("create");
////        Book book = null;
////        BookRepository instance = new BookRepository();
////        Book expResult = null;
////        Book result = instance.create(book);
////        Assertions.assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        Assertions.fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of delete method, of class BookRepository.
//     */
////    @Test
////    public void testDelete() {
////        System.out.println("delete");
////        Long id = null;
////        BookRepository instance = new BookRepository();
////        instance.delete(id);
////        // TODO review the generated test code and remove the default call to fail.
////        Assertions.fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of findAll method, of class BookRepository.
//     */
////    @Test
////    public void testFindAll() {
////        System.out.println("findAll");
////        BookRepository instance = new BookRepository();
////        List<Book> expResult = null;
////        List<Book> result = instance.findAll();
////        Assertions.assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        Assertions.fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of countBooks method, of class BookRepository.
//     */
////    @Test
////    public void testCountBooks() {
////        System.out.println("countBooks");
////        BookRepository instance = new BookRepository();
////        Long expResult = null;
////        Long result = instance.countBooks();
////        Assertions.assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        Assertions.fail("The test case is a prototype.");
////    }
}