package de.brenner.schroedinger.kapitel_12.uebung_eins;

public class Gerade implements Runnable {
	@Override
	public void run(){
		for(int zahl = 0; zahl <= 100; zahl++){
			if(zahl%2==0){
				System.out.println("Zahl Gerade:" + zahl);
				
			}
		}
	}
}
