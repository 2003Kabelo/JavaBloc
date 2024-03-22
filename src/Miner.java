public class Miner {

    private double reward ;

    public void mine(Block block , Blockchain blockchain) {
        while(!isGoldenHash(block)) {
            block.incrementNoce();
            block.generateHash();
        }
        System.out.println(block + "Has just mined");
        System.out.println("The hash is" + block.getHash());
        blockchain.addBlock(block);
        reward += Constants.REWARDS ;
    }
    private boolean isGoldenHash(Block block) {

        String leadingZeros = new String(new char[Constants.difficulty]).replace('\0','0');
        return block.getHash().substring(0,Constants.difficulty).equals(leadingZeros);

    }
    public double getReward() {
        return this.reward;
    }
}
