package Conhecimento.farmacia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

//@Configuration = anotação de identificação que a classe DataSourceConfig é uma classe de configuração do banco de dados
@Configuration
public class DataSourceConfig {

    //Beans são instancias de classes que são gerenciadas por um Spring Ioc container.
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); // padrão mysql
        dataSource.setUrl("jdbc:mysql://localhost:3306/farmacia_db"); // padrão mysql, apenas o "farmacia_db" foi a escolha para o nome do meu banco de dados
        //Username e senha "root" abaixo:
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }
}
