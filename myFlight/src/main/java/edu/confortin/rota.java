package edu.confortin;

public class Rota implements Comparable<Rota>{

    private CiaAerea ciaAerea;
    private Aeroporto destino;
    private Aeroporto origem;
    private Aeronave aeronave;

    public Rota(CiaAerea ciaAerea, Aeroporto destino, Aeroporto origem, Aeronave aeronave){
        this.ciaAerea = ciaAerea;
        this.destino = destino;
        this.origem = origem;
        this.aeronave = aeronave;
    }

    public CiaAerea getCiaAerea(){
        return this.ciaAerea;
    }

    public Aeroporto getDestino(){
        return this.destino;
    }

    public Aeroporto getOrigem(){
        return this.origem;
    }

    public Aeronave getAeronave(){
        return this.aeronave;
    }
