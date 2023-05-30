/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author ClaudioDuran
 */
public class Blockchain {
        public Block[] chain;

    public Blockchain() {
        chain = new Block[1];
        chain[0] = new Block("Genesis Block", "0");
    }

    public Block getLatestBlock() {
        return chain[chain.length - 1];
    }

    public void addBlock(Block newBlock) {
        newBlock.previousHash = getLatestBlock().hash;
        newBlock.hash = newBlock.calculateHash();
        Block[] newChain = new Block[chain.length + 1];
        System.arraycopy(chain, 0, newChain, 0, chain.length);
        newChain[newChain.length - 1] = newBlock;
        chain = newChain;
    }
}
