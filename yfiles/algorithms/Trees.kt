// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import js.array.ReadonlyArray

/**
 * This class provides diverse algorithms and services for tree-structured graphs or subgraphs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm">Online Documentation</a>
 */
@JsName("TreeAlgorithm")
external object Trees {
/**
 * Collects all nodes of the subtree starting with root.
 * @receiver the root of the subtree
 * @param [nodes] the list that is filled with the nodes of the subtree
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-collectSubtree">Online Documentation</a>
 */
 final   fun Node.collectSubtree( nodes: NodeList )
/**
 * Converts the given tree to a directed rooted tree with the given node as root element by reversing some edges.
 * ### Preconditions
 * - The given graph must be a [tree][GraphChecker.isTree].
 * - The given node must be part of the given graph.
 * @receiver the given tree
 * @param [root] the given root element
 * @return an [EdgeList] containing the reversed edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-directTree">Online Documentation</a>
 */
 final   fun Graph.directTree( root: Node  = definedExternally):EdgeList
/**
 * Returns the center node of an undirected tree.
 * ### Preconditions
 * - The graph must be [non-empty][Graph.empty].
 * - The given graph must be a [tree][GraphChecker.isTree].
 * @receiver the given undirected tree
 * @return the center node of the given undirected tree
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-getCenterRoot">Online Documentation</a>
 */
 final   fun Graph.getCenterRoot():Node
/**
 * Returns all leaf nodes of the given tree.
 * @receiver the given tree
 * @param [directedRootedTree] `true` if the algorithm should consider the tree as directed, `false` otherwise
 * @return a [NodeList] that contains all leaf nodes of the given tree
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-getLeafNodes">Online Documentation</a>
 */
 final   fun Graph.getLeafNodes( directedRootedTree: Boolean ):NodeList
/**
 * Returns the nearest common ancestor of a subset of nodes within a directed rooted tree.
 * ### Preconditions
 * - The given graph must be a [tree][GraphChecker.isTree].
 * @receiver the given directed rooted tree
 * @param [root] the root of the tree
 * @param [rootedDownward] `true` if the tree is directed from the root to the leaves, `false` otherwise
 * @param [nodes] the subset of nodes
 * @return the [nearest common ancestor][Node] of the given subset of nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-getNearestCommonAncestor">Online Documentation</a>
 */
 final   fun Graph.getNearestCommonAncestor( root: Node ,
 rootedDownward: Boolean ,
 nodes: NodeList ):Node?
/**
 * Returns a possible root for the given (undirected) tree.
 * ### Preconditions
 * - The given graph must be a [tree][GraphChecker.isTree], or there is exactly one node with `indegree == 0`, or there is exactly one node with `outdegree == 0`
 * - The graph must be [non-empty][Graph.empty].
 * @receiver the given tree
 * @return a possible root for the given tree
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-getRoot">Online Documentation</a>
 */
 final   fun Graph.getRoot():Node
/**
 * Returns the depths of each subtree of a rooted directed tree.
 * @receiver a rooted directed tree graph
 * @param [subtreeDepthMap] the [INodeMap] that will be filled during the execution with the depth of the subtree rooted at each node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-getSubTreeDepths">Online Documentation</a>
 */
 final   fun Graph.getSubTreeDepths( subtreeDepthMap: INodeMap<Int> )
/**
 * Returns the size (number of nodes) of each subtree of a rooted directed tree.
 * @receiver a rooted directed tree graph
 * @param [subtreeSizeMap] the [INodeMap] that will be filled during the execution with the size of the subtree rooted at each node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-getSubTreeSizes">Online Documentation</a>
 */
 final   fun Graph.getSubTreeSizes( subtreeSizeMap: INodeMap<Int> )
/**
 * Returns an array of [EdgeList] objects each containing edges that belong to a maximal directed subtree of the given graph.
 * @receiver the given graph
 * @param [treeNodes] an array of [NodeList]s previously calculated by [getTreeNodes]
 * @return an array of [EdgeList] objects each containing edges that belong to a maximal subtree
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-getTreeEdges">Online Documentation</a>
 */
 final   fun Graph.getTreeEdges( treeNodes: ReadonlyArray<NodeList>  = definedExternally):ReadonlyArray<EdgeList>
/**
 * Returns an array of [NodeList] objects each containing nodes that belong to a maximal directed subtree of the given graph.
 * @receiver the given graph
 * @return an array of [NodeList] objects each containing nodes that belong to a maximal directed subtree
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-getTreeNodes">Online Documentation</a>
 */
 final   fun Graph.getTreeNodes():ReadonlyArray<NodeList>
/**
 * Returns an array of [NodeList] objects each containing nodes that belong to a maximal undirected subtree of the given graph.
 * @receiver the given graph
 * @return an array of [NodeList] objects each containing nodes that belong to a maximal undirected subtree
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-getUndirectedTreeNodes">Online Documentation</a>
 */
 final   fun Graph.getUndirectedTreeNodes():ReadonlyArray<NodeList>
/**
 * Finds a node used by the greatest number of all (undirected) paths interconnecting all nodes with each other.
 * ### Preconditions
 * - The given graph must be a [tree][GraphChecker.isTree] (may be undirected).
 * - The graph must be [non-empty][Graph.empty].
 * @receiver the given tree
 * @param [intWeight] the [INodeMap] that holds the number of paths per node
 * @return a [Node] used by the greatest number of all undirected paths
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-getWeightedCenterNode">Online Documentation</a>
 */
 final   fun Graph.getWeightedCenterNode( intWeight: INodeMap<Int>  = definedExternally):Node
/**
 * Checks whether or not the given graph is a forest, that is, a graph whose connected components are directed rooted trees.
 * @receiver the given graph
 * @return `true` if the given graph is a forest, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-isForest(Graph)">Online Documentation</a>
 */
 final   fun Graph.isForest():Boolean
/**
 * Checks whether or not the given graph is a forest.
 * @receiver the given graph
 * @param [directedRootedTree] `true` if the algorithm should check for directed rooted trees, `false` otherwise
 * @return `true` if the given graph is a forest, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-isForest(Graph,boolean)">Online Documentation</a>
 */
 final   fun Graph.isForest( directedRootedTree: Boolean ):Boolean
/**
 * Checks whether or not the given graph is a directed rooted tree in which each node has a maximum of `n` children.
 * @receiver the given graph
 * @param [n] the allowed maximum of children
 * @return `true` if the given graph is a n-ary tree, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-isNaryTree">Online Documentation</a>
 */
 final   fun Graph.isNaryTree( n: Int ):Boolean
/**
 * Checks whether or not the given graph is a directed rooted tree.
 * @receiver the given graph
 * @return `true` if the given graph is a directed rooted tree, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-isRootedTree">Online Documentation</a>
 */
 final   fun Graph.isRootedTree():Boolean
/**
 * Checks whether or not the given graph is an undirected tree.
 * @receiver the given graph
 * @return `true` if the given graph is an undirected tree, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAlgorithm%23Trees-method-isTree">Online Documentation</a>
 */
 final   fun Graph.isTree():Boolean
}
