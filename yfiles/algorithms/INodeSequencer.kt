// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This is a generic interface for classes that provide an ordering for the nodes of a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeSequencer">Online Documentation</a>
 */
external interface INodeSequencer : YObject {
/**
 * Returns a cursor that grants access to **all** nodes of the given graph in some order.
 * @param [graph] the input graph
 * @return a [INodeCursor] that grants access to all nodes of a graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeSequencer%23INodeSequencer-method-nodes">Online Documentation</a>
 */
   fun nodes( graph: Graph ):INodeCursor

companion object : InterfaceMetadata<INodeSequencer> {

/**
 * Creates an implementation of the interface [INodeSequencer] by using the given function as implementation for its [nodes] method.
 * @param [nodes] A function for [INodeSequencer]'s single abstract method [nodes].
 * @return An instance of the [INodeSequencer] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeSequencer%23INodeSequencer-method-create">Online Documentation</a>
 */
@JsName("create")
operator fun  invoke(
    nodes: (
graph: Graph
) -> INodeCursor 
):INodeSequencer
}
}
