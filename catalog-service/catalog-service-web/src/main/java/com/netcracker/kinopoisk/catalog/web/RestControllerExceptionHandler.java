package com.netcracker.kinopoisk.catalog.web;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.netcracker.kinopoisk.catalog.api.dto.ErrorDto;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice(assignableTypes = { CatalogFilmController.class })
@Slf4j
public class RestControllerExceptionHandler {
	private static final String ERROR_CODE_UNDEFINED = "0001";
	private static final String ERROR_CODE_NOT_FOUND = "0002";

	@ExceptionHandler({ NoSuchElementException.class })
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	ResponseEntity<ErrorDto> handleNoSuchElementException(NoSuchElementException ex) {
		log.error("NoSuchElementException", ex);
		return createErrorResponse(ERROR_CODE_NOT_FOUND, ex.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler({ Exception.class })
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	ResponseEntity<ErrorDto> handleRuntimeException(Exception ex) {
		log.error("RuntimeException", ex);
		return createErrorResponse(ERROR_CODE_UNDEFINED, ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	protected ResponseEntity<ErrorDto> createErrorResponse(String code, String message, HttpStatus status) {
		ErrorDto errorDto = new ErrorDto();
		errorDto.setCode(code);
		errorDto.setMessage(message);
		return new ResponseEntity<ErrorDto>(errorDto, status);
	}

}
