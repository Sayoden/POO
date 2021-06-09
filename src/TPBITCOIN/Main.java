package TPBITCOIN;

public class Main {

    public static void main(String[] args) {
        String[] s = {"Walid a 1 million",
                "Gabriel a 0"};
        String[] s2 = {"Walid a 2 million",
                "Gabriel a 0"};
        String[] s3 = { "Lucas a 0",
                "Louis a 100"
        };
        String[] s4 = {"Walid a 2 million",
                "Gabriel a 0"};

        BlockChain blockChain = new BlockChain();
        blockChain.ajoutBlock(s);
        blockChain.ajoutBlock(s4);

        BlockChain blockChain2 = new BlockChain();
        blockChain2.ajoutBlock(s);
        blockChain2.ajoutBlock(s4);

        System.out.println(blockChain);
        System.out.println(blockChain2);
    }
}
