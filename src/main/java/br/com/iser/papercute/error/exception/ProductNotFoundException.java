package br.com.iser.papercute.error.exception;

public class ProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProductNotFoundException(String string) {
		super(string);
	}
}