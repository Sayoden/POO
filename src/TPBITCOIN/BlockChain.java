package TPBITCOIN;

import java.util.ArrayList;
import java.util.Arrays;

public class BlockChain {

    private ArrayList<Block> bc;

    private int hashV;

    public BlockChain() {
        this.bc = new ArrayList<>();
        this.hashV = 0;
    }

    public void ajoutBlock(String[] s) {
        Block block = new Block(s, hashV);
        bc.add(block);
        this.hashV = block.getHashA();
    }

    @Override
    public String toString() {
        return "BlockChain{" +
                "bc=" + bc +
                ", hashV=" + hashV +
                '}';
    }
}
