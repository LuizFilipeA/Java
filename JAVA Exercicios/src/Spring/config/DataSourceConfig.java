package Spring.config;

import javax.sql.DataSource;

//@Configuration = anotação de identificação que a classe DataSourceConfig é uma classe de configuração do banco de dados
    @Configuration
    public class DataSourceConfig {

        //Beans são instancias de classes que são gerenciadas por um Spring Ioc container.
        @Bean
        public DataSource dataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); // padrão mysql
            dataSource.setUrl("jdbc:mysql://localhost:3306/Spring"); // padrão mysql, apenas o "farmacia_db" foi a escolha de nome para o meu banco de dados
            dataSource.setUsername("root"); //Username do banco de dados
            dataSource.setPassword("root"); //Senha do db
            return dataSource; //retorna o objeto
        }
    }

}
