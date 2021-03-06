package model;

public class Renta {
    @Column
    int idRenta;
    @Column
    String fecha;
    @Column
    String fechaDevolucionAcordada;
    @Column
    int montoAcordado;
    @JoinColumn("idCliente")
    Integrante integrante;
    @JoinColumn("idCliente")
    Cliente cliente;

    public Renta(int idRenta, String fecha, String fechaDevolucionAcordada, int montoAcordado, Integrante integrante, Cliente cliente) {
        this.idRenta = idRenta;
        this.fecha = fecha;
        this.fechaDevolucionAcordada = fechaDevolucionAcordada;
        this.montoAcordado = montoAcordado;
        this.integrante = integrante;
        this.cliente = cliente;
    }

    public int getIdRenta() {
        return idRenta;
    }

    public void setIdRenta(int idRenta) {
        this.idRenta = idRenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFechaDevolucionAcordada() {
        return fechaDevolucionAcordada;
    }

    public void setFechaDevolucionAcordada(String fechaDevolucionAcordada) {
        this.fechaDevolucionAcordada = fechaDevolucionAcordada;
    }

    public int getMontoAcordado() {
        return montoAcordado;
    }

    public void setMontoAcordado(int montoAcordado) {
        this.montoAcordado = montoAcordado;
    }

    public Integrante getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
