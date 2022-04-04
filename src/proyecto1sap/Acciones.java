/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1sap;

/**
 *
 * @author solan
 */
public class Acciones {
     public static int xx =0;
    public static int aa =0;
    public static int posA =0;
    public static int posO =0;
    public static int x =0;
    public static int a =0;
    public static int contadorM =0;
    public static String enemigo,amigo ="";
    public static boolean finalizadoA,finalizadoE =false;
     public static int aliadosMuertos =0;
    public static int enemigosMuertos =0;
    public static void Atacar(int [][] aliado,int [][] oponente,int [][] nivel,int [][] aliadoB,int [][] oponenteB,String [][] tipo) {
   MenuRondas menu = new MenuRondas();
   Habilidades habilidad = new Habilidades();
         Animales animalNuevo = new Animales();
         habilidad.contadorMosca=0;
         aliadosMuertos =0;
         enemigosMuertos =0;
         mostrarRonda(tipo,nivel,aliado,oponente);
         habilidad.alIniciarBatalla(nivel,aliadoB,aliado,oponente,tipo);
       habilidad.alIniciarBatalla(nivel,oponenteB,oponente,aliado,tipo);
         while (finalizadoE ==false && finalizadoA==false) {
                AnimalesVivos(aliado,oponente,tipo,nivel,aliadoB,oponenteB);
                    if(finalizadoE ==true || finalizadoA==true){
                break;}
                mostrarRonda(tipo,nivel,aliado,oponente);
                habilidad.antesDeAtacar(nivel,aliado[posA][0]-1,posA,aliado,oponente,tipo);
                AnimalesVivos(aliado,oponente,tipo,nivel,aliadoB,oponenteB);
                     if(finalizadoE ==true || finalizadoA==true){
                            break;}
                    if(habilidad.habilidad8==true){
                        mostrarRonda(tipo,nivel,aliado,oponente);}
                    if(oponente[posO][5]== 7||oponente[posO][6]== 7||oponente[posO][7]== 7){
                        if(oponente[posO][2]==1){
                            oponente[posO][2]=oponente[posO][2]-aliado[posA][1];
                        }else{
                            oponente[posO][2]=oponente[posO][2]-aliado[posA][1]+2;
                                System.out.format("----->Efecto ajo ");
                habilidad.SalidaTexto[habilidad.contadorTexto][0]="----->Efecto ajo ";
                habilidad.contadorTexto = habilidad.contadorTexto +1;
                        }
                    }else{
                        oponente[posO][2]=oponente[posO][2]-aliado[posA][1];
                    }
                
                System.out.format("-----> %s le quito %d de vida a %s", amigo,aliado[posA][1], enemigo);
                System.out.println("");
                habilidad.SalidaTexto[habilidad.contadorTexto][0]="----->"+amigo+ "le quito " +aliado[posA][1]+" de vida a "+enemigo;
                habilidad.contadorTexto = habilidad.contadorTexto +1;
                if(oponente[posO][2]<=0){
                    enemigosMuertos=enemigosMuertos+1;
                    AnimalesVivos(aliado,oponente,tipo,nivel,aliadoB,oponenteB);
                    if(finalizadoE ==true || finalizadoA==true){
                            break;}
                    habilidad.alMatar(nivel,aliado[posA][0]-1,posA,aliado,oponente,tipo);
                }
              
                
                

                AnimalesVivos(aliado,oponente,tipo,nivel,aliadoB,oponenteB);
                 mostrarRonda(tipo,nivel,aliado,oponente);
                    if(finalizadoE ==true || finalizadoA==true){
                            break;}
                    
                habilidad.alAtacar(nivel,aliado[posA][0]-1,posA,posO,aliado,oponente,tipo);
                AnimalesVivos(aliado,oponente,tipo,nivel,aliadoB,oponenteB);
                        if(finalizadoE ==true || finalizadoA==true){
                            break;}     
                        if(habilidad.habilidad12==true){
                        mostrarRonda(tipo,nivel,aliado,oponente);}                  
                habilidad.alRecibirDaño(nivel,oponente[posO][0]-1,posO,oponente,aliado,tipo);//not sure
                if(oponente[posO][5]== 2||oponente[posO][6]== 2||oponente[posO][7]== 2){
                    oponente[posO][2]=oponente[posO][2]+aliado[posA][1]*(10/100);
                System.out.format("-----> Se regreso el 10% dal daño.");
                System.out.println("");
                habilidad.SalidaTexto[habilidad.contadorTexto][0]="-----> Se regreso el 10% dal daño.";
                habilidad.contadorTexto = habilidad.contadorTexto +1;
                 mostrarRonda(tipo,nivel,aliado,oponente);
                }
                if(oponente[posO][5]== 11||oponente[posO][6]== 11||oponente[posO][7]== 11){
                    if(posA!=0){
                        aliado[posA-1][2]=aliado[posA-1][2]-5;
                        
                System.out.format("-----> Efecto demoledor");
                System.out.println("");
                habilidad.SalidaTexto[habilidad.contadorTexto][0]="-----> Efecto demoledor";
                habilidad.contadorTexto = habilidad.contadorTexto +1;
                 AnimalesVivos(aliado,oponente,tipo,nivel,aliadoB,oponenteB);
                        if(finalizadoE ==true || finalizadoA==true){
                            break;}  
                    }
                }
                    
                
                AnimalesVivos(aliado,oponente,tipo,nivel,aliadoB,oponenteB);
                        if(finalizadoE ==true || finalizadoA==true){
                            break;}     
                        if(habilidad.habilidad4==true){
                        mostrarRonda(tipo,nivel,aliado,oponente);}
                habilidad.antesDeAtacar(nivel,oponente[posO][0]-1,posO,oponente,aliado,tipo);
                AnimalesVivos(aliado,oponente,tipo,nivel,aliadoB,oponenteB);
                        if(finalizadoE ==true || finalizadoA==true){
                            break;}
                        if(habilidad.habilidad8==true){
                        mostrarRonda(tipo,nivel,aliado,oponente);}
                        if(aliado[posA][5]== 7||aliado[posA][6]== 7||aliado[posA][7]== 7){
                        if(aliado[posA][2]==1){
                             aliado[posA][2]=aliado[posA][2]-oponente[posO][1];
                        }else{
                            aliado[posA][2]=aliado[posA][2]-oponente[posO][1]+2;
                              System.out.format("----->Efecto ajo ");
                habilidad.SalidaTexto[habilidad.contadorTexto][0]="----->Efecto ajo ";
                habilidad.contadorTexto = habilidad.contadorTexto +1;
                        }
                    }else{
                         aliado[posA][2]=aliado[posA][2]-oponente[posO][1];
                    }
             
                System.out.format("-----> %s  le quito %d de vida a %s", enemigo, oponente[posO][1],amigo);
                System.out.println("");  
                habilidad.SalidaTexto[habilidad.contadorTexto][0]="----->"+enemigo+ "le quito " +oponente[posO][1]+" de vida a "+amigo;
                habilidad.contadorTexto = habilidad.contadorTexto +1;
                if(aliado[posA][2]<=0){
                    aliadosMuertos=aliadosMuertos+1;
                    AnimalesVivos(aliado,oponente,tipo,nivel,aliadoB,oponenteB);
                    if(finalizadoE ==true || finalizadoA==true){
                            break;}
                    habilidad.alMatar(nivel,oponente[posO][0]-1,posO,oponente,aliado,tipo);
                }
                
                
                AnimalesVivos(aliado,oponente,tipo,nivel,aliadoB,oponenteB);
                        if(finalizadoE ==true || finalizadoA==true){
                            break;}
                habilidad.alAtacar(nivel,oponente[posO][0]-1,posO,posA,oponente,aliado,tipo);
                AnimalesVivos(aliado,oponente,tipo,nivel,aliadoB,oponenteB);
                        if(finalizadoE ==true || finalizadoA==true){
                            break;}     
                        if(habilidad.habilidad12==true){
                        mostrarRonda(tipo,nivel,aliado,oponente);}
                        
                habilidad.alRecibirDaño(nivel,aliado[posA][0]-1,posA,aliado,oponente,tipo);//not sure
                if(aliado[posA][5]== 2||aliado[posA][6]== 2||aliado[posA][7]== 2){
                    aliado[posA][2]=aliado[posA][2]+oponente[posO][1]*(10/100);
                System.out.format("-----> Se regreso el 10% dal daño.");
                System.out.println("");
                habilidad.SalidaTexto[habilidad.contadorTexto][0]="-----> Se regreso el 10% dal daño.";
                habilidad.contadorTexto = habilidad.contadorTexto +1;
                 mostrarRonda(tipo,nivel,aliado,oponente);
                }
                if(aliado[posA][5]== 11||aliado[posA][6]== 11||aliado[posA][7]== 11){
                    if(posO!=0){
                        oponente[posO-1][2]=oponente[posO-1][2]-5;
                        
                System.out.format("-----> Efecto demoledor");
                System.out.println("");
                habilidad.SalidaTexto[habilidad.contadorTexto][0]="-----> Efecto demoledor";
                habilidad.contadorTexto = habilidad.contadorTexto +1;
                 AnimalesVivos(aliado,oponente,tipo,nivel,aliadoB,oponenteB);
                        if(finalizadoE ==true || finalizadoA==true){
                            break;}  
                    }
                }
                 AnimalesVivos(aliado,oponente,tipo,nivel,aliadoB,oponenteB);
                        if(finalizadoE ==true || finalizadoA==true){
                            break;}     
                        if(habilidad.habilidad4==true){
                        mostrarRonda(tipo,nivel,aliado,oponente);}
             
       }
    }
    public static void mostrar(int tier, String tipo[][]){
         for (x = 0; x <= tier ; x++) {
             
                     System.out.println("Animal: "+ tipo[x][0]);
                 }
    }
   
