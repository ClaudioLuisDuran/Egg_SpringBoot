/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Block;
import Entidades.Blockchain;

/**
 *
 * @author ClaudioDuran
 */
public class BlockMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Blockchain blockchain = new Blockchain();
        for (int i = 0; i < 100; i++) {
            blockchain.addBlock(new Block("Block "+i+" Data", "0"));
        }
//        
//        blockchain.addBlock(new Block("Block 2 Data", "0"));
//        blockchain.addBlock(new Block("Block 3 Data", "0"));

        for (Block block : blockchain.chain) {
            System.out.println("Data: " + block.data);
            System.out.println("Timestamp: " + block.timeStamp);
            System.out.println("Previous Hash: " + block.previousHash);
            System.out.println("Hash: " + block.hash);
            System.out.println();
        }
    }
    }
    

