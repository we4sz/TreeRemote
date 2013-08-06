import com.esotericsoftware.kryonet.Connection;

public interface ITreeRemote {

	public void connectedToTree();

	public void disconnectedFromTree();

	public void dataFromTree(String s);

	public void connectedToBohnify(Connection c);

	public void disconnectedFromBohnify();

	public void dataFromBohnify(String s);

}