    public static void AnimalesVivos(int [][] aliado,int [][] oponente,String [][] tipo,int [][] nivel,int [][] aliadoB,int [][] oponenteB){
          MenuRondas menu = new MenuRondas();
          Habilidades habilidad = new Habilidades();
                contadorM = 1;
                finalizadoA=false;
                finalizadoE=false;
                
        for( xx=  oponente.length -1; xx >= 0 ; xx--){

                if(oponente[xx][0]!=0){
                    if(oponente[xx][2]<=0){
                        contadorM = 2;
                        
                        //amorir
                         x =oponente[xx][0]-1;
                          System.out.println("Enemigo"+x);  
                        for(aa=  0;aa <= 5 ; aa++){
                            
                           oponente[xx][aa]=0; 
                        }
                        //******if 50 arriba
                       
                       habilidad.alMorir(nivel,x,xx,oponente,aliado,oponenteB,aliadoB,tipo);
                       if(oponente[xx][5]== 3||oponente[xx][6]== 3||oponente[xx][7]== 3){
                    oponente[xx][0] = 60;
                     habilidad.AnimalInvocado(xx,59,nivel,oponente,tipo);
                }
                       habilidad.alMorirAliado(nivel,x,xx,aliado,oponente,tipo,enemigosMuertos);
                     AnimalesVivos(aliado,oponente,tipo,nivel,aliadoB,oponenteB);
                     
                    }else{
                        if(contadorM ==2){
                           
                        }
                       posO =xx;
                    xx=-1; 
                    }
                    
                
            }
  
        }
        for( xx=  aliado.length-1 ; xx >= 0 ; xx--){
             if(aliado[xx][0]!=0){
                 if(aliado[xx][2]<=0){
                     x =aliado[xx][0]-1;
                      for(aa=  0;aa <= 5 ; aa++){
                           aliado[xx][aa]=0; 
                        }
                        //******if 50 arriba


                        habilidad.alMorir(nivel,x,xx,aliado,oponente,aliadoB,oponenteB,tipo);
                       if(aliado[xx][5]== 3||aliado[xx][6]== 3||aliado[xx][7]== 3){
                    aliado[xx][0] = 60;
                     habilidad.AnimalInvocado(xx,59,nivel,aliado,tipo);
                        habilidad.alMorirAliado(nivel,x,xx,aliado,oponente,tipo,aliadosMuertos);
                        AnimalesVivos(aliado,oponente,tipo,nivel,aliadoB,oponenteB);
                       }
                 }else{
                     posA = xx;
                    xx=-1;
                 }
                 
                }   }

        evaluar(aliado,oponente);
        if(cE>0){
           enemigo = tipo[oponente[posO][0]-1][0]; 
        }else{
            finalizadoE=true;
            habilidad.BatallaGanada=true;
        }
        if(cA>0){
           amigo = tipo[aliado[posA][0]-1][0]; 
        }else{
            finalizadoA=true;
            habilidad.BatallaGanada=false;
        }
        
    }
        
