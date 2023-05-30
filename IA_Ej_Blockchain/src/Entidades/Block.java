/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 *
 * @author ClaudioDuran
 */
public final class Block {
        public String data;
    public String previousHash;
    public long timeStamp;
    public String hash;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = this.calculateHash();
    }

    public String calculateHash() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update((data + previousHash + Long.toString(timeStamp)).getBytes());
            return new String(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }
}
