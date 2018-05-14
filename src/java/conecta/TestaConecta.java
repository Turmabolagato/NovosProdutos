/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conecta;


public class TestaConecta {
        public static void main(String[] args) {
        Conecta conecta = new Conecta();
        conecta.conectar();
        conecta.inserir("Well", 222);
        conecta.desconectar();
    }
}

