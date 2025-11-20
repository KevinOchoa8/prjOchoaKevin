package okProterozoico;

import okProterozoico.okAgnathans.okGnathostomata.okOsteichthyes.okSarcopterygli.okTetrapoda.okAmniota.okMammals.okMonotremes;

public class okController {

    public void okIniciarMundoEvolutivo() {
        System.out.println("==================== ÁRBOL FILOGENÉTICO ====================");
        okmostrarLoading();
        
        okMonotremes okMonotremes = new okMonotremes("Ragnar");

        System.out.println(okMonotremes.okSaludar());
        System.out.println(okMonotremes.okMutar());

    }

     private void okmostrarLoading() {
        String[] lines = {
            "o0o --- Gnathostomata",
            "oOo ------- Osteichthyes",
            "o0o ---------- Sarcopterygli",
            "o0o -------------- Tetrapoda",
            "o0o ----------------- Amniota",
            "o0o -------------------- Mammals",
            "o0o ----------------------- Monotremes"
        };
        int[] sequence = {0, 1, 2, 1};
        System.out.print("Loading: ");
        try {
            for (int i = 0; i <= 20; i++) {
                int stage = i / 3;
                String currentLine = lines[stage];
                String spinner = currentLine.substring(0, 3);
                String text = currentLine.substring(3);
                int pos = sequence[i % sequence.length];
                StringBuilder animated = new StringBuilder("   ");
                animated.setCharAt(pos, spinner.charAt(pos));
                System.out.print("\rLoading: " + animated.toString() + text + " " + (i * 5) + "%");
                Thread.sleep(170);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\rLoading: 100% ");

        for (String line : lines) {
            System.out.println(line.substring(3));
        }
    }



}
