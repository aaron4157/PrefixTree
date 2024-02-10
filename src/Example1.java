
/**
 * 前綴樹
 * 以自訂的TreeNode物件實作
 * @author yuantechang
 *
 */
public class Example1 {
	
	TreeNode treeRoot = new TreeNode(null);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 trie = new Example1();
		
		trie.insert("repair");
		trie.insert("represent");
		trie.insert("repeat");
		
		System.out.println(trie.search("respect"));
		System.out.println(trie.searchPrefix("representative"));

	}

	/**
	 * 加入單字或前綴
	 * 儘量走訪分支，並加差異項為葉子結點
	 * 時間複雜度: O(m)
	 * 空間複雜度: O(m)
	 * @param word
	 * @return
	 */
	public boolean insert(String word) {
		TreeNode temp = treeRoot;
		boolean flag = false;
		
		for(int i = 0; i < word.length(); i++) {
			temp = temp.add(word.charAt(i));
			if(temp == null) {
				flag = false;
				break;
			} else {
				flag = true;
			}
		}
		
		return flag;
	}
	
	/**
	 * 完全匹配字串
	 * @param word
	 * @return
	 */
	public boolean search(String word) {
		TreeNode temp = treeRoot;
		boolean flag = false;
		for(int i = 0; i < word.length(); i++) {
			temp = temp.find(word.charAt(i));
			if(temp == null) {
				flag = false;
				break;
			} else {
				flag = true;
			}
		}
		return flag;
	}
	
	/**
	 * 匹配字串中的前綴
	 * 時間複雜度: O(n)
	 * @param word
	 * @return
	 */
	public String searchPrefix(String word) {
		TreeNode temp = treeRoot;
		StringBuilder prefix = new StringBuilder();		
		for(int i = 0; i < word.length(); i++) {
			temp = temp.find(word.charAt(i));
			if(temp == null) {
				break;
			} else {
				prefix.append(word.charAt(i));
			}
		}
		return prefix.toString();
	}
	
}
