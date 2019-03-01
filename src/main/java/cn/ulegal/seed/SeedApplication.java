package cn.ulegal.seed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan(basePackages = "cn.ulegal.seed.dao")
public class SeedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeedApplication.class, args);
	}

}
