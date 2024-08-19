/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.raphaelarcanjo;

import com.raphaelarcanjo.interfaces.AparelhoTelefonico;
import com.raphaelarcanjo.interfaces.NavegadorInternet;
import com.raphaelarcanjo.interfaces.ReprodutorMusical;

/**
 *
 * @author raphael
 */
public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    public static void main(String[] args) {
        AparelhoTelefonico telefone = new IPhone();
        telefone.ligar("3357-9654");
        telefone.atender();
        
        ReprodutorMusical reprodutorMusical = new IPhone();
        reprodutorMusical.selecionarMusica("Hey Jude - Beatles");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        
        NavegadorInternet browser = new IPhone();
        browser.exibirPagina("https://archlinux.org");
        browser.adicionarNovaAba();
        browser.exibirPagina("https://google.com");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA O NÚMERO " + numero + " DO APARELHO TELEFÔNICO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO DO APARELHO TELEFÔNICO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ DO APARELHO TELEFÔNICO");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA " + url + " DO NAVEGADOR");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ABRINDO ABA DO NAVEGADOR");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA DO NAVEGADOR");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA DO REPRODUTOR DE MÚSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA DO REPRODUTOR DE MÚSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO A MÚSICA " + musica + " DO REPRODUTOR DE MÚSICA");
    }

}
