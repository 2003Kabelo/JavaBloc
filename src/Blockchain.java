import java.util.List;
import java.util.LinkedList;
public class Blockchain {

    private List<Block> blockchain ;

    public Blockchain() {
        this.blockchain = new LinkedList<>();
    }
    public void addBlock(Block block) {
        this.blockchain.add(block);
    }
    public List<Block> getBlockchain() {
        return this.blockchain ;
    }
    public int getSize() {
        return this.blockchain.size();
    }

    @Override
    public String toString() {
        String s = "";
        for(Block block : this.blockchain) {
            s += block.toString() + "\n";
        }
        return s ;

    }
}
