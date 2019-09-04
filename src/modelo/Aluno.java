package modelo;

import implementations.matriculado;
import interfaces.AlunoEstado;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ice
 */
public class Aluno {
    AlunoEstado estado;
    public Aluno()
    {
        estado = new matriculado();
    }
    public void matricular()
    {
        estado.matricular(this);
    }
    public void trancar()
    {
        estado.trancar(this);
    }
    public void jubilar()
    {
        estado.jubilar(this);
    }
    public void formar()
    {
        estado.formar(this);
    }
    public void desistir()
    {
        estado.desistir(this);
    }
    public void mudaEstado(AlunoEstado novoEstado)
    {
        this.estado = novoEstado;
    }
}