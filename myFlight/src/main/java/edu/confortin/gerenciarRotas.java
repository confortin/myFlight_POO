package edu.conforti;

import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorRotas {

    private ArrayList<Rota> rotas;

    public GerenciadorRotas() {
        this.rotas = new ArrayList<>();
    }

    public void adicionar(Rota rota) {
        this.rotas.add(rota);
    }

    public ArrayList<Rota> listarTodas() {
        return this.rotas;
    }
