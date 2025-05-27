// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.Node
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.layout.LayoutGraph

/**
 * A [IPortAssignment] places the ports of edges connecting to the same node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITreeLayoutPortAssignment">Online Documentation</a>
 */
@JsName("ITreeLayoutPortAssignment")
external interface IPortAssignment : YObject {
/**
 * Places the ports of edges connecting to the given node.
 * @param [graph] the graph
 * @param [node] the node whose adjacent edges' ports should be set
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITreeLayoutPortAssignment%23IPortAssignment-method-assignPorts">Online Documentation</a>
 */
   fun assignPorts( graph: LayoutGraph ,
 node: Node )

companion object : InterfaceMetadata<IPortAssignment> {
}
}
