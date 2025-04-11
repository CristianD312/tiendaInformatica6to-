public class Computadora extends Producto {
    private int tipo;
    private String procesador;
    private String memoriaRam;
    private int almacenamiento;

    public Computadora(int id, String marca, String modelo, double precio, int tipo, String procesador, String memoriaRam, int almacenamiento) {
        super(id, marca, modelo, precio);
        this.tipo = tipo;
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String mostrarDatos(){
        return "Producto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", tipo= "+ tipo +
                ", procesador " + procesador +
                " memoria Ram = " + memoriaRam +
                '}';

    }
    @Override
    public double calcularPrecio(){
    double precioFinal=0;
        if (tipo==2){
            precioFinal=precio+(precio*0.10);
        } else { precioFinal= precio;}

        return precioFinal;
    }


}
