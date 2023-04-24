import com.stevenrj.model.CuentaAHImpl;

public class Main {
    public static void main(String[] args) {
        CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
        cuentaAhorro.setMonto(300.0);

        CuentaAHImpl cuentaAhorro2 = new CuentaAHImpl();

        CuentaAHImpl cuentaClonada = (CuentaAHImpl) cuentaAhorro.clonar();
        cuentaClonada.setMonto(400.0);

        if(cuentaClonada != null){
            System.out.println("Cuenta clonada: " + cuentaClonada);
            System.out.println("Cuenta de Ahorros: " + cuentaAhorro);
            System.out.println("Cuenta de Ahorros2: " + cuentaAhorro2);
        }

        System.out.println(cuentaClonada == cuentaAhorro);

    }
}