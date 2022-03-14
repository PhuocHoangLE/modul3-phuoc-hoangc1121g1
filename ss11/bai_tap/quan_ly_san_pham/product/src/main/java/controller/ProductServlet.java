package controller;

import model.Product;
import service.ProductService;
import service.IProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "ProductServlet",urlPatterns = "/products")
public class ProductServlet extends javax.servlet.http.HttpServlet {
    private IProductService productService = new ProductService();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action") ;
        if (action == null ){
            action = "" ;
        }
        switch (action){
            case "create" :
                break;
            default :
                break;
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action") ;
        if (action == null ){
            action = "" ;
        }
        switch (action){
            case "create" :
                break;
            case "add" :
                break;
            default:
                listProducts(request, response);
                break;
        }
    }
    private void listProducts(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products = this.productService.findAll();
        request.setAttribute("products",products);

        RequestDispatcher dispatcher = request.getRequestDispatcher("pr/list.jsp") ;
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
