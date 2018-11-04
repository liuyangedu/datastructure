package cn.edu.bupt.sdmda.main;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import cn.edu.bupt.sdmda.main.Symbol;

import cn.edu.bupt.sdmda.ds.tree.BiTree;
import cn.edu.bupt.sdmda.ds.tree.BiTreeNode;

public class HuffmanTree {

  // root of this tree
	BiTree<Symbol> _tree;

  // data contains the symbol and its corresponding probability
	public HuffmanTree(List<Symbol> data){
		// a map from Symbol to BiTreeNode, to store non-leaf node
		HashMap<Symbol, BiTreeNode<Symbol>> s2n = new HashMap<>();
    // 1. select and remove two symbols from data
    // (denoting A and B, assuming P(A)<P(B))
    // whose probability are smaller than others,
    // 2. construct a tree, whose root is a null symbol
    // with P(root)=P(A)+P(B), A is the left child, B is the right one
    // add this root to data.
    // repeat 1 and 2 until data contains only one element
    // that is the root of this huffman tree

    // NOTE: variable s2n is used to store non-leaf BiTreeNode
    // so if you find a node has a null symbol(non-leaf)
    // please get the node from s2n but not construct is from symbol
		while(data.size()>1){

				// if data in symbol is not null, means it is leaf node
				// so construct it from symbol

				// if data in symbol is null, means it is non-leaf node
				// so get this node from the HashMap

		}
	}

  // output the encoding of each symbol
	public String getSymbolTable(){
		return _getSymbolTable(_tree.getRoot(), "");
	}

  // output the encoding of each symbol in node with a prefix
	private String _getSymbolTable(BiTreeNode<Symbol> node, String prefix){
		StringBuilder builder = new StringBuilder();
		if(node.getLeft()!=null)
      builder.append(_getSymbolTable(node.getLeft(), prefix+"0"));
		if(node.isLeaf())
      builder.append(node.getData().getSymbol()+":"+ prefix+"\n");
		if(node.getRight()!=null)
      builder.append(_getSymbolTable(node.getRight(), prefix+"1"));
		return builder.toString();
	}

}
