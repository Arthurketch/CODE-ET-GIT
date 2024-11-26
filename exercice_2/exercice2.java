public class GestionnaireNotes {
 
	/**
	 * Afficher les notes
	 * @param nomEtudiant, notes
	 */
	public void afficherNotes(String nomEtudiant, int[] notes) {
		System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
	}
	
	/**
	 * Calculer la somme des notes
	 * @param notes
	 * @return somme
	 */
	public int sommeNotes(int[] notes) {
		int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return somme;
	}
	
	/**
	 * Calculer la moyenne
	 * @param notes
	 * @return moyenne
	 */
	public double calculerMoyenne(int[] notes) {
		int somme = sommeNotes(notes);
		double moyenne = (double) somme / notes.length;
        return moyenne;
	}
	
	/**
	 * Afficher la moyenne
	 * @param notes
	 */
	public void afficherMoyenne(int[] notes) {
		double moyenne = calculerMoyene(notes);
		System.out.println("Moyenne : " + moyenne);
	}
	
    /** 
     * Affiche note et moyennes
     * @param nomEtudiant, notes
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        afficherNotes(nomEtudiant, notes);
        afficherMoyenne(notes);
    }
}
