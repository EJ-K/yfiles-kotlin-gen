// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Size
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.ILabelDefaults
import yfiles.graph.ILabelModelParameter
import yfiles.graph.ILabelOwner
import yfiles.lang.ClassMetadata
import yfiles.styles.ILabelStyle

/**
 * An [IEditLabelHelper] implementation which provides a number of methods that can be overridden to change the default behavior.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper">Online Documentation</a>
 */
open external class EditLabelHelper  : IEditLabelHelper {
  /**
   * Gets or sets the graph instance to retrieve the default values from.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23graph">Online Documentation</a>
   */
  final var graph: IGraph?
  
  /**
   * Handles adding the label upon [finish][EditLabelHelper].
   * @param [context] The valid input mode context for this action.
   * @param [event] A template to get all properties to create the label from. Note that the [preferredSize][ILabel] can be `null`. In this case it will be determined automatically.
   * @return The newly created label, or `null` if no graph is available.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-addLabel">Online Documentation</a>
   */
  protected open fun addLabel(
    context: IInputModeContext,
    event: LabelEditingEventArgs,
  ): ILabel?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-cancel">Online Documentation</a>
   */
  final override fun cancel(
    context: IInputModeContext,
    event: LabelEditingEventArgs,
  )
  
  /**
   * Invoked after the label editing gesture has successfully finished.
   * @param [context] The input mode context from the input mode which invoked that method.
   * @param [event] The [LabelEditingEventArgs] which provide the information for the label to be added or edited. In particular, the [owner][LabelEditingEventArgs] for newly added labels or the [label][LabelEditingEventArgs] to edit or remove, and the [text][LabelEditingEventArgs] to set
   * @param [action] Whether to [ADD][LabelEditingAction] a new label or [EDIT][LabelEditingAction] or [REMOVE][LabelEditingAction] an existing label.
   * @return The added, edited, or removed label if the action has been completed successfully. `null`, otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-finish">Online Documentation</a>
   */
  override fun finish(
    context: IInputModeContext,
    event: LabelEditingEventArgs,
    action: LabelEditingAction,
  ): ILabel?
  
  /**
   * Obtains the defaults for the label owner.
   * @param [context] The input mode context
   * @param [owner] The owner to get the label defaults for
   * @return The label defaults.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-getDefaults">Online Documentation</a>
   */
  protected open fun getDefaults(
    context: IInputModeContext,
    owner: ILabelOwner,
  ): ILabelDefaults?
  
  /**
   * Determines the label model parameter to use for the label, depending on the `owner`.
   * @param [context] The input mode context.
   * @param [owner] The label's owner.
   * @return The layout parameter to use or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-getLabelParameter">Online Documentation</a>
   */
  protected open fun getLabelParameter(
    context: IInputModeContext,
    owner: ILabelOwner,
  ): ILabelModelParameter?
  
  /**
   * Determines the style to use for the label, depending on the `owner`.
   * @param [context] The input mode context.
   * @param [owner] The label's owner.
   * @return The style to use or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-getLabelStyle">Online Documentation</a>
   */
  protected open fun getLabelStyle(
    context: IInputModeContext,
    owner: ILabelOwner,
  ): ILabelStyle?
  
  /**
   * Gets the preferred size for the label.
   * @param [context] The input mode context.
   * @param [label] The label to get the preferred size from.
   * @return The size to use or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-getPreferredSize">Online Documentation</a>
   */
  protected open fun getPreferredSize(
    context: IInputModeContext,
    label: ILabel,
  ): Size?
  
  /**
   * Invoked at the beginning of a label adding or label editing gesture.
   * @param [context] The input mode context from the input mode which invoked that method.
   * @param [event] A configuration object which supports customizing the label editing.
   * @param [action] Whether to [ADD][LabelEditingAction] a new label, [EDIT][LabelEditingAction] an existing label, or create a new label during [DROP][LabelEditingAction] or [PASTE][LabelEditingAction].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-initialize">Online Documentation</a>
   */
  override fun initialize(
    context: IInputModeContext,
    event: LabelEditingEventArgs,
    action: LabelEditingAction,
  )
  
  /**
   * Handles adding the label upon [finish][EditLabelHelper] after the drop action of a drag and drop operation.
   * @param [context] The valid input mode context for this action.
   * @param [event] Provides the [owner][LabelEditingEventArgs] to add the label to and the label properties (such as style) for the new label. If `event`' label properties are not set, the properties of `event`' [label][LabelEditingEventArgs] are used instead.
   * @return The newly created label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-labelDropped">Online Documentation</a>
   */
  protected open fun labelDropped(
    context: IInputModeContext,
    event: LabelEditingEventArgs,
  ): ILabel?
  
  /**
   * Will be called from [initialize][EditLabelHelper] to initialize the helper for [ADD][LabelEditingAction]ing labels.
   * @param [context] The input mode context.
   * @param [event] The original event arguments.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-onLabelAdding">Online Documentation</a>
   */
  protected open fun onLabelAdding(
    context: IInputModeContext,
    event: LabelEditingEventArgs,
  )
  
  /**
   * Invoked from [initialize][EditLabelHelper] to initialize the helper for adding labels after the [drop][LabelEditingAction] action of a drag and drop operation.
   * @param [context] The input mode context.
   * @param [event] The original event arguments.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-onLabelDropping">Online Documentation</a>
   */
  protected open fun onLabelDropping(
    context: IInputModeContext,
    event: LabelEditingEventArgs,
  )
  
  /**
   * Will be called from [initialize][EditLabelHelper] to initialize the helper for [EDIT][LabelEditingAction]ing labels.
   * @param [context] The input mode context.
   * @param [event] The original event arguments.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-onLabelEditing">Online Documentation</a>
   */
  protected open fun onLabelEditing(
    context: IInputModeContext,
    event: LabelEditingEventArgs,
  )
  
  /**
   * Invoked from [initialize][EditLabelHelper] to initialize the helper for adding labels during [paste][LabelEditingAction] from the [GraphClipboard][yfiles.graph.GraphClipboard].
   * @param [context] The input mode context.
   * @param [event] The original event arguments.
   * @param [newOwner] The owner the new label will be pasted on.
   * @param [originalLabel] The original of the new label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-onLabelPasting">Online Documentation</a>
   */
  protected open fun onLabelPasting(
    context: IInputModeContext,
    event: LabelEditingEventArgs,
    newOwner: ILabelOwner,
    originalLabel: ILabel,
  )
  
  /**
   * Handles removing the label upon [finish][EditLabelHelper].
   * @param [context] The [IInputModeContext].
   * @param [label] The label to remove.
   * @return Whether a label was removed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-removeLabel">Online Documentation</a>
   */
  protected open fun removeLabel(
    context: IInputModeContext,
    label: ILabel?,
  ): Boolean
  
  /**
   * Handles changing the label text upon [finish][EditLabelHelper].
   * @param [context] The [IInputModeContext].
   * @param [label] The label on which to set the text.
   * @param [text] The text to set on the label.
   * @return Whether a new label text was set.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-setLabelText">Online Documentation</a>
   */
  protected open fun setLabelText(
    context: IInputModeContext,
    label: ILabel?,
    text: String?,
  ): Boolean
  
  companion object : ClassMetadata<EditLabelHelper> {
  }
}
