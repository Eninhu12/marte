package br.com.enio.marte.model;

public abstract class PessoaModel {

	private String documento;
	
	public PessoaModel(String documento) {
		this.documento = documento;
	}
	
	public abstract Boolean isDocumentoValido();
	public abstract String getNovoDocumento(); //bonus
	public abstract String getDocumentoFormatado(); //bonus bonus

	public String getDocumento() {
		return documento;
	}
}