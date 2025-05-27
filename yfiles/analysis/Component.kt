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
 * A single connected or strongly connected component, composed of the [nodes] and [inducedEdges] which belong to this component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Component">Online Documentation</a>
 */
external  class Component 
private constructor () : YObject {

/**
 * Gets a collection of edges belonging to this component which are induced by the component's [nodes].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Component%23inducedEdges">Online Documentation</a>
 */
final val inducedEdges: ResultItemCollection<IEdge>
/**
 * Gets a collection of nodes belonging to this component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Component%23nodes">Online Documentation</a>
 */
final val nodes: ResultItemCollection<INode>

companion object : ClassMetadata<Component> {
}
}
