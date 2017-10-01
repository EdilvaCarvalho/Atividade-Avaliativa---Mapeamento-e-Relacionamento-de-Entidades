package br.edu.ifpb.dac.dac.cenario2.domain.enums;

import java.io.Serializable;

/**
 *
 * @author Edilva
 */
public enum Genero implements Serializable {

    ACAO("Ação"), 
    ANIMACAO("Animação"), 
    AVENTURA("Aventura"), 
    CINEMA_CATÁSTROFE("Cinema catástrofe"), 
    COMEDIA("Comédia"), 
    COMEDIA_ROMANTICA("Comédia romântica"), 
    COMEDIA_DRAMATICA("Comédia dramática"), 
    COMEDIA_DE_ACAO("Comédia de ação"), 
    DANCA("Dança"), 
    DOCUMENTARIOS("Documentários"), 
    DRAMA("Drama"), 
    ESPIONAGEM("Espionagem"), 
    FANTASIA("Fantasia"), 
    FAROESTE("Faroeste"), 
    FICCAO_CIENTIFICA("Ficção científica"), 
    GUERRA("Guerra"), 
    MUSICAL("Musical"), 
    POLICIAL("Policial"), 
    ROMANCE("Romance"), 
    SERIADO("Seriado"), 
    SUSPENSE("Suspense"), 
    TERROR("Terror");
    
    private final String descricao;
    
    Genero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    } 
}
