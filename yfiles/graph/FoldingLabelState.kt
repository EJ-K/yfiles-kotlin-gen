// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.styles.ILabelStyle

/**
 * A data container representing the state of a label at a [FolderNodeState] or [FoldingEdgeState].
 * @see [FoldingLabelOwnerState.labels]
 * @see [FoldingLabelOwnerState.addLabel]
 * @see [FoldingEdgeState.remove]
 * @see [FolderNodeState.remove]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingLabelState">Online Documentation</a>
 */
external  class FoldingLabelState  : YObject {

/**
 * Gets or sets the [ILabelModelParameter] used to describe the label's layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingLabelState%23layoutParameter">Online Documentation</a>
 */
final var layoutParameter: ILabelModelParameter
/**
 * Gets or sets the preferred size of the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingLabelState%23preferredSize">Online Documentation</a>
 */
final var preferredSize: Size
/**
 * Gets or sets the style of this label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingLabelState%23style">Online Documentation</a>
 */
final var style: ILabelStyle
/**
 * Gets or sets the tag of the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingLabelState%23tag">Online Documentation</a>
 */
final var tag: Tag?
/**
 * Gets or sets the label's text.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingLabelState%23text">Online Documentation</a>
 */
final var text: String
/**
 * Returns an [ILabel] instance which represents this label state.
 * @return An [ILabel] instance which represents this label state.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingLabelState%23FoldingLabelState-method-asLabel">Online Documentation</a>
 */
 final   fun asLabel():ILabel

companion object : ClassMetadata<FoldingLabelState> {
}
}
