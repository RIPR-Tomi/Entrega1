public class jefe{
    public int codigo;
    public String nombre;
    public int telefono;
    public String direccion;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return telefono;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getDireccion(String direccion){
        return direccion;
    }
}