import org.apache.mahout.clustering.display.DisplayClustering;


public class Analisis extends DisplayClustering  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Analisis() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws Exception {
		/* En esta clase se realizaran todas las llamadas necesarias para el analisis de datos */
		//Ejecutar para el juego que se quiera ejecutar el K-means
		
		PlatformData.getData();
		//Platform2Data.getData();
		//ShootData.getData();
		//Shoot2Data.getData();
		//PathFindingData.getData();
		//PathFinding2Data.getData();
		
	}
 
}
