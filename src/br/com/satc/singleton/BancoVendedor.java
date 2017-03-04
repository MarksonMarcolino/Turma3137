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
public class BancoVendedor {
    
    private BancoVendedor() {
    }
    
    public static BancoVendedor getInstance() {
        return BancoVendedorHolder.INSTANCE;
    }
    
    private static class BancoVendedorHolder {

        private static final BancoVendedor INSTANCE = new BancoVendedor();
    }
}
