/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import interfaces.AlunoEstado;
import modelo.Aluno;

/**
 *
 * @author ice
 */
public class matriculado implements AlunoEstado{

    
    public void matricular(Aluno alunoAtual) {
        System.out.println("Operação Incorreta");
    }

    
    public void trancar(Aluno alunoAtual) {
        alunoAtual.mudaEstado(new trancado());
    }

    
    public void jubilar(Aluno alunoAtual) {
        alunoAtual.mudaEstado(new jubilado());
    }

    
    public void formar(Aluno alunoAtual) {
        alunoAtual.mudaEstado(new formado());
    }

    
    public void desistir(Aluno alunoAtual) {
        alunoAtual.mudaEstado(new desistente());
    }
    
}
