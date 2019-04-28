/**
 *
 */
package com.docavenue.recruitmenttest.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.docavenue.recruitmenttest.api.model.Post;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author crabhi
 *
 */
@Api(value = "Recruitment Test")
@ApiModel(description = "Recruitment Test")
public interface RecruitmentTestApi {

	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful operation", response = Post[].class),
			@ApiResponse(code = 404, message = "Not Found") })
	@RequestMapping(value = "/posts", produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
	ResponseEntity<List<Post>> getPosts() throws Exception;

}
