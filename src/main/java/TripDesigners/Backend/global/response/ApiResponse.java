package TripDesigners.Backend.global.response;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnore;

import TripDesigners.Backend.global.exception.ExceptionResponse;
import groovyjarjarantlr4.v4.runtime.misc.Nullable;

public record ApiResponse<T>(
	@JsonIgnore
	HttpStatus httpStatus,
	boolean success,
	@Nullable T data,
	String message
) {

	public static <T> ApiResponse<T> ok(@Nullable final T data) {
		return new ApiResponse<>(HttpStatus.OK, true, data, null);
	}

	public static <T> ApiResponse<T> created(@Nullable final T data) {
		return new ApiResponse<>(HttpStatus.CREATED, true, data, null);
	}

	public static <T> ApiResponse<T> fail(HttpStatus httpStatus, final String message) {
		return new ApiResponse<>(httpStatus, false, null, message);
	}
}