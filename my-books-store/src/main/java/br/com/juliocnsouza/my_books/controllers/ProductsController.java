package br.com.juliocnsouza.my_books.controllers;

import br.com.juliocnsouza.my_books.dao.ProductDAO;
import br.com.juliocnsouza.my_books.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductsController {

    @Autowired
    private ProductDAO productDAO;

    @RequestMapping( "products/form" )
    public String form() {
        return "products/form";
    }

    @RequestMapping( "products" )
    public String save( Product product ) {
        productDAO.save( product );
        return "products/ok";
    }

}
