// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.collections.IList
import yfiles.layout.INodeType

/**
 * This class allows to detect different substructures within the input graph, for example, tree, star, chain and cycle structures.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Substructures">Online Documentation</a>
 */
external object Substructures {
/**
 * Returns a list of [Substructure]s that represent the chains in the specified graph with at least `minimumSize` nodes.
 * @receiver the input graph
 * @param [minimumSize] the minimum number of nodes of a chain (chains with less nodes are ignored)
 * @param [nodeType] the type of each node (nodes returning equal objects are considered to be of the same type). If none is provided, all nodes are considered to be of the same type
 * @param [edgeDirectedness] the directedness of each edge
 * @return a list of [Substructure]s that represent the chains
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Substructures%23Substructures-method-getChains">Online Documentation</a>
 */
 final   fun Graph.getChains( minimumSize: Double ,
 nodeType: IDataProvider<Node, INodeType>?  = definedExternally,
 edgeDirectedness: IDataProvider<Edge, EdgeDirectedness>?  = definedExternally):IList<out Any>
/**
 * Returns a list of [Substructure]s that represent the (undirected) cliques in the specified graph with at least `minimumSize` nodes.
 * @receiver the input graph
 * @param [minimumSize] the minimum size of a clique (cliques with less nodes are ignored)
 * @param [nodeType] the type of each node (nodes returning equal objects are considered to be of the same type). If none is provided, all nodes are considered to be of the same type
 * @return a list of [Substructure]s that represent the cliques
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Substructures%23Substructures-method-getCliques">Online Documentation</a>
 */
 final   fun Graph.getCliques( minimumSize: Double ,
 nodeType: IDataProvider<Node, INodeType>?  = definedExternally):IList<out Any>
/**
 * Returns a list of [Substructure]s that represent the cycles in the specified graph with at least `minimumSize` nodes.
 * @receiver the input graph
 * @param [minimumSize] the minimum number of nodes of a cycle (cycles with less nodes are ignored)
 * @param [nodeType] the type of each node (nodes returning equal objects are considered to be of the same type). If none is provided, all nodes are considered to be of the same type
 * @param [edgeDirectedness] the directedness of each edge
 * @return a list of [Substructure]s that represent the cycles
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Substructures%23Substructures-method-getCycles">Online Documentation</a>
 */
 final   fun Graph.getCycles( minimumSize: Double ,
 nodeType: IDataProvider<Node, INodeType>?  = definedExternally,
 edgeDirectedness: IDataProvider<Edge, EdgeDirectedness>?  = definedExternally):IList<out Any>
/**
 * Returns a list of [Substructure]s that represent the stars in the specified graph with at least `minimumSize` nodes.
 * @receiver the input graph
 * @param [minimumSize] the minimum number of degree one nodes of a star (stars with less nodes are ignored)
 * @param [nodeType] the type of each node (nodes returning equal objects are considered to be of the same type). If none is provided, all nodes are considered to be of the same type
 * @param [edgeDirectedness] the directedness of each edge
 * @return a list of [Substructure]s that represent the stars
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Substructures%23Substructures-method-getStars">Online Documentation</a>
 */
 final   fun Graph.getStars( minimumSize: Double ,
 nodeType: IDataProvider<Node, INodeType>?  = definedExternally,
 edgeDirectedness: IDataProvider<Edge, EdgeDirectedness>?  = definedExternally):IList<out Any>
/**
 * Returns a list of [Substructure]s that represent the trees in the specified graph with at least `minimumSize` nodes.
 * @receiver the input graph
 * @param [minimumSize] the minimum size of a tree (trees with less nodes are ignored)
 * @param [nodeType] the type of each node (nodes returning equal objects are considered to be of the same type). If none is provided, all nodes are considered to be of the same type
 * @param [edgeDirectedness] the directedness of each edge
 * @return a list of [Substructure]s that represent the subtrees
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Substructures%23Substructures-method-getTrees">Online Documentation</a>
 */
 final   fun Graph.getTrees( minimumSize: Double ,
 nodeType: IDataProvider<Node, INodeType>?  = definedExternally,
 edgeDirectedness: IDataProvider<Edge, EdgeDirectedness>?  = definedExternally):IList<out Any>
}
