package org.soulcodeacademy.Ecommerce.domain.dto;

public class TokenDTO {
    private String accessToken;

    private String tokenType = "Bearer";

    public TokenDTO(String accessToken){
        this.accessToken = accessToken;
    }

    public String getAccessToken(){
        return  accessToken;
    }

    public void setAccessToken(String accessToken){
        this.accessToken = accessToken;
    }

    public String getTokenType(){
        return tokenType;
    }

    public void setTokenType(String tokenType){
        this.tokenType = tokenType;
    }
}
