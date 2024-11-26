public class FactureManager {

	/**
	 * calcul de la remise selon la categorie
	 * @param typeProduit, quantite, prixUnitaire
	 * @return total
	 */
	public double remiseCat(String typeProduit, int quantite, double prixUnitaire) {
		double total = quantite * prixUnitaire;
		
		if (typeProduit.equals("Alimentaire")) {
            total -= total * 0.05; // Réduction de 5%
        } else if (typeProduit.equals("Electronique")) {
            total -= total * 0.1; // Réduction de 10%
        } else if (typeProduit.equals("Luxe")) {
            total -= total * 0.15; // Réduction de 15%
        }
		
		return total;
	}
	
	/**
	 * calcul de la remise totale
	 * @param quantite, prixUnitaire
	 * @return total
	 */
	public double remiseTotal(int quantite, double prixUnitaire) {
		double total = remiseCat(quantite, prixUnitaire);
		
		if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }
		return total;
	}
	
    /**
     * Calcul le total d'une facture
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
    	double total;
    	
    	total = rermiseCat(typeProduit, quantite, prixUnitaire);
        total = remiseTot(quantite, prixUnitaire);

        return total;
    }
}
