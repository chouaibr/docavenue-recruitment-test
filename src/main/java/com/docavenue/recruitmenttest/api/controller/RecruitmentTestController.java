/**
 *
 */
package com.docavenue.recruitmenttest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.docavenue.recruitmenttest.api.RecruitmentTestApi;
import com.docavenue.recruitmenttest.api.config.RecruitmentTestConfiguration;
import com.docavenue.recruitmenttest.api.exception.RecruitmentTestExceptionHandler;
import com.docavenue.recruitmenttest.api.model.Post;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author crabhi
 *
 */
@Controller
@RequestMapping("/recruitmenttest/v1")
@EnableSwagger2
public class RecruitmentTestController extends RecruitmentTestExceptionHandler implements RecruitmentTestApi {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private RecruitmentTestConfiguration config;

	@Override
	public ResponseEntity<List<Post>> getPosts() {

		ResponseEntity<List> response = restTemplate.getForEntity(config.getJsonPlaceHolderPostUrl(), List.class);
		return ResponseEntity.ok().body(response.getBody());
	}

}
