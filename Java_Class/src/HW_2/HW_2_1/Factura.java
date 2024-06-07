package HW_2.HW_2_1;

public class Factura {
    public String pieza;
    public String descr;
    public int num;
    public double precio;

    public Factura(String pieza, String descr, int num, double precio){
        this.pieza = pieza;
        this.descr = descr;
        this.num = num;
        this.precio = precio;

    }

    //Getters
    public String getPieza() {
        return pieza;
    }

    public String getDescr() {
        return descr;
    }

    public int getNum() {
        return num;
    }

    public double getPrecio() {
        return precio;
    }


    //Setters
    public void setPieza(String pieza) {
        this.pieza = pieza;
    }
    public void setDescr(String descr) {
        this.descr = descr;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public double obtenerMontoFactura(){
        double p = 0;

        if(num < 0){
            num =  0;
        }

        if(precio < 0){
            precio = 0.0;
        }

        p = num * precio;


        return p;

    }




}
