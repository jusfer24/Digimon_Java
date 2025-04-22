public class Digimon {
    public String nombre;
    public String tipo;
    public double nivelpoder;
    public String habilidad;
    public String estado;

    public Digimon() {  //por defecto
        nombre = "Agumon";
        tipo = "Fuego";
        nivelpoder = 120;
        habilidad = "Flama bebe";
        estado = "Activo";
    }

    public Digimon(String nombre, String tipo, double nivelpoder, String habilidad, String estado) { //con parametros
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivelpoder = nivelpoder;
        this.habilidad = habilidad;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getNivelpoder() {
        return nivelpoder;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setNivelpoder(double nivelpoder) {
        this.nivelpoder = nivelpoder;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + '\n' +
                "Tipo: " + tipo + '\n' +
                "Nivel de poder: " + nivelpoder + '\n';
    }
}

