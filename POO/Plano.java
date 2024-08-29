package POO;

public class Plano {
    private int id;
    private int fechaEntrega;
    private int arquitectos;
    private int nroFiguras;

    public Plano(int id, int fechaEntrega, int arquitectos, int nroFiguras) {
        this.id = id;
        this.fechaEntrega = fechaEntrega;
        this.arquitectos = arquitectos;
        this.nroFiguras = nroFiguras;
    }

    public int getId() {
        return id;
    }

    public int getFechaEntrega() {
        return fechaEntrega;
    }

    public int getArquitectos() {
        return arquitectos;
    }

    public int getNroFiguras() {
        return nroFiguras;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaEntrega(int fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setArquitectos(int arquitectos) {
        this.arquitectos = arquitectos;
    }

    public void setNroFiguras(int nroFiguras) {
        this.nroFiguras = nroFiguras;
    }
}

