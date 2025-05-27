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
 * A single biconnected component, composed of the [nodes] and [edges] which belong to this component and its [articulation points][articulationNodes].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponent">Online Documentation</a>
 */
external  class BiconnectedComponent 
private constructor () : YObject {

/**
 * Gets a collection of all articulation points which belong to this component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponent%23articulationNodes">Online Documentation</a>
 */
final val articulationNodes: ResultItemCollection<INode>
/**
 * Gets a collection of all edges which belong to this component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponent%23edges">Online Documentation</a>
 */
final val edges: ResultItemCollection<IEdge>
/**
 * Gets a collection of all nodes which belong to this component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponent%23nodes">Online Documentation</a>
 */
final val nodes: ResultItemCollection<INode>

companion object : ClassMetadata<BiconnectedComponent> {
}
}
