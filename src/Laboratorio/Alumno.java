
package Laboratorio;

public class Alumno {
   
    //ATRIBUTOS
    private String Nombre;
    private double Lab1T1, Lab2T1, Lab3T1, ExamenT1,
                   Lab1T2, Lab2T2, Lab3T2, ExamenT2, T3, EF;
    private String SituacionAcademica;
    
    //METODO CONSTRUCTOR

    public Alumno(String Nombre, double Lab1T1, double Lab2T1, double Lab3T1, double ExamenT1, double Lab1T2, double Lab2T2, double Lab3T2, double ExamenT2, double T3, double EF) {
        this.Nombre = Nombre;
        this.Lab1T1 = Lab1T1;
        this.Lab2T1 = Lab2T1;
        this.Lab3T1 = Lab3T1;
        this.ExamenT1 = ExamenT1;
        this.Lab1T2 = Lab1T2;
        this.Lab2T2 = Lab2T2;
        this.Lab3T2 = Lab3T2;
        this.ExamenT2 = ExamenT2;
        this.T3 = T3;
        this.EF = EF;
    }
    
    
    //METODO GET Y SET

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getLab1T1() {
        return Lab1T1;
    }

    public void setLab1T1(double Lab1T1) {
        this.Lab1T1 = Lab1T1;
    }

    public double getLab2T1() {
        return Lab2T1;
    }

    public void setLab2T1(double Lab2T1) {
        this.Lab2T1 = Lab2T1;
    }

    public double getLab3T1() {
        return Lab3T1;
    }

    public void setLab3T1(double Lab3T1) {
        this.Lab3T1 = Lab3T1;
    }

    public double getExamenT1() {
        return ExamenT1;
    }

    public void setExamenT1(double ExamenT1) {
        this.ExamenT1 = ExamenT1;
    }

    public double getLab1T2() {
        return Lab1T2;
    }

    public void setLab1T2(double Lab1T2) {
        this.Lab1T2 = Lab1T2;
    }

    public double getLab2T2() {
        return Lab2T2;
    }

    public void setLab2T2(double Lab2T2) {
        this.Lab2T2 = Lab2T2;
    }

    public double getLab3T2() {
        return Lab3T2;
    }

    public void setLab3T2(double Lab3T2) {
        this.Lab3T2 = Lab3T2;
    }

    public double getExamenT2() {
        return ExamenT2;
    }

    public void setExamenT2(double ExamenT2) {
        this.ExamenT2 = ExamenT2;
    }

    public double getT3() {
        return T3;
    }

    public void setT3(double T3) {
        this.T3 = T3;
    }

    public double getEF() {
        return EF;
    }

    public void setEF(double EF) {
        this.EF = EF;
    }

    public String getSituacionAcademica() {
        return SituacionAcademica;
    }

    public void setSituacionAcademica(String SituacionAcademica) {
        this.SituacionAcademica = SituacionAcademica;
    }

   
    //Metodo Adicional
    public double CalcularPromedio(){
         
        double PromLabT1 = (Lab1T1 + Lab2T1 + Lab3T1)/3;
        double PromLabT2 = (Lab1T2 + Lab2T2 + Lab3T2)/3;
        
        double T1 = (PromLabT1 * 0.3 + ExamenT1 * 0.7);
        double T2 = (PromLabT2 * 0.3 + ExamenT2 * 0.7);
        
        double PromedioFinal = (T1 * 0.1) + (T2 * 0.2) + (T3 * 0.3) + (EF * 0.4);
        return PromedioFinal;
    }
    
    public void SituacionAcademica(){
        
        double Promedio = CalcularPromedio();
        
        if(Promedio >= 12){
            SituacionAcademica = "Aprobo";
        }
        else{
            SituacionAcademica = "Desaprobo";
        }        
    } 
     
}
