import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.math.DenseVector;
import org.jfree.ui.RefineryUtilities;


public class ShootData{

	public ShootData() {
		// TODO Auto-generated constructor stub
	}
	
	public static void getData() throws Exception {
		//Se genera la muestra
		Shoot shoot = new Shoot();
		ArrayList<ShootType> dataShoot = new ArrayList<ShootType>();
		dataShoot = shoot.listadejugadas();

		List< DenseVector> shoots = new ArrayList< DenseVector>();
		DenseVector shoot1;
		
		for(int i=0; i<dataShoot.size(); i++){
			
			if ( dataShoot.get(i).getDisparosHechos() > dataShoot.get(i).MAX_DISPAROS_HECHOS){
				dataShoot.get(i).setDisparosHechos(dataShoot.get(i).MAX_DISPAROS_HECHOS);
			} 			
			if ( dataShoot.get(i).getDisparosRecibidos() > dataShoot.get(i).MAX_DISPAROS_RECIBIDOS){
				dataShoot.get(i).setDisparosRecibidos(dataShoot.get(i).MAX_DISPAROS_RECIBIDOS);
			}

			if ( dataShoot.get(i).getPiedrasDestruidas()> dataShoot.get(i).MAX_PIEDRAS_DESTRUIDAS){
				dataShoot.get(i).setPiedrasDestruidas(dataShoot.get(i).MAX_PIEDRAS_DESTRUIDAS);
			}

			if ( dataShoot.get(i).getEnemigosMatados()> dataShoot.get(i).MAX_ENEMIGOS_MATADOS){
				dataShoot.get(i).setEnemigosMatados(dataShoot.get(i).MAX_ENEMIGOS_MATADOS);
			} 

			if ( dataShoot.get(i).getBonoVida() > dataShoot.get(i).MAX_BONO_VIDA){
				dataShoot.get(i).setBonoVida(dataShoot.get(i).MAX_BONO_VIDA);
			} 

			if ( dataShoot.get(i).getChoqueNave()> dataShoot.get(i).MAX_CHOQUE_NAVE){
				dataShoot.get(i).setChoqueNave(dataShoot.get(i).MAX_CHOQUE_NAVE);
			} 

			if ( dataShoot.get(i).getTeclaArriba()> dataShoot.get(i).MAX_TECLA_ARRIBA){
				dataShoot.get(i).setTeclaArriba(dataShoot.get(i).MAX_TECLA_ARRIBA);
			} 

			if ( dataShoot.get(i).getTeclaAbajo()> dataShoot.get(i).MAX_TECLA_ABAJO){
				dataShoot.get(i).setTeclaAbajo(dataShoot.get(i).MAX_TECLA_ABAJO);
			} 

			if ( dataShoot.get(i).getTeclaDerecha()> dataShoot.get(i).MAX_TECLA_DERECHA){
				dataShoot.get(i).setTeclaDerecha(dataShoot.get(i).MAX_TECLA_DERECHA);
			} 

			if ( dataShoot.get(i).getTeclaIzqda()> dataShoot.get(i).MAX_TECLA_IZQDA){
				dataShoot.get(i).setTeclaIzqda(dataShoot.get(i).MAX_TECLA_IZQDA);
			} 
			
			if ( dataShoot.get(i).getTiempoJuego() > dataShoot.get(i).MAX_TIEMPO_JUEGO){
				dataShoot.get(i).setTiempoJuego(dataShoot.get(i).MAX_TIEMPO_JUEGO);
			} 
			
		}
			 

		for(int i=0; i<dataShoot.size(); i++){
			double aux_izqda=dataShoot.get(i).getTeclaIzqda();
			double aux_derecha=dataShoot.get(i).getTeclaDerecha();
			double aux_abajo=dataShoot.get(i).getTeclaAbajo();
			double aux_arriba=dataShoot.get(i).getTeclaArriba();
			double aux_bono=dataShoot.get(i).getBonoVida();
			double aux_choque=dataShoot.get(i).getChoqueNave();
			double aux_hechos=dataShoot.get(i).getDisparosHechos();
			double aux_recibidos=dataShoot.get(i).getDisparosRecibidos();
			double aux_matados=dataShoot.get(i).getEnemigosMatados();
			double aux_piedras=dataShoot.get(i).getPiedrasDestruidas();
			double aux_tiempo=dataShoot.get(i).getTiempoJuego();

			
		 shoot1 = new DenseVector(new double[] {
				 								aux_derecha / dataShoot.get(i).MAX_TECLA_DERECHA,
				 								aux_arriba / dataShoot.get(i).MAX_TECLA_ARRIBA,
				 								aux_bono / dataShoot.get(i).MAX_BONO_VIDA,
				 								aux_choque / dataShoot.get(i).MAX_CHOQUE_NAVE,
				 								aux_hechos / dataShoot.get(i).MAX_DISPAROS_HECHOS,
				 								aux_recibidos / dataShoot.get(i).MAX_DISPAROS_RECIBIDOS,
				 								aux_matados / dataShoot.get(i).MAX_ENEMIGOS_MATADOS,
				 								aux_piedras / dataShoot.get(i).MAX_PIEDRAS_DESTRUIDAS,
				 								aux_tiempo / dataShoot.get(i).MAX_TIEMPO_JUEGO});	
		 shoots.add(shoot1);
		 
		}
		DataAnalisis.runAnalisis(shoots);
		
		  // se grafican  los clústeres obtenidos 
		  // cluster 0	
			
		  List<String> aux = dataShoot.get(0).getFeatures();
		  List<String>  aux2 =dataShoot.get(0).getClusters();
		  
			
	    RadarChart demo = new RadarChart("Jugador: 1",aux,shoots.get(1),aux2.get(0),0);
	    demo.pack();
	    RefineryUtilities.centerFrameOnScreen(demo);
	    demo.setVisible(true);
	    
	    RadarChart demo1 = new RadarChart("Jugador: 5",aux,shoots.get(5),aux2.get(0),0);
	    demo1.pack();
	    RefineryUtilities.centerFrameOnScreen(demo1);
	    demo1.setVisible(true);

	    RadarChart demo2 = new RadarChart("Jugador: 6",aux,shoots.get(6),aux2.get(0),0);
	    demo2.pack();
	    RefineryUtilities.centerFrameOnScreen(demo2);
	    demo2.setVisible(true);

	    RadarChart demo3 = new RadarChart("Jugador: 8",aux,shoots.get(8),aux2.get(0),0);
	    demo3.pack();
	    RefineryUtilities.centerFrameOnScreen(demo3);
	    demo3.setVisible(true);

	    // cluster 1	

	    RadarChart demo4 = new RadarChart("Jugador: 0 ",aux,shoots.get(0),aux2.get(1),1);
	    demo4.pack();
	    RefineryUtilities.centerFrameOnScreen(demo4);
	    demo4.setVisible(true);
	    
	    RadarChart demo5 = new RadarChart("Jugador: 3",aux,shoots.get(3),aux2.get(1),1);
	    demo5.pack();
	    RefineryUtilities.centerFrameOnScreen(demo5);
	    demo5.setVisible(true);

	    RadarChart demo6 = new RadarChart("Jugador:4 ",aux,shoots.get(4),aux2.get(1),1);
	    demo6.pack();
	    RefineryUtilities.centerFrameOnScreen(demo6);
	    demo6.setVisible(true);
	    
	    RadarChart demo7 = new RadarChart("Jugador:7 ",aux,shoots.get(7),aux2.get(1),1);
	    demo7.pack();
	    RefineryUtilities.centerFrameOnScreen(demo7);
	    demo7.setVisible(true);
	    
	    RadarChart demo8 = new RadarChart("Jugador:9 ",aux,shoots.get(9),aux2.get(1),1);
	    demo8.pack();
	    RefineryUtilities.centerFrameOnScreen(demo8);
	    demo8.setVisible(true);

	    //cluster 2
	    RadarChart demo9 = new RadarChart("Jugador:2 ",aux,shoots.get(2),aux2.get(2),2);
	    demo9.pack();
	    RefineryUtilities.centerFrameOnScreen(demo9);
	    demo9.setVisible(true);
	    
	    RadarChart demo10 = new RadarChart("Jugador:10 ",aux,shoots.get(10),aux2.get(2),2);
	    demo10.pack();
	    RefineryUtilities.centerFrameOnScreen(demo10);
	    demo10.setVisible(true);//		
	}
}
