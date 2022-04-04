/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1sap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author solan
 */
public class Habilidades {
     public static int z =0;
    public static int contador =0;
    public static int y =0;
    public static int ataque =0;
    public static int vida =0;
    public static int cantidad =0;
    public static int nivelAnimal =0;
    public static int contadorTexto =0;
    public static String [][] SalidaTexto =new String [200][1];
    public static boolean turnoAliado =false;
      public static boolean BatallaGanada =false;//*****************programarla
    public static void alMorir(int [][] nivel,int x, int pos,int [][] aliado,int [][] oponente,int [][] aliadoB,int [][] oponenteB, String [][] tipo) {
        
         cantidades(pos,aliado,oponente);
         AnteriorPosterior(pos,aliado,oponente); 
         if(nivel[x][1]== 1){
             //BATALLA
              if(nivel[x][3]== 1){
                     
                  //ALIADO
                  if (nivel[x][4]== 1 && contador> 0){
                      //AL AZAR
                      if(nivel[x][5]== 8){//hormiga
                          z = (int)(Math.random()*4); 
                          while(aliado[z][0]==0 || z ==pos){
                              z = (int)(Math.random()*4); 
                          }
                          //SUMA
                         AtaqueVida(z,x,nivel,aliado,tipo);}//hormiga
                      else{
                          if(nivel[x][5]== 3){//mapache
                              if (condicionA== true && condicionP ==true){
                              AtaqueVida(posterior,x,nivel,aliado,tipo);
                              AtaqueVida(anterior,x,nivel,aliado,tipo);
                              }else{
                                  if (condicionA ==true){
                                      AtaqueVida(anterior,x,nivel,aliado,tipo);
                                  }else{
                                      if(condicionP ==true){
                                          AtaqueVida(posterior,x,nivel,aliado,tipo);
                                      }
                                  }
                              } }//mapache
                          else{
                              if(nivel[x][5]== 2){//tortuga melon armor
                                  if(nivelAnimal==1){
                                    AtaqueVida(pos,x,nivel,aliado,tipo);
                                           }else{
                                               if(nivelAnimal==2){
                                                   if (condicionA==true&& condicionA1){
                                                     AtaqueVida(anterior,x,nivel,aliado,tipo);
                                                     AtaqueVida(anterior1,x,nivel,aliado,tipo);
                                                   }else{
                                                       if(condicionA==true){
                                                         AtaqueVida(anterior,x,nivel,aliado,tipo);  
                                                       }
                                                   }
                                               }else{
                                                   if(nivelAnimal==3){
                                                       if(condicionA==true && condicionA1==true && condicionA2==true){
                                                           AtaqueVida(anterior,x,nivel,aliado,tipo);
                                                           AtaqueVida(anterior2,x,nivel,aliado,tipo);
                                                           AtaqueVida(anterior1,x,nivel,aliado,tipo);
                                                       }else{
                                                           if (condicionA==true&& condicionA1){
                                                     AtaqueVida(anterior,x,nivel,aliado,tipo);
                                                     AtaqueVida(anterior1,x,nivel,aliado,tipo);
                                                   }else{
                                                       if(condicionA==true){
                                                         AtaqueVida(anterior,x,nivel,aliado,tipo);  
                                                       }
                                                   }
                                                       }
                                                   }
                                               }
                                           }   
                              }//tortuga
                              else{
                                  if(nivel[x][5]== 10){//mamut
                                       for (y = 0; y < 5 ; y++) {
                                    if(aliado[y][0]!=0){
                                        AtaqueVida(y,x,nivel,aliado,tipo);
                                    }
                              }
                                  }//mamut
                              }}
                      }
                  }else{
                      if(nivel[x][4]== 3){
                          //NUEVO
                          if(nivel[x][5]== 0){
                              if(nivel[x][6]== 1){
                                  if(nivel[x][0]==4){//grillo
                                      aliado[pos][0] = 55;
                                      AnimalInvocado(pos,54,nivel,aliado,tipo); }//grillo
                                  else{
                                    if(nivel[x][0]==16){//araña
                                         int araña;
                                         araña = (int)((Math.random()*10)+16); 
                                         AnimalInvocado(pos,araña,nivel,aliado,tipo); }//araña
                                    else{
                                          if(nivel[x][0]==28){//venado
                                            aliado[pos][0] = 56;
                                            AnimalInvocado(pos,55,nivel,aliado,tipo);  }//venado
                                              } 
                                  }   
                              }else{
                                  int cont=pos;
                                  if(nivel[x][6]== 5){
                                       if(nivel[x][0]==13){//rata
                                           if(nivelAnimal==1){
                                               aliado[pos][0] = 57;
                                      AnimalInvocado(pos,56,nivel,aliado,tipo);
                                           }else{
                                               if(nivelAnimal==2){
                                                   if (condicionP==true){
                                                       aliado[pos][0] = 57;
                                                              AnimalInvocado(pos,56,nivel,aliado,tipo);
                                                              aliado[posterior][0] = 57;
                                                              AnimalInvocado(posterior,56,nivel,aliado,tipo);
                                                   }else{
                                                       aliado[pos][0] = 57;
                                                        AnimalInvocado(pos,56,nivel,aliado,tipo);
                                                   }
                                               }else{
                                                   if(nivelAnimal==3){
                                                       if(condicionP==true && condicionP1==true){
                                                          aliado[pos][0] = 57;
                                                          AnimalInvocado(pos,56,nivel,aliado,tipo);
                                                          aliado[posterior][0] = 57;
                                                          AnimalInvocado(posterior,56,nivel,aliado,tipo);
                                                         aliado[posterior1][0] = 57;
                                                          AnimalInvocado(posterior1,56,nivel,aliado,tipo);
                                                           //******************
                                                       }else{
                                                           if (condicionP==true){
                                                            aliado[pos][0] = 57;
                                                              AnimalInvocado(pos,56,nivel,aliado,tipo);
                                                            aliado[posterior][0] = 57;
                                                              AnimalInvocado(posterior,56,nivel,aliado,tipo);
                                                         }else{
                                                            aliado[pos][0] = 57;
                                                              AnimalInvocado(pos,56,nivel,aliado,tipo);
                                                         }
                                                       }
                                                   }
                                               }
                                           }   
                                      }//rata
                                  }else{
                                      if(nivel[x][6]== 2){//oveja
                                               if(nivel[x][0]==22){
                                                aliado[pos][0] = 58;
                                                AnimalInvocado(pos,57,nivel,aliado,tipo); 
                                                    if (condicionP==true){
                                                      aliado[posterior][0] = 58;
                                                    AnimalInvocado(posterior,57,nivel,aliado,tipo);  
                                                    }
                                          }
                                      }//oveja
                                  }
                              }
                          }
                      }else{
                          if(nivel[x][4]== 8 && nivel[x][5]== 10){//Puerco espin
                              for (y = 0; y < 5 ; y++) {
                                    if(aliado[y][0]!=0){
                                        AtaqueVida(y,x,nivel, aliado,tipo);
                                    }//amigo
                                    if(oponente[y][0]!=0){
                                        AtaqueVidaEnemigo(y,x,nivel,oponente,aliado,tipo);
                                    }//enemigo
                              } }//Puerco espin
                          else{
                              if(nivel[x][4]== 4){
                                  
                              }
                          }
                      }
                  }
              }else{
                  //PERMANENTE
                  if(nivel[x][3]== 2){//lobo
                      if(nivel[x][4]== 4 &&contador ==1){
                      AtaqueVidaPermanente(pos,x,nivel,aliadoB,tipo);
                  }//lobo
                  }
              }
         }
    }
    public static void AtaqueVida(int pos, int x,int [][] nivel, int [][] aliado, String [][] tipo) {
        LecturaEscritura texto = new LecturaEscritura();
          aliado[pos][1] = aliado[pos][1] + nivel[x][ataque];
          aliado[pos][2] = aliado[pos][2] + nivel[x][vida];
           System.out.format("%s le otorgo %d / %d a %s", tipo[x][0] ,nivel[x][ataque],nivel[x][vida], tipo[aliado[pos][0]-1][0]);
         System.out.println("");
         SalidaTexto[contadorTexto][0]=tipo[x][0] +" le otorgo "+nivel[x][ataque]+" / " +nivel[x][vida]+" a "+ tipo[aliado[pos][0]-1][0];
       contadorTexto = contadorTexto +1;
    }
    public static void AtaqueVidaPermanente(int pos, int x,int [][] nivel,int [][] aliadoB, String [][] tipo) {
          aliadoB[pos][1] = aliadoB[pos][1] + nivel[x][ataque];
          aliadoB[pos][2] = aliadoB[pos][2] + nivel[x][vida];
           System.out.format("%s le otorgo %d / %d a %s", tipo[x][0] ,nivel[x][ataque],nivel[x][vida], tipo[aliadoB[pos][0]-1][0]);
         System.out.println("");
       SalidaTexto[contadorTexto][0]=tipo[x][0] +" le otorgo "+nivel[x][ataque]+" / " +nivel[x][vida]+" a "+ tipo[aliadoB[pos][0]-1][0];
       contadorTexto = contadorTexto +1;
    }
    public static void AtaqueVidaPorcentaje(int pos, int x,int [][] nivel, int pos2,int [][] aliado, String [][] tipo) {
          aliado[pos][1] = aliado[pos][1] + (aliado[pos2][1]*(nivel[x][ataque])/100);
          aliado[pos][2] = aliado[pos][2] + (aliado[pos2][2]*(nivel[x][vida])/100);
           System.out.format("%s le otorgo %d / %d a %s", tipo[x][0] ,nivel[x][ataque],nivel[x][vida], tipo[aliado[pos][0]-1][0]);
         System.out.println("");
       SalidaTexto[contadorTexto][0]=tipo[x][0] +" le otorgo "+nivel[x][ataque]+" / " +nivel[x][vida]+" a "+ tipo[aliado[pos][0]-1][0];
       contadorTexto = contadorTexto +1;
    }
    public static void AtaqueVidaPorcentajeEnemigo(int pos, int x,int [][] nivel,int [][] oponente,int [][] aliado, String [][] tipo) {
          oponente[pos][1] = oponente[pos][1] + (oponente[pos][1]*(nivel[x][ataque])/100);
          oponente[pos][2] = oponente[pos][2] + (oponente[pos][2]*(nivel[x][vida])/100);
           System.out.format("%s le otorgo %d / %d a %s", tipo[x][0] ,nivel[x][ataque],nivel[x][vida], tipo[oponente[pos][0]-1][0]);
         System.out.println("");
       SalidaTexto[contadorTexto][0]=tipo[x][0] +" le otorgo "+nivel[x][ataque]+" / " +nivel[x][vida]+" a "+ tipo[oponente[pos][0]-1][0];
       contadorTexto = contadorTexto +1;
    }
    public static void AtaqueVidaEnemigo(int pos, int x,int [][] nivel,int [][] oponente,int [][] aliado, String [][] tipo) {
          oponente[pos][1] = oponente[pos][1] + nivel[x][ataque];
          oponente[pos][2] = oponente[pos][2] + nivel[x][vida];
           
         if(nivel[x][ataque]==0){
             System.out.format("%s le quito  %d de vida a %s", tipo[x][0] ,-nivel[x][vida], tipo[oponente[pos][0]-1][0]);
         System.out.println(""); 
         SalidaTexto[contadorTexto][0]=tipo[x][0] +" le quito "+ -nivel[x][ataque]+" de vida a " + tipo[oponente[pos][0]-1][0];
       contadorTexto = contadorTexto +1;
         }else{
             if(nivel[x][vida]==0){
                System.out.format("%s le quito  %d de ataque a %s", tipo[x][0] ,-nivel[x][ataque], tipo[oponente[pos][0]-1][0]);
         System.out.println("");  
         SalidaTexto[contadorTexto][0]=tipo[x][0] +" le quito "+ -nivel[x][ataque]+" de ataque a " + tipo[oponente[pos][0]-1][0];
       contadorTexto = contadorTexto +1;
             }else{
                System.out.format("%s le quito %d / %d a %s", tipo[x][0] ,-nivel[x][ataque],-nivel[x][vida], tipo[oponente[pos][0]-1][0]);
         System.out.println(""); 
         SalidaTexto[contadorTexto][0]=tipo[x][0] +" le quito "+ -nivel[x][ataque]+" / " + -nivel[x][vida]+" a "+ tipo[oponente[pos][0]-1][0];
       contadorTexto = contadorTexto +1;
             }
         }
       
    }
    public static void AnimalInvocado(int pos, int x,int [][] nivel,int [][] aliado, String [][] tipo) {
          aliado[pos][1] =  nivel[x][ataque];
          aliado[pos][2] =  nivel[x][vida];
           System.out.format("Se invoco a %s con  %d / %d ", tipo[x][0] ,nivel[x][ataque],nivel[x][vida]);
         System.out.println("");
         SalidaTexto[contadorTexto][0]="Se invoco a" +tipo[x][0] +" con  "+nivel[x][ataque]+" / " +nivel[x][vida];
       contadorTexto = contadorTexto +1;
         //alInvocaarAliados
       if(panda==true){
          AtaqueVida(pos,42,nivel,aliado,tipo); 
       }
       if(caballo ==true){
           AtaqueVida(pos,5,nivel,aliado,tipo); 
       }
    }

