package br.com.iser.papercute.error;

import lombok.Data;

@Data
public class CustomErrorResponse {

	private int status;
	private String error;

}