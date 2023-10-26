package Gimnasio;

public class Administrador {
    protected Cliente[] Clientes;
    protected Boolean tenis;
    protected Boolean natacion;
    protected Boolean fronton;

    //Constructor de la clase.
    public Administrador(Cliente[] Clientes, Boolean tenis, Boolean natacion, Boolean fronton){
        this.Clientes = Clientes;
        this.tenis = tenis;
        this.natacion = natacion;
        this.fronton = fronton;
    }

    
    //Getters and setters.
    public Cliente[] getClientes(){return Clientes;}
    public Boolean getTenis(){return tenis;}
    public Boolean getNatacion(){return natacion;}
    public void setClientes(Cliente[] Clientes){this.Clientes = Clientes;}   

    public void agregarCliente(){

    }

    public boolean borrar(){
        return true;
    }

    public boolean encontrar(int id){
        if(id == 0){
            return false;
        }
        else{
        return true;
        }
    }

    public boolean horario(){
        return true;
    }


}
