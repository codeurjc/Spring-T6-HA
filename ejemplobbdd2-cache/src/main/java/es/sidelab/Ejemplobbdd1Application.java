package es.sidelab;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;

@EnableCaching
@SpringBootApplication
public class Ejemplobbdd1Application {
	
	private static final Log LOG = LogFactory.getLog(Ejemplobbdd1Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Ejemplobbdd1Application.class, args);
    }
    
    @Bean
    public CacheManager cacheManager() {
    	LOG.info("Activating cache...");
    	return new ConcurrentMapCacheManager("anuncios");
    }
}
