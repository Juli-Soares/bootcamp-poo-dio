package br.com.dio.desafio.dominio;

public class Login {
    private String email;
    private  String senha;

    public boolean fazerLogin(String email, String senha){
        if ("usuario@example.com".equals(email) && "senha123".equals(senha)){
            return true;
        } else {
            return false;
        }

    }
}