        public static int contadorib,contador2,posib,posEnemigoDebil,posMosquito,posLeopardo,posDelfin,posCocodrilo,posCamaleon,posQuetzal,posDodo= 0;
         public static boolean mosquito,dodo,delfin,camaleon,leopardo,quetzal,tigre,cocodrilo=false;
         public static boolean condicionE1,condicionE2,condicionE3=false;
          public static int dañoAves,vidaAves,dañoAnimales,vidaAnimales,vidaEnemigoFuerte,dañoEnemigoFuerte,enemigoFuerte=0;
    public static void AnimalesAlInicioDeBatalla(int [][] aliado,int [][] oponente,String [][] tipo){
        mosquito =false; 
        dodo =false; 
        delfin =false; 
        camaleon =false; 
        leopardo =false; 
        quetzal=false; 
        tigre =false; 
        cocodrilo =false; 
        contadorib =0;
        condicionE1=false; 
        condicionE2 =false; 
        condicionE3 =false; 
for (y =4; y >=0 ; y--) {
                      if(aliado[y][0]!=0){
                          if(tipo[y][1].equals("V")){
                              dañoAves = dañoAves + aliado[y][1];
                              vidaAves = vidaAves + aliado[y][2];
                          }
                          dañoAnimales= dañoAnimales + aliado[y][1];
                           vidaAnimales = vidaAnimales + aliado[y][2];
                          contadorib = contadorib+1;
                          if(aliado[y][0]==3){
                                  mosquito =true;    
                                  posMosquito=y;
                              }
                          if(aliado[y][0]==10&&contadorib>1){
                                  dodo =true;  
                                  posDodo=0;
                              }
                          if(aliado[y][0]==31){
                                  delfin =true;    
                                  posDelfin=0;
                              }
                              if(aliado[y][0]==54){
                                  camaleon =true;   
                                  posCamaleon=y;
                              }
                              if(aliado[y][0]==49){
                                  leopardo =true;   
                                  posLeopardo=y;
                              }
                              if(aliado[y][0]==53){
                                  quetzal =true;    
                                  posQuetzal=y;
                              }
                              if(aliado[y][0]==46&&contadorib!=1){
                                  tigre =true; 
                              }
                              if(aliado[y][0]==41){
                                  cocodrilo =true;  
                                  posCocodrilo=0;
                              }
                      }
                  }
contador2=0;
for (y = 0; y < 5 ; y++) {
                      if(aliado[y][0]!=0){
                          contador2 = contador2+1;
                          if(contador2==contadorib){
                              posib=y;
                          }
                      }}
                          
//ENEMIGO
enemigoDebil=1000;
                contadorE =0;
                contadorE2 =0;
            for (y = 0; y < 5 ; y++) {
                      if(oponente[y][0]!=0){
                          if(tipo[y][1].equals("V")){
                            dañoAves = dañoAves + aliado[y][1];
                            vidaAves = vidaAves + aliado[y][2];
                          }
                          dañoAnimales= dañoAnimales + aliado[y][1];
                           vidaAnimales = vidaAnimales + aliado[y][2];
                          contadorE = contadorE +1;  
                          if(contadorE==1){
                              enemigoU=y;
                              if(oponente[y][2]<enemigoDebil){
                                  enemigoDebil= oponente[y][2]; 
                              posEnemigoDebil=y;}
                              if(oponente[y][2]>enemigoFuerte){
                                  enemigoFuerte= oponente[y][2]; 
                                  vidaEnemigoFuerte= oponente[y][2];
                                   dañoEnemigoFuerte= oponente[y][1];}
                          }
                      }
                  }
            if(contadorE>=1){
                condicionE1=true; 
                if(contadorE>=2){
                    condicionE2 =true; 
                    if(contadorE>=3){
                       condicionE3 =true;  
                    }
                }
            }

                  

    }
   
