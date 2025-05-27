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
 * @param [edge] The edge to assign to the [item][ItemEventArgs] property.
 * @param [sourcePort] The source port the edge was connected to before the event happened.
 * @param [targetPort] The target port the edge was connected to before the event happened.
 * @param [sourcePortOwner] The owner of the source port the edge was connected to before the event happened.
 * @param [targetPortOwner] The owner of the target port the edge was connected to before the event happened.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeEventArgs%23EdgeEventArgs-constructor-EdgeEventArgs">Online Documentation</a>
 * 
 * @property sourcePort
 * Gets the source port the edge was connected to before the event happened.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeEventArgs%23sourcePort">Online Documentation</a>
 * 
 * @property targetPort
 * Gets the target port the edge was connected to before the event happened.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeEventArgs%23targetPort">Online Documentation</a>
 * 
 * @property sourcePortOwner
 * Gets the owner of the source port the edge was connected to before the event happened.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeEventArgs%23sourcePortOwner">Online Documentation</a>
 * 
 * @property targetPortOwner
 * Gets the owner of the target port the edge was connected to before the event happened.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeEventArgs%23targetPortOwner">Online Documentation</a>
 */
external class EdgeEventArgs (
edge: IEdge,
final val sourcePort: IPort = definedExternally,
final val targetPort: IPort = definedExternally,
final val sourcePortOwner: IPortOwner = definedExternally,
final val targetPortOwner: IPortOwner = definedExternally) : ItemEventArgs<IEdge> {
  
  companion object : ClassMetadata<EdgeEventArgs> {
  }
}
