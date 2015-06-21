import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.math.DenseVector;
import org.jfree.ui.RefineryUtilities;


public class PathFinding2Data{

	public PathFinding2Data() {
		// TODO Auto-generated constructor stub
	}
	
	public static void getData() throws Exception {
		//Se genera la muestra
		PathFinding2 pathFinding = new PathFinding2();
		ArrayList<PathFinding2Type> dataPathFinding2 = new ArrayList<PathFinding2Type>();
		dataPathFinding2 = pathFinding.listadejugadas();

		List< DenseVector> jugadas2 = new ArrayList< DenseVector>();
		DenseVector jugada2;
		
		for(int i=0; i<dataPathFinding2.size(); i++){
			
			if ( dataPathFinding2.get(i).getNumeroClicks() > dataPathFinding2.get(i).MAX_CLICKS){
				dataPathFinding2.get(i).setNumeroClicks(dataPathFinding2.get(i).MAX_CLICKS);
			}
			
			if ( dataPathFinding2.get(i).getObstaculosChocados() > dataPathFinding2.get(i).MAX_OBSTACULOS){
				dataPathFinding2.get(i).setObstaculosChocados(dataPathFinding2.get(i).MAX_OBSTACULOS);
			} 			


			if ( dataPathFinding2.get(i).getVidasPerdidas() > dataPathFinding2.get(i).MAX_VIDAS_PERDIDAS){
				dataPathFinding2.get(i).setVidasPerdidas(dataPathFinding2.get(i).MAX_VIDAS_PERDIDAS);
			}

			if ( dataPathFinding2.get(i).getTiempoJuego() > dataPathFinding2.get(i).MAX_TIEMPO_JUEGO){
				dataPathFinding2.get(i).setTiempoJuego(dataPathFinding2.get(i).MAX_TIEMPO_JUEGO);
			} 


			if ( dataPathFinding2.get(i).getPuntos() > dataPathFinding2.get(i).MAX_PUNTOS){
				dataPathFinding2.get(i).setPuntos(dataPathFinding2.get(i).MAX_PUNTOS);
			} 

			if ( dataPathFinding2.get(i).getMoscasCogidas()> dataPathFinding2.get(i).MAX_MOSCAS){
				dataPathFinding2.get(i).setMoscasCogidas(dataPathFinding2.get(i).MAX_MOSCAS);
			} 


			if ( dataPathFinding2.get(i).getLengua()> dataPathFinding2.get(i).MAX_LENGUA){
				dataPathFinding2.get(i).setLengua(dataPathFinding2.get(i).MAX_LENGUA);
			} 


			if ( dataPathFinding2.get(i).getRanas()> dataPathFinding2.get(i).MAX_RANAS){
				dataPathFinding2.get(i).setRanas(dataPathFinding2.get(i).MAX_RANAS);
			} 

			
		}
		

		for(int i=0; i<dataPathFinding2.size(); i++){
			double aux_clicks=dataPathFinding2.get(i).getNumeroClicks();
			double aux_obstaculos=dataPathFinding2.get(i).getObstaculosChocados();
			double aux_vidas=dataPathFinding2.get(i).getVidasPerdidas();
			double aux_tiempo=dataPathFinding2.get(i).getTiempoJuego();
			double aux_puntos=dataPathFinding2.get(i).getPuntos();
			double aux_moscas=dataPathFinding2.get(i).getMoscasCogidas();
			double aux_lengua=dataPathFinding2.get(i).getLengua();
			double aux_ranas=dataPathFinding2.get(i).getRanas();
			
			
		 jugada2 = new DenseVector(new double[] { aux_clicks / dataPathFinding2.get(i).MAX_CLICKS,
				 								  aux_obstaculos /dataPathFinding2.get(i).MAX_OBSTACULOS,
				 								  aux_vidas / dataPathFinding2.get(i).MAX_VIDAS_PERDIDAS,
				 								  aux_tiempo /dataPathFinding2.get(i).MAX_TIEMPO_JUEGO,
				 								  aux_puntos /dataPathFinding2.get(i).MAX_PUNTOS,
				 								  aux_lengua / dataPathFinding2.get(i).MAX_LENGUA,
				 								  aux_ranas / dataPathFinding2.get(i).MAX_RANAS});	
		 jugadas2.add(jugada2);
		 
		}
		DataAnalisis.runAnalisis(jugadas2);
		  // se grafican  los clústeres obtenidos 

		
		  List<String> aux = dataPathFinding2.get(0).getFeatures();
		  List<String>  aux2 =dataPathFinding2.get(0).getClusters();
		  
		// cluster 0	
		    
		RadarChart demo10 = new RadarChart("Jugador:5 ",aux,jugadas2.get(5),aux2.get(0),0);
		demo10.pack();
		RefineryUtilities.centerFrameOnScreen(demo10);
		demo10.setVisible(true);


	    // cluster 1	

	    RadarChart demo3 = new RadarChart("Jugador: 8",aux,jugadas2.get(8),aux2.get(1),1);
	    demo3.pack();
	    RefineryUtilities.centerFrameOnScreen(demo3);
	    demo3.setVisible(true);

	    RadarChart demo8 = new RadarChart("Jugador:9 ",aux,jugadas2.get(9),aux2.get(1),1);
	    demo8.pack();
	    RefineryUtilities.centerFrameOnScreen(demo8);
	    demo8.setVisible(true);

	    RadarChart demo5 = new RadarChart("Jugador: 3",aux,jugadas2.get(3),aux2.get(1),1);
	    demo5.pack();
	    RefineryUtilities.centerFrameOnScreen(demo5);
	    demo5.setVisible(true);

	    RadarChart demo4 = new RadarChart("Jugador: 1 ",aux,jugadas2.get(1),aux2.get(1),1);
	    demo4.pack();
	    RefineryUtilities.centerFrameOnScreen(demo4);
	    demo4.setVisible(true);
	    RadarChart demo6 = new RadarChart("Jugador:4 ",aux,jugadas2.get(4),aux2.get(1),1);
	    demo6.pack();
	    RefineryUtilities.centerFrameOnScreen(demo6);
	    demo6.setVisible(true);
	    
		RadarChart demo2 = new RadarChart("Jugador: 6",aux,jugadas2.get(6),aux2.get(1),1);
		demo2.pack();
		RefineryUtilities.centerFrameOnScreen(demo2);
		demo2.setVisible(true);

	    //cluster 2

	    RadarChart demo9 = new RadarChart("Jugador:2 ",aux,jugadas2.get(2),aux2.get(2),2);
	    demo9.pack();
	    RefineryUtilities.centerFrameOnScreen(demo9);
	    demo9.setVisible(true);

	    
	    RadarChart demo7 = new RadarChart("Jugador:7 ",aux,jugadas2.get(7),aux2.get(2),2);
	    demo7.pack();
	    RefineryUtilities.centerFrameOnScreen(demo7);
	    demo7.setVisible(true);
		  
	    RadarChart demo = new RadarChart("Jugador: 0",aux,jugadas2.get(0),aux2.get(2),2);
		demo.pack();
		RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);
		
	    RadarChart demo1 = new RadarChart("Jugador: 10",aux,jugadas2.get(10),aux2.get(2),2);
	    demo1.pack();
	    RefineryUtilities.centerFrameOnScreen(demo1);
	    demo1.setVisible(true);

		  

	}
	
}