    public static void alIniciarBatalla(int [][] nivel,int [][] aliadoB,int [][] aliado,int [][] oponente, String [][] tipo) {  
       AnimalesAlInicioDeBatalla(aliado,oponente,tipo); 
             
                     if(dodo==true){// Dodo
                      AtaqueVidaPorcentaje(posib,9,nivel,posDodo,aliado,tipo);  
                     }// Dodo
                    
                         if(tigre ==true){//tigre
                             aliadoB[posib][5] = 2;
                             System.out.format("%s le otorgo habilidad de repeticion a %s", tipo[45][0] , tipo[aliadoB[posib][0]-1][0]);
                             System.out.println("");
                             SalidaTexto[contadorTexto][0]=tipo[45][0] +" le otorgo habilidad de repeticion a "+tipo[aliadoB[posib][0]-1][0];
                            contadorTexto = contadorTexto +1;
                         }//tigre
                         
                 
                         if(mosquito==true){//mosquito
                         //****************************SIN REPETIR/reutilizar codigo
                         cantidades(posMosquito,aliado,oponente);
                         if(nivelAnimal==1&&contadorE>0){
                             alAzarSinRepetir(nivelAnimal,oponente);
                             AtaqueVidaEnemigo(E1,2,nivel,oponente,aliado,tipo);
                         }else{
                             if(nivelAnimal==2){
                                 if(contadorE>1){
                                 alAzarSinRepetir(nivelAnimal,oponente);  
                                 AtaqueVidaEnemigo(E1,2,nivel,oponente,aliado,tipo);
                                 AtaqueVidaEnemigo(E2,2,nivel,oponente,aliado,tipo);
                                 }else{
                                     if(contadorE>0){
                                    alAzarSinRepetir(nivelAnimal-1,oponente);
                                    AtaqueVidaEnemigo(E1,2,nivel,oponente,aliado,tipo);
                                 }
                             }}else{
                                 if(nivelAnimal==3){
                                     if(contadorE>2){
                                         alAzarSinRepetir(nivelAnimal,oponente);
                                         AtaqueVidaEnemigo(E1,2,nivel,oponente,aliado,tipo);
                                         AtaqueVidaEnemigo(E2,2,nivel,oponente,aliado,tipo);
                                         AtaqueVidaEnemigo(E3,2,nivel,oponente,aliado,tipo);
                                     }else{
                                         if(contadorE>1){
                                     alAzarSinRepetir(nivelAnimal-1,oponente);
                                     AtaqueVidaEnemigo(E1,2,nivel,oponente,aliado,tipo);
                                     AtaqueVidaEnemigo(E2,2,nivel,oponente,aliado,tipo);
                                         }else{
                                     if(contadorE>0){
                                         alAzarSinRepetir(nivelAnimal-2,oponente);
                                         AtaqueVidaEnemigo(E1,2,nivel,oponente,aliado,tipo);
                                     
                                 }
                             }
                                     }
                                 }
                             }
                         }//mosquito
                         
                     }
                             if(leopardo==true){//leopardo
                                 cantidades(posMosquito,aliado,oponente);
                                 if(nivelAnimal==1&&contadorE>0){
                             alAzarSinRepetir(nivelAnimal,oponente);
                             AtaqueVidaPorcentajeEnemigo(E1,48,nivel,oponente,aliado,tipo);
                         }else{
                             if(nivelAnimal==2){
                                 if(contadorE>1){
                                 alAzarSinRepetir(nivelAnimal,oponente);  
                                 AtaqueVidaPorcentajeEnemigo(E1,48,nivel,oponente,aliado,tipo);
                                 AtaqueVidaPorcentajeEnemigo(E2,48,nivel,oponente,aliado,tipo);
                                 }else{
                                     if(contadorE>0){
                                    alAzarSinRepetir(nivelAnimal-1,oponente);
                                    AtaqueVidaPorcentajeEnemigo(E1,48,nivel,oponente,aliado,tipo);
                                 }
                             }}else{
                                 if(nivelAnimal==3){
                                     if(contadorE>2){
                                         alAzarSinRepetir(nivelAnimal,oponente);
                                         AtaqueVidaPorcentajeEnemigo(E1,48,nivel,oponente,aliado,tipo);
                                         AtaqueVidaPorcentajeEnemigo(E2,48,nivel,oponente,aliado,tipo);
                                         AtaqueVidaPorcentajeEnemigo(E3,48,nivel,oponente,aliado,tipo);
                                     }else{
                                         if(contadorE>1){
                                     alAzarSinRepetir(nivelAnimal-1,oponente);
                                     AtaqueVidaPorcentajeEnemigo(E1,48,nivel,oponente,aliado,tipo);
                                     AtaqueVidaPorcentajeEnemigo(E2,48,nivel,oponente,aliado,tipo);
                                         }else{
                                     if(contadorE>0){
                                         alAzarSinRepetir(nivelAnimal-2,oponente);
                                         AtaqueVidaPorcentajeEnemigo(E1,48,nivel,oponente,aliado,tipo);
                                     
                                 }
                             }
                                     }
                                 }
                             }
                         }
                             }//leopardo
                         
                             
                         if(delfin==true){//delfin
                             cantidades(posDelfin,aliado,oponente);
                             AtaqueVidaEnemigo(posEnemigoDebil,30,nivel,oponente,aliado,tipo);//delfin
                         }
                             if(cocodrilo==true){//cocodrilo
                                 cantidades(posCocodrilo,aliado,oponente);
                                 AtaqueVidaEnemigo(enemigoU,40,nivel,oponente,aliado,tipo);
                             }//cocodrilo
                         if(quetzal==true){//quetzal
                             cantidades(posQuetzal,aliado,oponente);
                             if(nivelAnimal==1){
                                 aliado[posQuetzal][2]=vidaAves;
                             }else{
                                 if(nivelAnimal==2){
                                     aliado[posQuetzal][2]=vidaAves;
                                     aliado[posQuetzal][1]=dañoAves;
                                 }else{
                                     if(nivelAnimal==3){
                                         aliado[posQuetzal][2]=vidaAnimales;
                                     aliado[posQuetzal][1]=dañoAnimales;
                                     }
                                 }
                             }
                         }//quetzal
                          if(camaleon==true){//camaleon
                             cantidades(posCamaleon,aliado,oponente);
                             if(nivelAnimal==1){
                                 aliado[posCamaleon][2]=vidaEnemigoFuerte;
                             }else{
                                 if(nivelAnimal==2){
                                    aliado[posCamaleon][2]=vidaEnemigoFuerte;
                                     aliado[posCamaleon][1]=dañoEnemigoFuerte; 
                                 }else{
                                     if(nivelAnimal==3){
                                        aliado[posCamaleon][2]=vidaEnemigoFuerte;
                                         aliado[posCamaleon][1]=dañoEnemigoFuerte;
                                         //***************copiar habilidad
                                     }
                                 }
                             }
                         }//camaleon
                     }

