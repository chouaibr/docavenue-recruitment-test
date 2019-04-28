/**
 *
 */
package com.docavenue.recruitmenttest.api.model;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

/**
 * @author crabhi
 *
 */
@Validated
@Getter
@Setter
@ApiModel(description = "Post object")
public class Post {
	@JsonProperty("userId")
	Long userId;

	@JsonProperty("id")
	Long id;

	@JsonProperty("title")
	String title;

	@JsonProperty("body")
	String body;
}
