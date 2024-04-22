package srishti;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author srishtiparulekar
 */

public interface AuthenticationProvider {
    boolean authenticate(String username, String password);
}

