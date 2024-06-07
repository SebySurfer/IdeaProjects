public enum PeriodicTable {

    //The syntax for the values are all in capitals

    HYDROGEN("H",1),
    HELIUM("He",2),
    OXYGEN("O",16),
    NITROGEN("N",7),
    CARBON("C",6);
    String chemicalSymbol;
    int atomicNumber;

    PeriodicTable(String chemicalSymbol, int atomicNumber){
        this.chemicalSymbol = chemicalSymbol;
        this.atomicNumber = atomicNumber;

    }




}


