/**
 *
 */
package com.docavenue.recruitmenttest.api.exception;

import java.text.MessageFormat;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author crabhi
 *
 */

@ControllerAdvice
public class RecruitmentTestExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity handleException(Exception ex) {
		return ResponseEntity.status(404)
				.body(MessageFormat.format("Cause {0} Message {1}", ex.getCause(), ex.getMessage()));
	}

}
