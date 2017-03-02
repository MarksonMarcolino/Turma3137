/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.singleton;

/**
 *
 * @author Edutec
 */
public class BancoDeDados {
    
    private BancoDeDados() {
    }
    
    public static BancoDeDados getInstance() {
        return BancoDeDadosHolder.INSTANCE;
    }
    
    private static class BancoDeDadosHolder {

        private static final BancoDeDados INSTANCE = new BancoDeDados();
    }
}
