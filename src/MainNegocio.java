public class MainNegocio {

        public static void main(String[] args) {
            Producto producto1 = new Producto();
            Producto producto2 = new Producto();
            producto1.nombre = "Mouse";
            producto1.precio = 20;
            producto1.categoria = "Tecnología";
            producto2.nombre = "olla";
            producto2.precio = 35;
            producto2.categoria = "Cocina";


            producto1.mostrarInformacion();
            producto1.mostrarCategoria();
            producto2.mostrarInformacion();
            producto2.mostrarCategoria();
        }

}

