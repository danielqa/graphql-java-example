package br.com.example.graphqljava.model;

import lombok.Data;

@Data
public class User {

    private final Integer id;
    private final String login;
    private final String password;
    private final Integer personId;
}
