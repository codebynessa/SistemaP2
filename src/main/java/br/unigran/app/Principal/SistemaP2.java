package br.unigran.app.Principal;

import br.unigran.infra.persistence.JPAUtil;


public class SistemaP2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        JPAUtil.getInstace();
    }
}
