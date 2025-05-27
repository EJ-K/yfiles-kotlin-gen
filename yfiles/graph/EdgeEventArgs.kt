// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.ItemEventArgs
import yfiles.lang.ClassMetadata

/**
 * A specialized subclass of the [ItemEventArgs] class that is bound to the [IEdge] type and carries additional source and target port information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [EdgeEventArgs] class.
 * @param [edge] The edge to assign to the [ItemEventArgs.item] property.
 * @param [sourcePort] The source port the edge was connected to before the event happened.
 * @param [targetPort] The target port the edge was connected to before the event happened.
 * @param [sourcePortOwner] The owner of the source port the edge was connected to before the event happened.
 * @param [targetPortOwner] The owner of the target port the edge was connected to before the event happened.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeEventArgs%23EdgeEventArgs-constructor-EdgeEventArgs">Online Documentation</a>
 */
external  class EdgeEventArgs  ( edge: IEdge ,
 sourcePort: IPort?  = definedExternally,
 targetPort: IPort?  = definedExternally,
 sourcePortOwner: IPortOwner?  = definedExternally,
 targetPortOwner: IPortOwner?  = definedExternally) : ItemEventArgs<IEdge> {

/**
 * Gets the source port the edge was connected to before the event happened.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeEventArgs%23sourcePort">Online Documentation</a>
 */
final val sourcePort: IPort
/**
 * Gets the owner of the source port the edge was connected to before the event happened.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeEventArgs%23sourcePortOwner">Online Documentation</a>
 */
final val sourcePortOwner: IPortOwner
/**
 * Gets the target port the edge was connected to before the event happened.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeEventArgs%23targetPort">Online Documentation</a>
 */
final val targetPort: IPort
/**
 * Gets the owner of the target port the edge was connected to before the event happened.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeEventArgs%23targetPortOwner">Online Documentation</a>
 */
final val targetPortOwner: IPortOwner

companion object : ClassMetadata<EdgeEventArgs> {
}
}
