package learn.java.spring.authserver.config;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.spring.cache.HazelcastCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
//http://websystique.com/spring/spring-4-cacheable-cacheput-cacheevict-caching-cacheconfig-enablecaching-tutorial/
@Configuration
@ImportResource({"classpath:oauth2-cache.xml"})
public class CacheConfiguration {

    @Autowired
    private HazelcastInstance hazelcastInstance;

    @Bean
    public CacheManager hazelcastCacheManager() {
        return new HazelcastCacheManager(hazelcastInstance);
    }
}
