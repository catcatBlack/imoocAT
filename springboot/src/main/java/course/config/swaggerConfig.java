package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class swaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //.enable(true)
                .pathMapping("/")
                .select()
                //.apis(RequestHandlerSelectors.basePackage("config"))
                .paths(PathSelectors.regex("/.*"))
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("我的接口文档")
                .contact(new Contact("iora","","2811083971@qq.com"))
                .description("这是我的swaggerui生成的接口文档")
                //.termsOfServiceUrl("http://localhost:8341")
                .version("1.0.0.0")
                .build();
    }
}
