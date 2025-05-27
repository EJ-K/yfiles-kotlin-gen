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
import yfiles.geometry.IRectangle
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.styles.ILabelStyle
import yfiles.styles.INodeStyle

/**
 * A data container representing the collapsed state of a node.
 * @see [FoldingManager.getFolderNodeState]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FolderNodeState">Online Documentation</a>
 */
external  class FolderNodeState  : FoldingLabelOwnerState {

/**
 * Gets or sets the layout of the node.
 * @throws ArgumentError `value` contains one or more `NaN` values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FolderNodeState%23layout">Online Documentation</a>
 */
final var layout: IRectangle
/**
 * Gets the [FoldingPortState]s owned by this state.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FolderNodeState%23ports">Online Documentation</a>
 */
final val ports: IListEnumerable<FoldingPortState>
/**
 * Gets or sets the style of this node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FolderNodeState%23style">Online Documentation</a>
 */
final var style: INodeStyle
/**
 * Gets or sets the tag of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FolderNodeState%23tag">Online Documentation</a>
 */
final var tag: Tag?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FolderNodeState%23FolderNodeState-method-addLabel">Online Documentation</a>
 */
 final override   fun addLabel( text: String ,
 layoutParameter: ILabelModelParameter ,
 style: ILabelStyle ,
 preferredSize: Size ,
 tag: Tag? ):FoldingLabelState
/**
 * Returns an [INode] instance which represents this folder node state.
 * @return An [INode] instance which represents this folder node state.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FolderNodeState%23FolderNodeState-method-asNode">Online Documentation</a>
 */
 final   fun asNode():INode
/**
 * Provides access to the folding state of a master port.
 * @param [masterPort] The master port for which the state should be returned.
 * @return A state holder implementation of the `masterPort`, which reflects the port in the node's collapsed state.
 * @see [FoldingPortState.style]
 * @see [FoldingPortState.locationParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FolderNodeState%23FolderNodeState-method-getFoldingPortState">Online Documentation</a>
 */
 final   fun getFoldingPortState( masterPort: IPort ):FoldingPortState
/**
 * Removes the `label` from its owning [FoldingLabelOwnerState].
 * @param [label] The label to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FolderNodeState%23FolderNodeState-method-remove">Online Documentation</a>
 */
 final   fun remove( label: FoldingLabelState )

/**
 * Removes the `label` from its owning [FoldingLabelOwnerState].
 * @param [label] The label to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FolderNodeState%23FolderNodeState-method-remove">Online Documentation</a>
 */
@JsName("remove")
  final operator fun minusAssign( label: FoldingLabelState )

companion object : ClassMetadata<FolderNodeState> {
}
}
