// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents a substructure of a graph, like a tree, chain, star, clique or tree.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Substructure">Online Documentation</a>
 */
external  class Substructure 
private constructor () : YObject {

/**
 * Gets the edges that belong to this substructure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Substructure%23edges">Online Documentation</a>
 */
final val edges: EdgeList
/**
 * Gets the edges connecting a node in the substructure with one outside of it.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Substructure%23interEdges">Online Documentation</a>
 */
final val interEdges: EdgeList
/**
 * Gets the nodes that belong to this substructure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Substructure%23nodes">Online Documentation</a>
 */
final val nodes: NodeList

companion object : ClassMetadata<Substructure> {
}
}
