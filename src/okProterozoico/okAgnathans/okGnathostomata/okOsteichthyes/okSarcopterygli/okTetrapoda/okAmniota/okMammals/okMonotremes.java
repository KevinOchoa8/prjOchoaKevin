package okProterozoico.okAgnathans.okGnathostomata.okOsteichthyes.okSarcopterygli.okTetrapoda.okAmniota.okMammals;

import java.util.Random;

public class okMonotremes extends okMammals implements IokTanqueMutacion{

    private String okNombre;

    public okMonotremes(String okNombre) { //REFACTORIZACIÓN (FALTÓ DEFINIR NOMBRE)
        this.okNombre = okNombre;
    }
    
   @Override
    public String okSaludar() {     
        return okNombre + " saludando a todos";
    }

    @Override
    public String okMutar() {       

        Random okrand = new Random();

        int okactual = okrand.nextInt(901) + 100;   
        int okmaximo = okrand.nextInt(901) + 100;   

        //Validar por si 
        if (okmaximo < okactual) {
            int oktemp = okmaximo;
            okmaximo = okactual;
            okactual = oktemp;
        }

            System.out.println("================================================================");
            System.out.println("Los biólogos rusos solicitan la mutación de la especie Monotreme:\n");
            System.out.println("Mutación en proceso: ----------------------- " + okactual + " de " + okmaximo + " (mSv)");
    

    if (okactual > okmaximo / 2) {
            System.out.println("--- Gnathostomata");
            System.out.println("------- Osteichthyes");
            System.out.println("---------- Sarcopterygli");
            System.out.println("-------------- Tetrapoda");
            System.out.println("----------------- Amniota");
            System.out.println("-------------------- Mammals");
            System.out.println("----------------------- Monotremes");
            System.out.println("----------------------------- Monotreme");
            System.out.println("--------------------------------- MonotremeOchoa\n");
            return "Nueva especie creada: MonotremeOchoa";
        } else {
            return "Mutación fallida";
        }
    }
}
