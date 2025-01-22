package com.fabulino.juegoCaras.dto;

public class JuegoCarasDto {
	
	public Long id;
	private String [] ordenEmojis;
	private NumeroCaras numeroToques;
	private EmojisMarcados emojisMarcados;
	private int imagen;
	
	
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
	
	public NumeroCaras getNumeroToques() {
		return numeroToques;
	}
	public void setNumeroToques(NumeroCaras numeroToques) {
		this.numeroToques = numeroToques;
	}
	
	public EmojisMarcados getEmojisMarcados() {
		return emojisMarcados;
	}
	public void setEmojisMarcados(EmojisMarcados emojisMarcados) {
		this.emojisMarcados = emojisMarcados;
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
