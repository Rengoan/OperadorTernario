package operadorternario;

public class OperadorTernario {

    public static void main(String[] args) {

        var nota = 4;
        var mensaje = "";

        if (nota < 5) {
            mensaje = "suspenso";
        } else {
            mensaje = "aprobado";
        }
        System.out.println(mensaje);
        //OPERADOR TERNARIO
        //sustituye a la condicional
        var otroMensaje = (nota < 5) ? "suspenso" : "aprobado";
        System.out.println(otroMensaje);
    }

}
