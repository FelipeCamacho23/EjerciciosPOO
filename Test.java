package EjerciciosPractica2;

public class Test {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Rojo", 15000, 0.05, 2018);
        coche1.setMatricula("1234ABC");
        coche1.setDniTitular("12345678A");

        CocheMatriculado coche2 = new CocheMatriculado("Ford", "Azul", 20000, 0.06, 2020, 2020, 5, "5678DEF", "87654321B");
        coche2.setKm(5000); 
        coche2.setImpuestoMatriculacion(); 
        coche2.comprarCoche(coche1);

        System.out.println("Información del coche 1:");
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Color: " + coche1.getColor());
        System.out.println("Kilómetros: " + coche1.getKm());
        System.out.println("Precio: " + coche1.getPrecio());
        System.out.println("Matrícula: " + coche1.getMatricula());
        System.out.println("DNI del titular: " + coche1.getDniTitular());

        System.out.println("\nInformación del coche 2:");
        System.out.println("Marca: " + coche2.getMarca());
        System.out.println("Color: " + coche2.getColor());
        System.out.println("Kilómetros: " + coche2.getKm());
        System.out.println("Precio: " + coche2.getPrecio());
        System.out.println("Matrícula: " + coche2.getMatricula());
        System.out.println("DNI del titular: " + coche2.getDniTitular());
        System.out.println("Impuesto de matriculación: " + coche2.getImpuestoMatriculacion());
    }
}

