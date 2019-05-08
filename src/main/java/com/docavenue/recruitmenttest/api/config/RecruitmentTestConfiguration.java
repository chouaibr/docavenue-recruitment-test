/**
 *
 */
package com.docavenue.recruitmenttest.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

/**
 * @author crabhi
 *
 */
@Getter
@Setter
@Configuration
@ComponentScan(basePackages = { "com.docavenue.recruitmenttest.*" })
public class RecruitmentTestConfiguration {

	@Value("${test.json-place-holder.url}")
	private String jsonPlaceHolderPostUrl;

}
