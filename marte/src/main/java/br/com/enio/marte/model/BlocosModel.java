package br.com.enio.marte.model;

import java.util.SplittableRandom;

public class BlocosModel {
	public Long[][] criarMatrizLong(){
		Long[][] matriz = new Long [16][16];
		SplittableRandom a =new SplittableRandom();
		for(int i=0; i<16 ; i++) {
			for(int j=0 ; j<16;j++) {
				matriz[i][j]=a.nextLong(0, 10);
			}
		}
		return matriz;
	}
	
	public char[][] criarMatrizChar(){
		char[] c = "QWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();
		char[][] matrizc = new char [16][16];
		SplittableRandom a =new SplittableRandom();
		for(int i=0; i<16 ; i++) {
			for(int j=0 ; j<16;j++) {
				matrizc[i][j]=c[a.nextInt(0,c.length)];
			}
		}
		return matrizc;
	}
}