    public static void Mostrar(int [][] aliado,int [][] oponente){
        int b = 0;
        int c = 0;
        MenuRondas menu = new MenuRondas();
        //amigo
        for( b=  0; b<=menu.ronda.length -1 ; b++){
            for ( c= 0 ; c <= menu.ronda[0].length -1; c++){
                  System.out.print(menu.ronda[b][c]);  
            }
               System.out.println();  }
        for( b=  0; b<=aliado.length -1 ; b++){
            for ( c= 0 ; c <= aliado[0].length -1; c++){
                  System.out.print(aliado[b][c]);  
            }
               System.out.println();  }
        //enemigo
     for( b=  menu.rondaEnemigo.length -1; b >= 0 ; b--){
            for ( c= 0 ; c <= menu.rondaEnemigo[0].length -1; c++){
                  System.out.print(menu.rondaEnemigo[b][c]);  
            }
               System.out.println();  }
     for( b=  oponente.length -1; b >= 0 ; b--){
            for ( c= 0 ; c <= oponente[0].length -1; c++){
                  System.out.print(oponente[b][c]);  
            }
               System.out.println();  }
    }
     public static int cE = 0;
       public static  int cA = 0;
        public static void evaluar(int [][] aliado,int [][] oponente){
        int b = 0;
        int c = 0;
      cE =0;
      cA=0;
        //amigo
        for( b=  0; b<=aliado.length -1 ; b++){
                 if(aliado[b][0]!=0){
                     cA = cA+1;
                 }
               }
       
        //enemigo

     for( b=  oponente.length -1; b >= 0 ; b--){
                  if(oponente[b][0]!=0){
                     cE = cE+1;
            }
                }
    }
         public static void mostrarRonda(String [][] tipo, int [][] nivel, int [][] aliado, int [][] oponente) {
   int res =0;
   int b = 0;
        int c = 0;
        String cadena = "";
       for( b=  0; b <= aliado.length -1 ; b++){
            for ( c=  0; c <= 2; c++){
                if (aliado[b][0]==0){
                    c = 100;
                }else{
                    res = aliado[b][0]-1;
                    if(c==0){
                       System.out.print(tipo[res][c]);
                       System.out.print(" ");
                       cadena = cadena + tipo[res][c]+" ";
                    }else{
                        System.out.print(aliado[b][c]); 
                        System.out.print(" ");
                        cadena = cadena + aliado[b][c]+" ";
                    }
                   
                }      
            }          
        }
       System.out.print("    ");
       cadena = cadena + "    ";
        for( b=  oponente.length -1; b >= 0 ; b--){
            for ( c= 0 ; c <= 2; c++){
                if (oponente[b][0]==0){
                    c = 100;
                }else{
                    res = oponente[b][0]-1;
                    if(c==0){
                       System.out.print(tipo[res][c]);
                       System.out.print(" ");
                       cadena = cadena + tipo[res][c]+" ";
                    }else{
                        System.out.print(oponente[b][c]); 
                        System.out.print(" ");
                        cadena = cadena + oponente[b][c]+" ";
                    }
                   
                }      
            }          
        }
        System.out.println("");
        Habilidades habilidad = new Habilidades();
        habilidad.SalidaTexto[habilidad.contadorTexto][0]=cadena;
        habilidad.contadorTexto = habilidad.contadorTexto +1;
    }
         public static void mostrarATienda(int [][] aliado, int [][] oponente) {
        int res =0;
        int b = 0;
        int c = 0;
        int condicional = 0;
         
       for( b=  0; b <= aliado.length -1 ; b++){
    condicional = 1;
            for ( c=  0; c <= aliado[0].length -1; c++){

                  System.out.print(aliado[b][c]);  
            }
            if (condicional == 2){
                
            }else{
               System.out.println();  
            }
               
        }

         for( b=  oponente.length -1; b >= 0 ; b--){
    condicional = 1;
            for ( c= 0 ; c <= oponente[0].length -1; c++){

                  System.out.print(oponente[b][c]);  
            }
            if (condicional == 2){
                
            }else{
               System.out.println();  
            }
               
        }
    
         }
}
