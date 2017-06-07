/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adn;

/**
 *
 * @author Usuario
 */
public class ADN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String uno ="TAATAA";
        String dos ="ATTATT";
        System.out.println(costeErroresADN(uno, dos)); 
    }

    
    private static int	costeErroresADN (String	uno,	String	dos){
        int resultado=0;
        for(int i=0;i<uno.length()-1;i++){
            if((uno.charAt(i) == 'T' && dos.charAt(i) == 'A') || (uno.charAt(i) == 'A' && dos.charAt(i) == 'T')){
                
            }else if((uno.charAt(i) == 'C' && dos.charAt(i) == 'G') || (uno.charAt(i) == 'G' && dos.charAt(i) == 'C')){
                
            }else if(uno.charAt(i)== '-' || dos.charAt(i)=='-'){
                resultado+=2;
            }else{
                resultado++;
            }
        }
        return resultado;
    }
}
