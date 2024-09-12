package org.bytetech.config;

import org.bytetech.Alien;
import org.bytetech.Computer;
import org.bytetech.Desktop;
import org.bytetech.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.bytetech")
public class AppConfig {

//    @Bean
//    public Alien alien(Computer comp) { // @Qualifier("desktop")
//        Alien a = new Alien();
//        a.setAge(21);
//        a.setComp(comp);
//
//        return a;
//    }
//
//
//    //    @Bean(name = "lap")
//    //    @Bean(name = {"lap","comp1","Beast"})
//    //    @Scope("prototype")
//
//    @Bean
//    public Laptop laptop() {
//        return new Laptop();
//    }
//
//    @Bean
//    @Primary
//    public Desktop desktop() {
//        return new Desktop();
//    }

}