    public static void cantidades( int pos,int [][] aliado,int [][] oponente) {
        if(turnoAliado==true){ 
        if(aliado[pos][3]==1 ){
             ataque = 8;
             vida = 9;
             cantidad = 1;
             nivelAnimal = 1;
         }else{
             if(aliado[pos][3]==2){
                 ataque = 10;
             vida = 11;
             cantidad = 2;
             nivelAnimal = 2;
             }else{
                if(aliado[pos][3]==3){
                ataque = 12;
             vida = 13; 
             cantidad = 3;
             nivelAnimal = 3;
             } 
             }
         }}else{
             if(oponente[pos][3]==1 ){
             ataque = 8;
             vida = 9;
             cantidad = 1;
             nivelAnimal = 1;
         }else{
             if(oponente[pos][3]==2){
                 ataque = 10;
             vida = 11;
             cantidad = 2;
             nivelAnimal = 2;
             }else{
                if(oponente[pos][3]==3){
                ataque = 12;
             vida = 13; 
             cantidad = 3;
             nivelAnimal = 3;
             } 
             }
         }
        }
         }
         
    
    public static void alSubirNivel(int [][] nivel,int x, int pos,int [][] aliado,int [][] aliadoB,int [][] oponente, String [][] tipo) {
        cantidades(pos,aliado,oponente);
       AnteriorPosterior(pos,aliado,oponente); 
         if(nivel[x][1]== 3){//pescado
             if(nivel[x][4]== 1){
             for (int y = 0; y < contador-1 ; y++) {
                 if(aliado[y][0]!=x){
                     AtaqueVidaPermanente(y,x,nivel,aliadoB,tipo);
                 }
             }//pescado
         }else{
                 if(nivel[x][4]== 4){//pulpo
             if(nivelAnimal==2){
                 AtaqueVidaPermanente(pos,x,nivel,aliadoB,tipo);
             }else{
                 if(nivelAnimal==3){
                    AtaqueVidaPermanente(pos,x,nivel,aliadoB,tipo); 
                    aliado[pos][5]=5;
                    //habilidad especial
                 }
             }//pulpo
         }
             }
         }
    }
    //********************Dar valores
    public static int EnemigoAtaco =0;
    public static int Ea =0;
    public static int contador3 =0;
    public static int contador4 =0;//*****************iniciar}lizarlo por animal
    public static boolean habilidad4 = false;
    public static void alRecibirDaño(int [][] nivel,int x, int pos,int [][] aliado,int [][] oponente, String [][] tipo) {
        habilidad4 = false;
        cantidades(pos,aliado,oponente);
       AnteriorPosterior(pos,aliado,oponente); 
       
         if(nivel[x][1]== 4){
             habilidad4 = true;
             if(nivel[x][4]== 1){
             if(condicionA==true){
                 AtaqueVida(anterior,x,nivel,aliado,tipo);
             }
         }else{
                 if(nivel[x][4]== 4){
                     if(nivel[x][6]== 5){
                         if(nivel[x][7]== 3){//pavoreal
                             if(nivelAnimal==1){
                                 while(contador4<=1){
                                     AtaqueVidaPorcentaje(pos,x,nivel,pos,aliado,tipo);
                                     contador4=contador4+1;
                                 }
                         }else{
                             if(nivelAnimal==2){
                                 while(contador4<=2){
                                     AtaqueVidaPorcentaje(pos,x,nivel,pos,aliado,tipo);
                                     contador4=contador4+1;
                                 }
                             }else{
                                 if(nivelAnimal==3){
                                    while(contador4<=3){
                                     AtaqueVidaPorcentaje(pos,x,nivel,pos,aliado,tipo );
                                     contador4=contador4+1;
                                 }
                                 }
                             }//pavoreal
                         
                         }}else{
                             if(nivel[x][7]== 0){//gorila
                                 if(nivelAnimal==1){
                                 while(contador4<=1){
                                     aliado[pos][5]=3;
                                     contador4=contador4+1;
                                 }
                         }else{
                             if(nivelAnimal==2){
                                 while(contador4<=2){
                                     aliado[pos][5]=3;
                                     contador4=contador4+1;
                                 }
                             }else{
                                 if(nivelAnimal==3){
                                    while(contador4<=3){
                                     aliado[pos][5]=3;
                                     contador4=contador4+1;
                                 }
                                 }
                             }}
                             }//gorila
                         }
         }else{
                         if(nivel[x][6]== 1){//panda
          aliado[pos][2] = aliado[pos][2] + (oponente[EnemigoAtaco][2]*(nivel[x][vida])/100);
           System.out.format("%s le otorgo %d / %d a %s", aliado[x][0] ,nivel[x][ataque],nivel[x][vida], aliado[pos][0]);
         System.out.println("");
         }//panda
                     }
                         
         }else{
                     if(nivel[x][4]== 3&&pos!=4){//puma
                         if(nivelAnimal==1){
                             if(contador3==3){
                                 contador3=0;
                                 AnimalInvocado(pos+1,x,nivel,aliado,tipo);
                             }else{
                                 contador3=contador3+1;
                             }
                         }else{
                             if(nivelAnimal==2){
                                 if(contador3==2){
                                 contador3=0;
                                 AnimalInvocado(pos+1,x,nivel,aliado,tipo);
                             }else{
                                 contador3=contador3+1;
                             }
                             }else{
                                 if(nivelAnimal==3){
                                     if(contador3==1){
                                 contador3=0;
                                 AnimalInvocado(pos+1,x,nivel,aliado,tipo);
                             }else{
                                 contador3=contador3+1;
                             }
                                 }
                             }
                         }
                     }//puma
                 }
             }
         }
    }
        public static int posterior =0;
        public static int anterior = 0;
        public static int anterior1 = 0;
        public static int anterior2 = 0;
        public static int posterior1 = 0;
        public static int posterior2 = 0;
        public static int posicion = 0;
        public static int contadorP = 0;
        public static int contadorA = 0;
        public static int contadorPP = 0;
        public static boolean condicionA;
        public static boolean condicionA1= false;
        public static boolean condicionA2= false;
        public static boolean condicionP;
        public static boolean condicionP1= false;
        public static boolean condicionP2= false;
        public static int contadorE = 0;
        public static int contadorE2 = 0;
        public static int E1, E2, E3 =0;
        public static int enemigoU = 0;
        public static int enemigoA = 0;
        public static int enemigoDebil = 1000;
         public static int aliadoSaludable = 0;
    public static void alAzarSinRepetir(int nivelAnimal, int[][]oponente){
        int enemigo;
    Stack < Integer > Animales = new Stack < Integer > ();
    for (int y = 0; y < nivelAnimal ; y++) {
      enemigo = (int) Math.floor(Math.random() * 4);
      while (Animales.contains(enemigo)|| oponente[enemigo][0]==0) {
        enemigo = (int) Math.floor(Math.random() * 4 );
      }
      Animales.push(enemigo);
      if (y==0){
          E1 = enemigo;
      }else{
          if(y==1){
              E2 = enemigo;
          }else{
              if(y==2){
                  E3 = enemigo;
              }
          }
      }
    }
    }
    public static boolean caballo,ballena,buey,mosca,panda,conejo,serpiente,Jaguar=false;
    public static int posicionCanguro,posicionBuey =0;

