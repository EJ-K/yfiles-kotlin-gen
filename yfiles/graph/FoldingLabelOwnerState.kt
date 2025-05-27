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
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.styles.ILabelStyle

/**
 * An abstract base class for data containers representing the state of model items which can own labels.
 * @see [FolderNodeState]
 * @see [FoldingEdgeState]
 * @see [FoldingLabelState]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingLabelOwnerState">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingLabelOwnerState%23FoldingLabelOwnerState-constructor-FoldingLabelOwnerState">Online Documentation</a>
 */
abstract external class FoldingLabelOwnerState ()  {
  /**
   * Gets the [FoldingLabelState]s owned by this state.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingLabelOwnerState%23labels">Online Documentation</a>
   */
  open val labels: IListEnumerable<FoldingLabelState>
  
  /**
   * Adds a [FoldingLabelState] to this state.
   * @param [text] The text of the new label.
   * @param [layoutParameter] The layout parameter of the new label.
   * @param [style] The style of the new label.
   * @param [preferredSize] The preferred size of the label.
   * @param [tag] The tag of the label.
   * @return The newly added [FoldingLabelState].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingLabelOwnerState%23FoldingLabelOwnerState-method-addLabel">Online Documentation</a>
   */
  abstract fun addLabel(
    text: String,
    layoutParameter: ILabelModelParameter  = definedExternally,
    style: ILabelStyle  = definedExternally,
    preferredSize: Size  = definedExternally,
    tag: Tag?  = definedExternally,
  ): FoldingLabelState
  
  /**
   * Removes all [labels][FoldingLabelOwnerState].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingLabelOwnerState%23FoldingLabelOwnerState-method-clearLabels">Online Documentation</a>
   */
  open fun clearLabels()
  
  /**
   * Removes the `label` from its owning [FoldingLabelOwnerState].
   * @param [label] The label to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingLabelOwnerState%23FoldingLabelOwnerState-method-removeLabel">Online Documentation</a>
   */
  abstract fun removeLabel(
    label: FoldingLabelState,
  )
  
  companion object : ClassMetadata<FoldingLabelOwnerState> {
  }
}
