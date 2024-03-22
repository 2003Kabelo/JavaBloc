public class App {
    public static void main(String[]args){

        Blockchain blockchain = new Blockchain();
        Miner miner = new Miner();

        Block block0 = new Block(0,"",Constants.GenesisPrevHash);
        miner.mine(block0,blockchain);
        Block block1 = new Block(1,"transaction1",blockchain.getBlockchain().get(blockchain.getSize()-1).getHash());
        miner.mine(block1,blockchain);
        Block block2 = new Block(2,"transaction2",blockchain.getBlockchain().get(blockchain.getSize()-1).getHash());
        miner.mine(block2,blockchain);

        System.out.println("\n" +"\nBlockchain:\n" + blockchain);
        System.out.println("Miner's reward : " + miner.getReward());

    }
}
