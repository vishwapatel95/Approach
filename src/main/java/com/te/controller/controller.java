package com.te.controller;

import com.te.dao.ConnectTest;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/testing")
public class controller extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("hello");
        String username = request.getParameter("username");
        String pass = request.getParameter("password");

        ConnectTest dao = new ConnectTest() ;
        dao.testConn();
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("hello");
        String username = request.getParameter("username");
        String pass = request.getParameter("password");

        ConnectTest dao = new ConnectTest() ;
        dao.testConn();
    }
}
