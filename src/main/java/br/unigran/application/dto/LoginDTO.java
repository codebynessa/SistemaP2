/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.dto;

import br.unigran.domain.entity.Usuario;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author vanes
 */
public class LoginDTO {
 public String login;
    public String senha;

    public LoginDTO(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Usuario toEntity() {
        Usuario usuario = new Usuario();
        usuario.setLogin(login);
        usuario.setSenha(generateHash(senha));
        return usuario;
    }

    private String generateHash(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(password.getBytes());

            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            return hashtext;

        } catch (NoSuchAlgorithmException ex) {
            return "";
        }
    }
}