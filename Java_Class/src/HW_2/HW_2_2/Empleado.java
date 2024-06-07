package HW_2.HW_2_2;

public class Empleado {

    public String nombre;
    public String ap_pat;
    public double sal_men;

    public Empleado(String nombre, String ap_pat, double sal_men){
        this.nombre = nombre;
        this.ap_pat = ap_pat;
        this.sal_men = sal_men;
        if(sal_men < 0.0){
            sal_men = 0.0;
        }

    }


    public String getNombre() {
        return nombre;
    }

    public String getAp_pat() {
        return ap_pat;
    }

    public double getSal_men() {
        return sal_men;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAp_pat(String ap_pat) {
        this.ap_pat = ap_pat;
    }

    public void setSal_men(double sal_men) {
        this.sal_men = sal_men;
    }

















}
