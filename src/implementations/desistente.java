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
public class desistente implements AlunoEstado{

    
    public void matricular(Aluno alunoAtual) {
        System.out.println("Operação Incorreta");
    }

    
    public void trancar(Aluno alunoAtual) {
        System.out.println("Operação Incorreta");
        
    }

    
    public void jubilar(Aluno alunoAtual) {
        System.out.println("Operação Incorreta");
        
    }

    
    public void formar(Aluno alunoAtual) {
        System.out.println("Operação Incorreta");
        
    }

    
    public void desistir(Aluno alunoAtual) {
        System.out.println("Operação Incorreta");
    }  
}
