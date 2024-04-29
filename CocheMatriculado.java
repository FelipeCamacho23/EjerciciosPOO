package EjerciciosPractica2;

public final class CocheMatriculado extends Coche {
    private final int añoMatriculacion;
    private final int mesMatriculacion;
    private double impuestoMatriculacion;

    public CocheMatriculado(String marca, String color, double precio, double factorContaminacion, int año,
                            int añoMatriculacion, int mesMatriculacion, String matricula, String dniTitular) {
        super(marca, color, precio, factorContaminacion, año);
        this.añoMatriculacion = añoMatriculacion;
        this.mesMatriculacion = mesMatriculacion;
        setMatricula(matricula); 
        setDniTitular(dniTitular); 
        calculaImpuestoMatriculacion(); 
    }

    public void calculaImpuestoMatriculacion() {
        impuestoMatriculacion = getPrecio() / 20.0;
        if (getAño() < 2022 - 10) {
            impuestoMatriculacion += 100; 
        }
    }

    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }

    public void setImpuestoMatriculacion() {
        calculaImpuestoMatriculacion();
    }
}


