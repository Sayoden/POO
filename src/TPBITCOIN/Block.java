package TPBITCOIN;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public class Block {

    private int hashP;

    private int hashA;

    private String[] transactions;

    public Block(String[] transactions, int hashP) {
        this.transactions = transactions;
        this.hashP = hashP;

        this.hashA = Arrays.hashCode(new int[] {
                Arrays.hashCode(transactions),
                this.hashP
        });
    }

    @Override
    public String toString() {
        return "Block{" +
                "hashP=" + hashP +
                ", hashA=" + hashA +
                ", transactions=" + Arrays.toString(transactions) +
                '}';
    }
}
