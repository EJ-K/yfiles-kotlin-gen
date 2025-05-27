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
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents edges that are part of at least one directed or undirected simple cycle as computed by [CycleEdges].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleEdgesResult">Online Documentation</a>
 */
external  class CycleEdgesResult 
private constructor () : YObject {

/**
 * Gets a collection of all edges that are part of a cycle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleEdgesResult%23edges">Online Documentation</a>
 */
final val edges: ResultItemCollection<IEdge>

companion object : ClassMetadata<CycleEdgesResult> {
}
}
