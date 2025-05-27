// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents a substructure of a graph, like a tree, chain, star, or clique.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubstructureItems">Online Documentation</a>
 */
external open class SubstructureItems  : YObject {

/**
 * Gets the edges that belong to this substructure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubstructureItems%23edges">Online Documentation</a>
 */
final val edges: ResultItemCollection<IEdge>
/**
 * Gets the edges connecting a node in the substructure with one outside of it.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubstructureItems%23interEdges">Online Documentation</a>
 */
final val interEdges: ResultItemCollection<IEdge>
/**
 * Gets the nodes that belong to this substructure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubstructureItems%23nodes">Online Documentation</a>
 */
final val nodes: ResultItemCollection<INode>

companion object : ClassMetadata<SubstructureItems> {
}
}
