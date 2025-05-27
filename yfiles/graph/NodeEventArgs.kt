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
 * A specialized subclass of the [ItemEventArgs] class that is bound to the [INode] type and carries additional information about the parent node and the group node status.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeEventArgs">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @param [item] The node that has changed.
 * @param [parent] The parent the node had before this event.
 * @param [isGroupNode] Whether the node was a group node before this event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeEventArgs%23NodeEventArgs-constructor-NodeEventArgs">Online Documentation</a>
 * 
 * @property parent
 * Gets the parent of the [node][ItemEventArgs] before this event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeEventArgs%23parent">Online Documentation</a>
 * 
 * @property isGroupNode
 * Gets whether the [node][ItemEventArgs] was a group node before this event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeEventArgs%23isGroupNode">Online Documentation</a>
 */
external class NodeEventArgs (
item: INode,
final val parent: INode?,
final val isGroupNode: Boolean) : ItemEventArgs<INode> {
  
  companion object : ClassMetadata<NodeEventArgs> {
  }
}
