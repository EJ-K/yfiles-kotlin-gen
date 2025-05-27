// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.ClassMetadata
import yfiles.styles.IPortStyle

/**
 * A data container representing the state of a port at a [FolderNodeState] or [FoldingEdgeState].
 * @see [FoldingEdgeState.sourcePort]
 * @see [FoldingEdgeState.targetPort]
 * @see [FolderNodeState.ports]
 * @see [FolderNodeState.getFoldingPortState]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingPortState">Online Documentation</a>
 */
external abstract class FoldingPortState  : FoldingLabelOwnerState {

/**
 * Gets or sets the [IPortLocationModelParameter] describing the position of this port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingPortState%23locationParameter">Online Documentation</a>
 */
open var locationParameter: IPortLocationModelParameter
/**
 * Gets or sets the style of this port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingPortState%23style">Online Documentation</a>
 */
open var style: IPortStyle
/**
 * Gets or sets the tag of the port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingPortState%23tag">Online Documentation</a>
 */
abstract var tag: Tag?
/**
 * Returns an [IPort] instance which represents this port state.
 * @return An [IPort] instance which represents this port state.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingPortState%23FoldingPortState-method-asPort">Online Documentation</a>
 */
 abstract   fun asPort():IPort

companion object : ClassMetadata<FoldingPortState> {
}
}
