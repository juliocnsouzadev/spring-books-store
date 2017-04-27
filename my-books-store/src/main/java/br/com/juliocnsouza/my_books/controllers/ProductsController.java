package br.com.juliocnsouza.my_books.controllers;

import br.com.juliocnsouza.my_books.dao.ProductDAO;
import br.com.juliocnsouza.my_books.model.PriceType;
import br.com.juliocnsouza.my_books.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductsController {

    @Autowired
    private ProductDAO productDAO;

    @RequestMapping( "products/form" )
    public ModelAndView form() {
        final ModelAndView modelAndView
                           = new ModelAndView( "products/form" );
        modelAndView.addObject( "types" , PriceType.values() );
        return modelAndView;
    }

    @RequestMapping( "products" )
    public String save( Product product ) {
        productDAO.save( product );
        return "products/ok";
    }

}
