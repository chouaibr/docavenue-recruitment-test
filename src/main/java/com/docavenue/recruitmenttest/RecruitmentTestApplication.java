package com.docavenue.recruitmenttest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class RecruitmentTestApplication {

	@Value("${api.swagger.title}")
	private String swaggerTitle;
	@Value("${api.swagger.description}")
	private String swaggerDescription;
	@Value("${api.version}")
	private String apiVersion;

	public static void main(String[] args) {
		SpringApplication.run(RecruitmentTestApplication.class, args);
	}

	/**
	 * RestTemplate bean
	 *
	 * @param builder
	 * @return
	 */
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	/**
	 * been
	 *
	 * @return
	 */
	@Bean
	public Docket newsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("recruitmenttest").apiInfo(apiInfo())
				.tags(new Tag("Recruitment Test Controller", "")).select()
				.apis(RequestHandlerSelectors.basePackage("com.docavenue.recruitmenttest")).build();
	}

	/**
	 * bean ApiInfo
	 *
	 * @return
	 */
	@Bean
	public ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(swaggerTitle).description(swaggerDescription).version(apiVersion).build();
	}
}
