/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import implementations.desistente;
import implementations.formado;
import implementations.jubilado;
import implementations.matriculado;
import implementations.trancado;
import modelo.Aluno;

/**
 *
 * @author ice
 */
public interface AlunoEstado {
    
    public void matricular(Aluno alunoAtual);
    public void trancar(Aluno alunoAtual);
    public void jubilar(Aluno alunoAtual);
    public void formar(Aluno alunoAtual);
    public void desistir(Aluno alunoAtual);
}
