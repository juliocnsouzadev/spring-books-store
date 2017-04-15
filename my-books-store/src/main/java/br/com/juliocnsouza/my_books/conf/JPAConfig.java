package br.com.juliocnsouza.my_books.conf;

import br.com.juliocnsouza.my_books.model.Product;
import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author julio
 */
@EnableTransactionManagement
public class JPAConfig {

    private static final String URL = "jdbc:mysql://69.10.49.65:3306/mybookstore";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "IAVbkv28143";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        final LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();

        JpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        factory.setJpaVendorAdapter( jpaVendorAdapter );

        final DriverManagerDataSource dataSource = new DriverManagerDataSource( URL , USER_NAME , PASSWORD );
        dataSource.setDriverClassName( DRIVER );
        factory.setDataSource( dataSource );

        final Properties properties = new Properties();
        properties.setProperty( "hibertnate.dialect" , "org.hibernate.MySQL5Dialect" );
        properties.setProperty( "hibernate.show_sql" , "true" );
        properties.setProperty( "hibernate.hbm2ddl.auto" , "update" );
        factory.setJpaProperties( properties );

        factory.setPackagesToScan( Product.class.getPackage().getName() );

        return factory;
    }

    @Bean
    public JpaTransactionManager transactionManager( EntityManagerFactory emf ) {
        return new JpaTransactionManager( emf );
    }

}
