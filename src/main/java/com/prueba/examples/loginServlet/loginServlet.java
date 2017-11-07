package com.prueba.examples.loginServlet;

import com.prueba.examples.loginBean.loginBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public loginServlet() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        loginBean login = new loginBean();
        login.setName(name);
        login.setPassword(password);
        boolean autenticado = login.autenticacion();

        RequestDispatcher dispatcher =null;
        if(autenticado) {
            dispatcher = request.getRequestDispatcher("/resources/static/views/welcome.html");

        } else {
            dispatcher = request.getRequestDispatcher("/resources/static/views/error404.html");
        }
        //llamado a la accion
        dispatcher.forward(request,response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("ok!").append(request.getContextPath());
    }
}
