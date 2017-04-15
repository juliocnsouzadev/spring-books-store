package br.com.juliocnsouza.my_books.conf;

import br.com.juliocnsouza.my_books.controllers.HomeController;
import br.com.juliocnsouza.my_books.dao.ProductDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan( basePackageClasses = { HomeController.class ,
                                       ProductDAO.class } )
public class AppWebConfiguration {

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix( "/WEB-INF/views/" );
        resolver.setSuffix( ".jsp" );
        return resolver;
    }

}
