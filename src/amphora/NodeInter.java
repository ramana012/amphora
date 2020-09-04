package amphora;

import java.util.LinkedList;
import java.util.List;

public interface NodeInter {

	public List<Node> getChaild();
	public Node getParent();
	public void setParent(Node parent);
	
}
