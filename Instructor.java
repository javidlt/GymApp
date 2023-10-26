package Gimnasio;

public class Instructor extends Personas {
    protected Deportes[] deportesQueDa;

    public Boolean daElDeporte(Deportes d){
        if (d != null) {
            int nDep = this.deportesQueDa.length;
            for (int i = 0; i < nDep; i++){
                if (this.deportesQueDa[i].equals(d)){
                    return true;
                }
            }
        }
        return false;
    }

    public Deportes[] añadirDeporte(Deportes d){
        if (d != null){
            int nDep = this.deportesQueDa.length;

            Deportes[] newArr = new Deportes[nDep+1];
            for (int i = 0; i < nDep; i++)
                newArr[i] = this.deportesQueDa[i];

            newArr[nDep+1] = d;
            return newArr;
        }
        return deportesQueDa;
    }

    public Deportes[] getDeportes(){
        return this.deportesQueDa;
    }

    public Deportes quitarDeporte(Deportes d){

    }
}
