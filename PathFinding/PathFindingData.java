import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.math.DenseVector;
import org.jfree.ui.RefineryUtilities;


public class PathFindingData{

	public PathFindingData() {
		// TODO Auto-generated constructor stub
	}
	
	public static void getData() throws Exception {
		//Se genera la muestra
		PathFinding pathFinding = new PathFinding();
		ArrayList<PathFindingType> dataPathFinding = new ArrayList<PathFindingType>();
		dataPathFinding = pathFinding.listadejugadas();

		List< DenseVector> jugadas1 = new ArrayList< DenseVector>();
		DenseVector jugada1;
		
		for(int i=0; i<dataPathFinding.size(); i++){
			
			if ( dataPathFinding.get(i).getNumeroClicks() > dataPathFinding.get(i).MAX_CLICKS){
				dataPathFinding.get(i).setNumeroClicks(dataPathFinding.get(i).MAX_CLICKS);
			}
			
			if ( dataPathFinding.get(i).getDisparosHechos() > dataPathFinding.get(i).MAX_DISPAROS_HECHOS){
				dataPathFinding.get(i).setDisparosHechos(dataPathFinding.get(i).MAX_DISPAROS_HECHOS);
			} 			


			if ( dataPathFinding.get(i).getVidasPerdidas() > dataPathFinding.get(i).MAX_VIDAS_PERDIDAS){
				dataPathFinding.get(i).setVidasPerdidas(dataPathFinding.get(i).MAX_VIDAS_PERDIDAS);
			}


			if ( dataPathFinding.get(i).getEnemigosMatados() > dataPathFinding.get(i).MAX_ENEMIGOS_MATADOS){
				dataPathFinding.get(i).setEnemigosMatados(dataPathFinding.get(i).MAX_ENEMIGOS_MATADOS);
			} 

			if ( dataPathFinding.get(i).getTiempoJuego() > dataPathFinding.get(i).MAX_TIEMPO_JUEGO){
				dataPathFinding.get(i).setTiempoJuego(dataPathFinding.get(i).MAX_TIEMPO_JUEGO);
			} 

			if ( dataPathFinding.get(i).getPrincesa()> dataPathFinding.get(i).MAX_PRINCESA){
				dataPathFinding.get(i).setPrincesa(dataPathFinding.get(i).MAX_PRINCESA);
			} 

			
		}
			 
		for(int i=0; i<dataPathFinding.size(); i++){
			double aux_clicks=dataPathFinding.get(i).getNumeroClicks();
			double aux_hechos=dataPathFinding.get(i).getDisparosHechos();
			double aux_perdidas=dataPathFinding.get(i).getVidasPerdidas();
			double aux_matados=dataPathFinding.get(i).getEnemigosMatados();
			double aux_tiempo=dataPathFinding.get(i).getTiempoJuego();
			double aux_princesa=dataPathFinding.get(i).getPrincesa();
			
			
		 jugada1 = new DenseVector(new double[] {aux_clicks / dataPathFinding.get(i).MAX_CLICKS,
				 								 aux_hechos / dataPathFinding.get(i).MAX_DISPAROS_HECHOS,
				 								 aux_perdidas / dataPathFinding.get(i).MAX_VIDAS_PERDIDAS,
				 								 aux_matados / dataPathFinding.get(i).MAX_ENEMIGOS_MATADOS,
				 								 aux_tiempo /dataPathFinding.get(i).MAX_TIEMPO_JUEGO,
				 								 aux_princesa /dataPathFinding.get(i).MAX_PRINCESA});	
		 jugadas1.add(jugada1);
		 
		}
		DataAnalisis.runAnalisis(jugadas1);
		
		  // se grafican  los clústeres obtenidos 

		
		  List<String> aux = dataPathFinding.get(0).getFeatures();
		  List<String>  aux2 =dataPathFinding.get(0).getClusters();
		  
		// cluster 0	
		RadarChart demo10 = new RadarChart("Jugador:5 ",aux,jugadas1.get(5),aux2.get(0),0);
		demo10.pack();
		RefineryUtilities.centerFrameOnScreen(demo10);
		demo10.setVisible(true);
		
	    RadarChart demo4 = new RadarChart("Jugador: 1 ",aux,jugadas1.get(1),aux2.get(0),0);
	    demo4.pack();
	    RefineryUtilities.centerFrameOnScreen(demo4);
	    demo4.setVisible(true);
	    
	    RadarChart demo6 = new RadarChart("Jugador:4 ",aux,jugadas1.get(4),aux2.get(0),0);
	    demo6.pack();
	    RefineryUtilities.centerFrameOnScreen(demo6);
	    demo6.setVisible(true);
	    
	    RadarChart demo7 = new RadarChart("Jugador:7 ",aux,jugadas1.get(7),aux2.get(0),0);
	    demo7.pack();
	    RefineryUtilities.centerFrameOnScreen(demo7);
	    demo7.setVisible(true);


	    // cluster 1	
		  

	   

	    RadarChart demo2 = new RadarChart("Jugador: 6",aux,jugadas1.get(6),aux2.get(1),1);
	    demo2.pack();
	    RefineryUtilities.centerFrameOnScreen(demo2);
	    demo2.setVisible(true);

	    RadarChart demo3 = new RadarChart("Jugador: 8",aux,jugadas1.get(8),aux2.get(1),1);
	    demo3.pack();
	    RefineryUtilities.centerFrameOnScreen(demo3);
	    demo3.setVisible(true);

	    RadarChart demo8 = new RadarChart("Jugador:9 ",aux,jugadas1.get(9),aux2.get(1),1);
	    demo8.pack();
	    RefineryUtilities.centerFrameOnScreen(demo8);
	    demo8.setVisible(true);


	    RadarChart demo5 = new RadarChart("Jugador: 3",aux,jugadas1.get(3),aux2.get(1),1);
	    demo5.pack();
	    RefineryUtilities.centerFrameOnScreen(demo5);
	    demo5.setVisible(true);



	    //cluster 2

	    RadarChart demo9 = new RadarChart("Jugador:2 ",aux,jugadas1.get(2),aux2.get(2),2);
	    demo9.pack();
	    RefineryUtilities.centerFrameOnScreen(demo9);
	    demo9.setVisible(true);
	    
	    RadarChart demo = new RadarChart("Jugador: 0",aux,jugadas1.get(0),aux2.get(2),2);
	    demo.pack();
	    RefineryUtilities.centerFrameOnScreen(demo);
	    demo.setVisible(true);
	    
	    RadarChart demo1 = new RadarChart("Jugador: 10",aux,jugadas1.get(10),aux2.get(2),2);
	    demo1.pack();
	    RefineryUtilities.centerFrameOnScreen(demo1);
	    demo1.setVisible(true);

	}
		
		
	
}
