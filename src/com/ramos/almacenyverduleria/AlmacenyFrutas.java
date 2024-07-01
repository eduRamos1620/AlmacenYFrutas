package com.ramos.almacenyverduleria;

public class AlmacenyFrutas {
    public static void main(String[] args) {
        Producto[] productos = new Producto[8];

        productos[0] = new Fruta("Platano", 15, 1.5, "amarillo");
        productos[1] = new Fruta("Piña", 45, 2, "amarilla");
        productos[2] = new Limpieza("Cloro", 38, "cloro", 1);
        productos[3] = new Limpieza("Suavitel", 50, "suavitel", 2);
        productos[4] = new Lacteo("Yogurt", 12, 5, 8);
        productos[5] = new Lacteo("Leche", 38, 4, 50);
        productos[6] = new NoPercibe("maruchan", 17, 4, 60);
        productos[7] = new NoPercibe("alitas", 239, 100, 80);
        
        for (Producto prod: productos){
            System.out.println("nombre: " + prod.getNombre());
            System.out.println("precio: " + prod.getPrecio());
            
            if (prod instanceof Fruta){//Si existe en fruta
                System.out.println("peso en kg: " + ((Fruta) prod).getpeso());
                System.out.println("color: " + ((Fruta) prod).getColor());
            } else if (prod instanceof  Limpieza) {
                System.out.println("componentes: " + ((Limpieza) prod).getComponentes());
                System.out.println("litros: " + ((Limpieza) prod).getLitros());
            } else if (prod instanceof Lacteo){
                System.out.println("cantidad: " + ((Lacteo) prod).getCantidad());
                System.out.println("proteinas: " + ((Lacteo) prod).getProteinas());
            } else if (prod instanceof NoPercibe) {
                System.out.println("calorias: " + ((NoPercibe) prod).getCalorias());
                System.out.println("contenido: " + ((NoPercibe) prod).getContenido());
            }
        }
    }
}
