// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IListEnumerable
import yfiles.lang.InterfaceMetadata

/**
 * The common interface for items in an [IGraph] that may own [ports][IPort].
 * @see [INode]
 * @see [IEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortOwner">Online Documentation</a>
 */
external interface IPortOwner : IModelItem {
/**
 * Gets a collection of [ports][IPort] that are owned by this instance.
 * @see [IPort.owner]
 * @see [IGraph.addPort]
 * @see [IGraph.remove]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortOwner%23ports">Online Documentation</a>
 */
val ports: IListEnumerable<IPort>

companion object : InterfaceMetadata<IPortOwner> {
}
}
