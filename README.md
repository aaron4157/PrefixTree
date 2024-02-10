# PrefixTree
 Leet code 208 solution

## 觀念
前綴樹(prefix tree) 或稱搜尋樹(trie)、字典樹(dictionary tree)是一種儲存字串資料的形式，其搜尋算法的時間複雜度僅有O(n)十分效率。  
前綴樹的目的就是儲存字典。從1個空的根節點出發、從字首開始循序加入字母作為子節點，下一階的子節點數量可多達26個(以拉丁字母為例)。可知，搜尋樹是一種空間複雜度偏高的資料結構，可說是"以空間換取時間"的搜尋策略。  
後綴樹(suffix tree, suffix trie) 是前綴樹的變體，是從字尾開始編排資料的。  

前綴樹應用於推薦字詞功能，可以預測使用者的輸入意向。例如: ro -> rock


## Reference
[Program Creek 2014](https://www.programcreek.com/2014/05/leetcode-implement-trie-prefix-tree-java/)