    public static void AnteriorPosterior(int pos,int [][] aliado,int [][] oponente){
                   contador =0;
                   panda = false;
                   caballo = false;
                   ballena = false;
                   mosca = false;
                   conejo = false;
                   serpiente = false;
                   posicionCanguro =-1; 
                  Jaguar =false; 
                  for (y = 0; y < 5 ; y++) {
                      if(aliado[y][0]!=0){
                          contador = contador +1;  
                          if(aliado[y][2]>aliadoSaludable){
                                  aliadoSaludable= aliado[y][2];
                                 
                              }
                          if(aliado[y][0]==6){
                                  caballo =true;    
                              }
                          if(aliado[y][0]==43){
                                  panda =true;    
                              }
                          if(aliado[y][0]==23){
                                  conejo =true;    
                              }
                              if(aliado[y][0]==47){
                                  serpiente =true;    
                              }
                              if(aliado[y][0]==26){
                                  posicionCanguro =y;    
                              }
                              if(aliado[y][0]==33){
                                  ballena =true;    
                              }
                              if(aliado[y][0]==52){
                                  mosca =true;    
                              }
                              if(aliado[y][0]==25){
                                  buey =true;    
                                  posicionBuey=y;
                              }
                          if(aliado[y][0]==aliado[pos][0]){
                              if(contador ==1){
                                anterior = -1; 
                                contadorPP = 1;
                                contadorA = 0;
                              }else{
                                 anterior = posicion; 
                                 contadorPP = contador;
                                 contadorA = contador -1;
                              }   
                          }else{
                               posicion = y;
                               if(contador == contadorPP + 1){
                                   posterior = y;
                               }
                          }
                      }
                  }
                  contadorP =contador-contadorPP;
                  if(contadorA>=2){
                      for (y = 0; y < 5 ; y++) {
                      if(aliado[y][0]!=0){
                          contador = contador +1; 
                          if (contador==contadorA-1){
                              anterior1 =y;
                          }
                          if (contador==contadorA-2){
                              anterior2 =y;
                          }
                      }}
                  }
                  if(contadorP>=2){
                      for (y = 0; y < 5 ; y++) {
                      if(aliado[y][0]!=0){
                          contador = contador +1; 
                          if (contador==contadorPP+1){
                              posterior1 =y;
                          }
                          if (contador==contadorPP+2){
                              posterior2 =y;
                          }
                      }}
                  }
                  if(anterior!=-1){
                      condicionA =true;
                      if(contadorA>=2){
                          condicionA1 = true;
                      }else{
                          condicionA1 = false;
                      }
                          if(contadorA>=3){
                           condicionA2 = true;
                      }else{
                          condicionA2 = false;
                      }
                      
                          
                  }else{
                      condicionA =false;
                  }
                  if(contadorP>0){
                      condicionP =true;
                      if(contadorP>=2){
                          condicionP1 = true;
                      }else{
                          condicionP1 = false;
                      }
                          if(contadorP>=3){
                           condicionP2 = true;
                      }else{
                          condicionP2 = false;
                      }
                  }else{
                      condicionP =false;
                  }  
                  //enemigo
                  contadorE =0;
                  contadorE2 =0;
                  for (y = 0; y < 5 ; y++) {
                      if(oponente[y][0]!=0){
                          contadorE = contadorE +1;  
                          if(contadorE==1){
                              enemigoU=y;
                              if(oponente[y][2]<enemigoDebil){
                                  enemigoDebil= oponente[y][2];
                                 
                              }
                          }
                          if(oponente[y][0]==37){
                                  Jaguar =true;    
                              }
                      }
                  }
                  for (y = 0; y < 5 ; y++) {
                      if(oponente[y][0]!=0){
                          contadorE2 = contadorE2 + 1;
                          if(contadorE2 ==contadorE){
                              enemigoA = y;
                          }
                      }
                  }
    }
    public static void alComprarse(int [][] nivel,int x, int pos,int [][] aliado,int [][] oponente,int [][] aliadoB, String [][] tipo) {
        cantidades(pos,aliado,oponente);
       AnteriorPosterior(pos,aliado,oponente); 
         if(nivel[x][1]== 5){
              if(nivel[x][4]== 5){
             
         }else{
                if(nivel[x][4]== 1){
             if(nivel[x][5]== 8){//nutria
                 z = (int)(Math.random()*4); 
                          while(aliado[z][0]==0 || z ==pos){
                              z = (int)(Math.random()*4); 
                          }
                         AtaqueVidaPermanente(z,x,nivel,aliadoB,tipo);}//nutria
             else{
                 if(nivel[x][4]== 10&&BatallaGanada==false){//caracol
                     for (y = 0; y < 5 ; y++) {
                        if(aliado[y][0]!=0&&y!=pos){
                            AtaqueVidaPermanente(y,x,nivel,aliadoB,tipo);
                            }
                              }
                 }//caracol
             }
         }else{
                    if(nivel[x][4]== 4){//Sapo
                        if(contador>1){
                            aliado[pos][2] = aliadoSaludable;
                            System.out.format("%s copio la vida de %s", aliado[x][0] , aliado[pos][0]);
                            System.out.println("");
                            SalidaTexto[contadorTexto][0]=aliado[x][0] +" copio la vida de "+ aliado[pos][0];
                            contadorTexto = contadorTexto +1;
                        }
             
         }
                }  
              }
         }
    }
    public static void alVenderse(int [][] nivel,int x, int pos,int [][] aliado,int [][] oponente,int [][] aliadoB, String [][] tipo) {
        cantidades(pos,aliado,oponente);
       AnteriorPosterior(pos,aliado,oponente); 
         if(nivel[x][1]== 17){
             if(nivel[x][0]== 5){//castor
             if(contador>3){
                alAzarSinRepetir(2,aliado);  
                AtaqueVidaPermanente(E1,x,nivel,aliadoB,tipo);
                AtaqueVidaPermanente(E2,x,nivel,aliadoB,tipo);
             }else{
                    if(contador>2){
                        z = (int)(Math.random()*4); 
                    while(aliado[z][0]==0 || z ==pos){
                    z = (int)(Math.random()*4); 
                    }
                    AtaqueVidaPermanente(z,x,nivel,aliadoB,tipo);
             }//castor
          }
         }else{
                 if(nivel[x][0]== 27&&contador>2){//buho
                    z = (int)(Math.random()*4); 
                    while(aliado[z][0]==0 || z ==pos){
                    z = (int)(Math.random()*4); 
                    }
                    AtaqueVidaPermanente(z,x,nivel,aliadoB,tipo);
         }//buho
             }
                 
         }
    }
    public static void alFinalizarCompra(int [][] nivel,int x, int pos,int [][] aliado,int [][] oponente,int [][] aliadoB, String [][] tipo) {
        cantidades(pos,aliado,oponente);
       AnteriorPosterior(pos,aliado, oponente); 
         if(nivel[x][1]== 6){
             if(nivel[x][3]== 2){
             if(nivel[x][4]== 1){
                 if(nivel[x][6]== 5){//jirafa
                     if(nivelAnimal==1&&condicionP==true){
                       AtaqueVidaPermanente(posterior,x,nivel,aliadoB,tipo);
                                           }else{
                                               if(nivelAnimal==2){
                                                   if (condicionP1==true){
                                                       AtaqueVidaPermanente(posterior,x,nivel,aliadoB,tipo);
                                                       AtaqueVidaPermanente(posterior1,x,nivel,aliadoB,tipo);
                                                   }else{
                                                       if(condicionP==true){
                                                       AtaqueVidaPermanente(posterior,x,nivel,aliadoB,tipo);
                                                       }
                                                   }
                                               }else{
                                                   if(nivelAnimal==3){
                                                       if(condicionP2==true){
                                                       AtaqueVidaPermanente(posterior,x,nivel,aliadoB,tipo);
                                                       AtaqueVidaPermanente(posterior1,x,nivel,aliadoB,tipo);
                                                       AtaqueVidaPermanente(posterior2,x,nivel,aliadoB,tipo);
                                                       }else{
                                                           if (condicionP1==true){
                                                       AtaqueVidaPermanente(posterior,x,nivel,aliadoB,tipo);
                                                       AtaqueVidaPermanente(posterior1,x,nivel,aliadoB,tipo);
                                                   }else{
                                                       if(condicionP==true){
                                                       AtaqueVidaPermanente(posterior,x,nivel,aliadoB,tipo);
                                                       } }
                                                       }
                                                   }
                                               }
                                           }  //jirafa
                 }else{
                    if(nivel[x][6]== 1){//mono
                        if(condicionP == true){
                           AtaqueVidaPermanente(posterior,x,nivel,aliadoB,tipo); 
                        } } //mono
                 }
             }else{
                 if(nivel[x][4]== 4){//llama
                     if(contador<=4){
                         AtaqueVidaPermanente(pos,x,nivel,aliadoB,tipo); 
                     }
                 }//llama
             }
         }else{
                 if(nivel[x][3]== 4){//loro
             
         }//loro
             }
         }
    }
    //**************************primeraliadomuerto
    public static boolean PrimerMuerteAliado =true;
    public static int contadorMosca =0;
    public static void alMorirAliado(int [][] nivel,int x, int pos,int [][] aliado,int [][] oponente, String [][] tipo,int muertos) {
        cantidades(pos,aliado,oponente);
       AnteriorPosterior(pos,aliado,oponente); 
      
             if(ballena==true){//ballena
                 if(muertos==1){
                     //******************x del aliado muerto posicion del aliado muerto
                     AnimalInvocado(pos,x,nivel,aliado,tipo); 
                 }
             }
             //ballena
             else{
                 if(mosca==true){//mosca
                 if(condicionP==true){
                     if(contadorMosca <4){
                         //******************posterior del aliado muerto
                       aliado[pos][0] = 59;
                       AnimalInvocado(pos,58,nivel,aliado,tipo); 
                       contadorMosca=contadorMosca+1;
                     }
                 }
             }//mosca
                 else{
                     if(buey==true){//buey
                 AnimalInvocado(posicionBuey,24,nivel,aliado,tipo); 
             }//buey
                 }
             }
         }
    public static boolean habilidad8 = false;
     public static void antesDeAtacar(int [][] nivel,int x, int pos,int [][] aliado,int [][] oponente, String [][] tipo) {
        habilidad8=false;
         cantidades(pos,aliado,oponente);
       AnteriorPosterior(pos,aliado,oponente); 
       if(nivel[x][1]== 8){
           habilidad8=true;
            if(nivel[x][4]== 1){//elefante
                if(nivelAnimal==1){
                                    AtaqueVida(pos,x,nivel,aliado,tipo);
                                           }else{
                                               if(nivelAnimal==2){
                                                   if (condicionA==true&& condicionA1){
                                                     AtaqueVida(anterior,x,nivel,aliado,tipo);
                                                     AtaqueVida(anterior1,x,nivel,aliado,tipo);
                                                   }else{
                                                       if(condicionA==true){
                                                         AtaqueVida(anterior,x,nivel,aliado,tipo);  
                                                       }
                                                   }
                                               }else{
                                                   if(nivelAnimal==3){
                                                       if(condicionA==true && condicionA1==true && condicionA2==true){
                                                           AtaqueVida(anterior,x,nivel,aliado,tipo);
                                                           AtaqueVida(anterior2,x,nivel,aliado,tipo);
                                                           AtaqueVida(anterior1,x,nivel,aliado,tipo);
                                                       }else{
                                                           if (condicionA==true&& condicionA1){
                                                     AtaqueVida(anterior,x,nivel,aliado,tipo);
                                                     AtaqueVida(anterior1,x,nivel,aliado,tipo);
                                                   }else{
                                                       if(condicionA==true){
                                                         AtaqueVida(anterior,x,nivel,aliado,tipo);  
                                                       }
                                                   } } }  }
                                           }   
            }//elefante
            else{
                if(nivel[x][4]== 2){//pulpo
                if(nivelAnimal==3){
                     for (y = 0; y < 5 ; y++) {
                      if(oponente[y][0]!=0){
                         AtaqueVidaEnemigo(y,x,nivel,oponente,aliado,tipo);
                                    }//pulpo
                              }
                }
            }
            }
       }
     }
      public static void alComer(int [][] nivel,int x, int pos,int [][] aliado,int [][] oponente,int [][] aliadoB, String [][] tipo) {
        cantidades(pos,aliado,oponente);
       AnteriorPosterior(pos,aliado,oponente); 
       if(nivel[x][1]== 10){
           if(nivel[x][4]== 7){//escarabajo
           
       }//escarabajo
           else{
                if(nivel[x][4]== 1){//foca
           if(contadorE>1){
                alAzarSinRepetir(2,aliado);  
                AtaqueVidaPermanente(E1,x,nivel,aliadoB,tipo);
                AtaqueVidaPermanente(E2,x,nivel,aliadoB,tipo);
           }else{
                 if(contadorE>0){
                    alAzarSinRepetir(2-1,aliado);
                    AtaqueVidaPermanente(E1,x,nivel,aliadoB,tipo);
                                 }
           }
       }//foca
                else{
                     if(nivel[x][4]== 4){//gato
           
       }//gato
                }
           }
       }
       if(conejo==true){//conejo
           AtaqueVidaPermanente(pos,23,nivel,aliadoB,tipo);
       }//conejo
       
      }
      public static int contadorZorro=0;
      public static boolean habilidad12=false;
      public static void alAtacar(int [][] nivel,int x, int pos,int posE,int [][] aliado,int [][] oponente, String [][] tipo) {
        habilidad12=false;
        cantidades(pos,aliado,oponente);
       AnteriorPosterior(pos,aliado,oponente); 
       if(nivel[x][1]== 12){
           habilidad12=true;
           if(nivel[x][4]== 4){//zorro
               if(nivelAnimal==1){
                   if(contadorZorro==3){
                     oponente[posE][2] = oponente[pos][2] - aliado[pos][1];  
                     contadorZorro=0;
                   }else{
                       contadorZorro = contadorZorro +1;
                   }
               }else{
                   if(nivelAnimal==2){
                       if(contadorZorro==2){
                     oponente[posE][2] = oponente[pos][2] - aliado[pos][1];  
                     contadorZorro=0;
                   }else{
                       contadorZorro = contadorZorro +1;
                   }
                   }else{
                       if(nivelAnimal==3){
                           if(contadorZorro==1){
                     oponente[posE][2] = oponente[pos][2] - aliado[pos][1];  
                     contadorZorro=0;
                   }else{
                       contadorZorro = contadorZorro +1;
                   }
                       }
                   }//zorro
               }
          
           
       }else{
               if(nivel[x][4]== 2){//escorpion
           AtaqueVidaEnemigo(posE,x,nivel,oponente,aliado,tipo);
       }//escorpion
           }
       }
       if(serpiente==true){//serpiente
            z = (int)(Math.random()*4); 
        while(oponente[z][0]==0 ){
          z = (int)(Math.random()*4); }
          AtaqueVidaEnemigo(z,46,nivel,oponente,aliado,tipo);
       }//serpiente
       if(posicionCanguro!=-1){//canguro
           if(posicionCanguro!=pos){
               AtaqueVida(posicionCanguro,25,nivel,aliado,tipo);
           }
       }//canguro
       if(Jaguar ==true){//jaguar
               AtaqueVida(pos,36,nivel,aliado,tipo);
           
       }//jaguar
      }
   
