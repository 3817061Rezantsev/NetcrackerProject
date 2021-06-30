package com.netcracker.kinopoisk.catalog.web;

import java.sql.SQLException;
import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.ConstraintViolationException;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
	private static final String ERROR_BAD_REQUEST = "0003";
	private static final String ERROR_DB = "DB Error";

	@ExceptionHandler({ NoSuchElementException.class })
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	ResponseEntity<ErrorDto> handleNoSuchElementException(NoSuchElementException ex) {
		log.error("NoSuchElementException", ex);
		return createErrorResponse(ERROR_CODE_NOT_FOUND, ex.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler({ MethodArgumentNotValidException.class })
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	ResponseEntity<ErrorDto> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		log.error("MethodArgumentNotValidException", ex);
		List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
		String e = "";
		for (FieldError fe : fieldErrors) {
			e += fe.getField() + " " + fe.getDefaultMessage() + ";  ";
		}
		return createErrorResponse(ERROR_BAD_REQUEST, e, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler({ ConstraintViolationException.class })
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	ResponseEntity<ErrorDto> handleConstraintViolationException(ConstraintViolationException ex) {
		log.error("ConstraintViolationException", ex);
		return createErrorResponse(ERROR_BAD_REQUEST, ex.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler({ SQLException.class, DataAccessException.class })
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ResponseEntity<ErrorDto> databaseError(Exception ex) {
		log.error("SQLException", ex);
		return createErrorResponse(ERROR_DB, "Could not execute request to DB", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler({ Exception.class })
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	ResponseEntity<ErrorDto> handleRuntimeException(Exception ex) {
		Throwable rootCause = ExceptionUtils.getRootCause(ex);
		if (rootCause instanceof ConstraintViolationException) {
			return handleConstraintViolationException((ConstraintViolationException) rootCause);
		}
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
