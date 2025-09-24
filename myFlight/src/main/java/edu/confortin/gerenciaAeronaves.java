package edu.confortin;

import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeronaves{

    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves(){
        this.aeronaves = new ArrayList<>();
    }

    public void adicionar(Aeronave aviao){
        this.aeronaves.add(aviao);
    }

    public ArrayList<Aeronave> listarTodas(){
        return this.aeronaves;
    }