       public static void alMatar(int [][] nivel,int x, int pos,int [][] aliado,int [][] oponente, String [][] tipo) {
        cantidades(pos,aliado,oponente);
       AnteriorPosterior(pos,aliado,oponente); 
       if(nivel[x][1]== 15){//hipopotamo
           //*****************Si muere enemigo
          if(nivel[x][4]== 4){
              AtaqueVida(pos,x,nivel,aliado,tipo);
          } else{
               if(nivel[x][4]== 2){
                   if(contadorE >0){
                     AtaqueVidaEnemigo(enemigoA,x,nivel,oponente,aliado,tipo);  
                   }
              
          }
          } 
       }//hipopotamo
      }
       public static void alInicarTurnoCompra(int [][] nivel,int x, int pos,int [][] aliado,int [][] oponente) {
        cantidades(pos,aliado,oponente);
       AnteriorPosterior(pos,aliado,oponente); 
       if(nivel[x][1]== 16){//
          
       }
      }
       public static void CopiarTexto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un path a escribir");
        String path = scanner.nextLine();
        File fileDestino = new File(path);
        Habilidades habilidad = new Habilidades();
        try {
            PrintWriter printer = new PrintWriter(fileDestino);
            for( y=  0; y < 200 ; y++){     
                
                printer.println(SalidaTexto[y][0]);
               
            }
        printer.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo que ingreso no existe.");
        }

    }
       public static void inicializarTexto(){
       
            for( y=  0; y < 200 ; y++){     
              SalidaTexto[y][0]="";
               
            }
       }
}
