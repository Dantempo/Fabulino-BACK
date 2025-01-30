package com.fabulino.juegoCaras.dto;

public class JuegoCarasDto {
	
	public Long id;
	private String [] ordenEmojis;
	private NumeroCaras numToques;
	private EmojisMarcados emjMarcados;
	private int imagen;
	
	public JuegoCarasDto() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String[] getOrdenEmojis() {
		return ordenEmojis;
	}

	public void setOrdenEmojis(String[] ordenEmojis) {
		this.ordenEmojis = ordenEmojis;
	}

	public NumeroCaras getNumToques() {
		return numToques;
	}

	public void setNumToques(NumeroCaras numToques) {
		this.numToques = numToques;
	}

	public EmojisMarcados getEmjMarcados() {
		return emjMarcados;
	}

	public void setEmjMarcados(EmojisMarcados emjMarcados) {
		this.emjMarcados = emjMarcados;
	}

	public int getImagen() {
		return imagen;
	}

	public void setImagen(int imagen) {
		this.imagen = imagen;
	}

	public String conversorString() {
		String ordenEmojisAux = "";
		for (String string : ordenEmojis) {
            ordenEmojisAux += string + ", ";
		}
		if (ordenEmojisAux.length() > 0) {
			ordenEmojisAux = ordenEmojisAux.substring(0, ordenEmojisAux.length() - 2);
			
		}
		return ordenEmojisAux;
	}

	

}
