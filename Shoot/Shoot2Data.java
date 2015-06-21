import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.math.DenseVector;
import org.jfree.ui.RefineryUtilities;


public class Shoot2Data{

	public Shoot2Data() {
		// TODO Auto-generated constructor stub
	}
	
	public static void getData() throws Exception {
		//Se genera la muestra
		Shoot2 shoot = new Shoot2();
		ArrayList<Shoot2Type> dataShoot2 = new ArrayList<Shoot2Type>();
		dataShoot2 = shoot.listadejugadas();

		List< DenseVector> shoots2 = new ArrayList< DenseVector>();
		DenseVector shoot2;
			 
		for(int i=0; i<dataShoot2.size(); i++){
			
			if ( dataShoot2.get(i).getDisparosHechos() > dataShoot2.get(i).MAX_DISPAROS_HECHOS){
				dataShoot2.get(i).setDisparosHechos(dataShoot2.get(i).MAX_DISPAROS_HECHOS);
			} 			
			if ( dataShoot2.get(i).getDisparosRecibidos() > dataShoot2.get(i).MAX_DISPAROS_RECIBIDOS){
				dataShoot2.get(i).setDisparosRecibidos(dataShoot2.get(i).MAX_DISPAROS_RECIBIDOS);
			}

			if ( dataShoot2.get(i).getTorretasDestruidas()> dataShoot2.get(i).MAX_TORRETAS_DESTRUIDAS){
				dataShoot2.get(i).setTorretasDestruidas(dataShoot2.get(i).MAX_TORRETAS_DESTRUIDAS);
			}

			if ( dataShoot2.get(i).getArañasMatados()> dataShoot2.get(i).MAX_ENEMIGOS_MATADOS){
				dataShoot2.get(i).setArañasMatados(dataShoot2.get(i).MAX_ENEMIGOS_MATADOS);
				
			} 

			if ( dataShoot2.get(i).getChoqueArañas() > dataShoot2.get(i).MAX_CHOQUE_ARAÑAS){
				dataShoot2.get(i).setChoqueArañas (dataShoot2.get(i).MAX_CHOQUE_ARAÑAS);
			} 

			if ( dataShoot2.get(i).getTeclaArriba()> dataShoot2.get(i).MAX_TECLA_ARRIBA){
				dataShoot2.get(i).setTeclaArriba(dataShoot2.get(i).MAX_TECLA_ARRIBA);
			} 

			if ( dataShoot2.get(i).getTeclaAbajo()> dataShoot2.get(i).MAX_TECLA_ABAJO){
				dataShoot2.get(i).setTeclaAbajo(dataShoot2.get(i).MAX_TECLA_ABAJO);
			} 

			if ( dataShoot2.get(i).getTeclaDerecha()> dataShoot2.get(i).MAX_TECLA_DERECHA){
				dataShoot2.get(i).setTeclaDerecha(dataShoot2.get(i).MAX_TECLA_DERECHA);
			} 

			if ( dataShoot2.get(i).getTeclaIzqda()> dataShoot2.get(i).MAX_TECLA_IZQDA){
				dataShoot2.get(i).setTeclaIzqda(dataShoot2.get(i).MAX_TECLA_IZQDA);
			} 
			
			if ( dataShoot2.get(i).getTiempoJuego() > dataShoot2.get(i).MAX_TIEMPO_JUEGO){
				dataShoot2.get(i).setTiempoJuego(dataShoot2.get(i).MAX_TIEMPO_JUEGO);
			} 

			if ( dataShoot2.get(i).getPuntos() > dataShoot2.get(i).MAX_PUNTOS){
				dataShoot2.get(i).setPuntos(dataShoot2.get(i).MAX_PUNTOS);
			} 
			
			if ( dataShoot2.get(i).getBonoVida() > dataShoot2.get(i).MAX_BONO_VIDA){
				dataShoot2.get(i).setBonoVida(dataShoot2.get(i).MAX_BONO_VIDA);
			} 

			if ( dataShoot2.get(i).getGema() > dataShoot2.get(i).MAX_GEMA){
				dataShoot2.get(i).setGema(dataShoot2.get(i).MAX_GEMA);
			} 


			
		}
		for(int i=0; i<dataShoot2.size(); i++){
			
			double aux_hechos=dataShoot2.get(i).getDisparosHechos();
			double aux_recibidos=dataShoot2.get(i).getDisparosRecibidos();
			double aux_torretas=dataShoot2.get(i).getTorretasDestruidas();
			double aux_matados=dataShoot2.get(i).getArañasMatados();
			double aux_choque=dataShoot2.get(i).getChoqueArañas();
			double aux_arriba=dataShoot2.get(i).getTeclaArriba();
			double aux_abajo=dataShoot2.get(i).getTeclaAbajo();
			double aux_izqda=dataShoot2.get(i).getTeclaIzqda();
			double aux_derecha=dataShoot2.get(i).getTeclaDerecha();
			double aux_tiempo=dataShoot2.get(i).getTiempoJuego();
			double aux_puntos=dataShoot2.get(i).getPuntos();		
			double aux_bono=dataShoot2.get(i).getBonoVida();
			double aux_gema=dataShoot2.get(i).getGema();


			
		 shoot2 = new DenseVector(new double[] {
				 								aux_hechos / dataShoot2.get(i).MAX_DISPAROS_HECHOS,
				 								aux_recibidos / dataShoot2.get(i).MAX_DISPAROS_RECIBIDOS,
				 								aux_torretas / dataShoot2.get(i).MAX_TORRETAS_DESTRUIDAS,
				 								aux_matados / dataShoot2.get(i).MAX_ENEMIGOS_MATADOS,
				 								aux_choque / dataShoot2.get(i).MAX_CHOQUE_ARAÑAS,
				 								aux_arriba / dataShoot2.get(i).MAX_TECLA_ARRIBA,
				 								aux_abajo / dataShoot2.get(i).MAX_TECLA_ABAJO,									 								
				 								aux_izqda / dataShoot2.get(i).MAX_TECLA_IZQDA,
				 								aux_derecha / dataShoot2.get(i).MAX_TECLA_DERECHA,
		 										aux_gema / dataShoot2.get(i).MAX_GEMA});

		 shoots2.add(shoot2);
		 
		}
		DataAnalisis.runAnalisis(shoots2);
		
		  // se grafican  los clústeres obtenidos 

			
		  List<String> aux = dataShoot2.get(0).getFeatures();
		  List<String>  aux2 =dataShoot2.get(0).getClusters();
		  
		  // cluster 0	
	    RadarChart demo = new RadarChart("Jugador: 0",aux,shoots2.get(0),aux2.get(0),0);
	    demo.pack();
	    RefineryUtilities.centerFrameOnScreen(demo);
	    demo.setVisible(true);
	    
	    RadarChart demo1 = new RadarChart("Jugador: 10",aux,shoots2.get(10),aux2.get(0),0);
	    demo1.pack();
	    RefineryUtilities.centerFrameOnScreen(demo1);
	    demo1.setVisible(true);
	   

	    RadarChart demo2 = new RadarChart("Jugador: 6",aux,shoots2.get(6),aux2.get(0),0);
	    demo2.pack();
	    RefineryUtilities.centerFrameOnScreen(demo2);
	    demo2.setVisible(true);
	    
	    // cluster 1	

	    RadarChart demo3 = new RadarChart("Jugador: 8",aux,shoots2.get(8),aux2.get(1),1);
	    demo3.pack();
	    RefineryUtilities.centerFrameOnScreen(demo3);
	    demo3.setVisible(true);

	    RadarChart demo8 = new RadarChart("Jugador:9 ",aux,shoots2.get(9),aux2.get(1),1);
	    demo8.pack();
	    RefineryUtilities.centerFrameOnScreen(demo8);
	    demo8.setVisible(true);

	    RadarChart demo10 = new RadarChart("Jugador:5 ",aux,shoots2.get(5),aux2.get(1),1);
	    demo10.pack();
	    RefineryUtilities.centerFrameOnScreen(demo10);
	    demo10.setVisible(true);

	    RadarChart demo5 = new RadarChart("Jugador: 3",aux,shoots2.get(3),aux2.get(1),1);
	    demo5.pack();
	    RefineryUtilities.centerFrameOnScreen(demo5);
	    demo5.setVisible(true);

	    RadarChart demo4 = new RadarChart("Jugador: 1 ",aux,shoots2.get(1),aux2.get(1),1);
	    demo4.pack();
	    RefineryUtilities.centerFrameOnScreen(demo4);
	    demo4.setVisible(true);


	    //cluster 2

	    RadarChart demo9 = new RadarChart("Jugador:2 ",aux,shoots2.get(2),aux2.get(2),2);
	    demo9.pack();
	    RefineryUtilities.centerFrameOnScreen(demo9);
	    demo9.setVisible(true);
	    
	    // cluster 3

	    RadarChart demo6 = new RadarChart("Jugador:4 ",aux,shoots2.get(4),aux2.get(3),3);
	    demo6.pack();
	    RefineryUtilities.centerFrameOnScreen(demo6);
	    demo6.setVisible(true);
	    
	    RadarChart demo7 = new RadarChart("Jugador:7 ",aux,shoots2.get(7),aux2.get(3),3);
	    demo7.pack();
	    RefineryUtilities.centerFrameOnScreen(demo7);
	    demo7.setVisible(true);
	}
}
