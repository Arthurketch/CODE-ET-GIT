public class StockManager {

	/**
	 * Ajouter un stock
	 * @param produit, stock
	 */
	public void ajoutStock(String produit, int stock) {
		stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
	}
	
	/**
	 * retrait d'un stock
	 * @param produit, stock
	 */
	public void retraitStrock(String produit, int stock) {
		if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
	}
	 
    /**
     * Gerer un stock
     * @param typeOperation, produit, quantite, stock
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        
        if (typeOperation.equals("ajout")) {
            ajoutStock(produit, stock);
            
        } else if (typeOperation.equals("retrait")) {
            retraitStock(produit, stock);
       
        } else {
            System.out.println("Opération inconnue.");
        }
    }
}
