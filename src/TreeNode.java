
import java.util.ArrayList;
import java.util.List;

public class TreeNode {

	private Character value;
	private List<TreeNode> children = new ArrayList<>();
	
	public TreeNode(Character value) {
		super();
		this.value = value;
	}
	
	/**
	 * @return the value
	 */
	public Character getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Character value) {
		this.value = value;
	}
	/**
	 * @return the children
	 */
	public TreeNode[] getChildren() {
		return children.toArray(new TreeNode[] {});
	}
	
	/**
	 * 尋找符合數值的子結點
	 * @param value 指定數值
	 * @return TreeNode; null 若是葉子結點 或 子結點無符合數值
	 */
	public TreeNode find(Character value) {
		TreeNode result = null;
		if(isLeaf()) return result;
		for(TreeNode child : children) {
			if(child.getValue() != null && child.getValue().equals(value)) {
				result = child;
				break;
			}
		}
		return result;
	}
	
	/**
	 * 加入子結點
	 * @param value 子結點的值 不可為空
	 * @return TreeNode; null 若數值為空
	 */
	public TreeNode add(Character value) {
		try {
			if(value == null) throw new Exception("Cannot add null value");
			TreeNode child = find(value);
			if(child == null) {
				child = new TreeNode(value);
				this.children.add(child);
			}
			return child;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 是否為葉子結點
	 * @return
	 */
	public boolean isLeaf() {
		return (this.children == null);
	}

}
