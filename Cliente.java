package Gimnasio;

public class Cliente extends Personas {
    protected Pagos[] pagos;
    
    public int getCantidadPagos(){
        return this.pagos.length;
    }
    
    
}
