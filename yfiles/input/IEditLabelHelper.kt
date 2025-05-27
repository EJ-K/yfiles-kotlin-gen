// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.graph.ILabel
import yfiles.lang.InterfaceMetadata

/**
 * Helper interface to handle interactive label editing.
 * @see [EditLabelHelper]
 * @see [GraphEditorInputMode.startLabelEditing]
 * @see [GraphEditorInputMode.startLabelAddition]
 * @see [EditLabelInputMode.query-label-adding]
 * @see [EditLabelInputMode.query-label-editing]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEditLabelHelper">Online Documentation</a>
 */
external interface IEditLabelHelper  {
  /**
   * Invoked if the label editing action has been canceled.
   * @param [context] The current input mode context.
   * @param [event] Additional information about the label or label owner and whether the editing operation has been canceled programmatically.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEditLabelHelper%23IEditLabelHelper-method-cancel">Online Documentation</a>
   */
  fun cancel(
    context: IInputModeContext,
    event: LabelEditingEventArgs,
  )
  
  /**
   * Invoked after the label editing gesture has successfully finished.
   * @param [context] The input mode context from the input mode which invoked that method.
   * @param [event] The [LabelEditingEventArgs] which provide the information for the label to be added or edited. In particular, `event` provides the [owner][LabelEditingEventArgs] for newly added labels or the [label][LabelEditingEventArgs] to edit or remove, and the [text][LabelEditingEventArgs] to set when adding or editing labels.
   * @param [action] Whether to [ADD][LabelEditingAction] a new label or [EDIT][LabelEditingAction] or [REMOVE][LabelEditingAction] an existing label.
   * @return The added, edited, or removed label if the action has been completed successfully and `null` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEditLabelHelper%23IEditLabelHelper-method-finish">Online Documentation</a>
   */
  fun finish(
    context: IInputModeContext,
    event: LabelEditingEventArgs,
    action: LabelEditingAction,
  ): ILabel?
  
  /**
   * Invoked at the beginning of a label adding or label editing gesture.
   * @param [context] The input mode context from the input mode which invoked that method.
   * @param [event] A configuration object which supports customizing the label editing.
   * @param [action] Whether to [ADD][LabelEditingAction] a new label, [EDIT][LabelEditingAction] an existing label, or create a new label during [DROP][LabelEditingAction] or [PASTE][LabelEditingAction].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEditLabelHelper%23IEditLabelHelper-method-initialize">Online Documentation</a>
   */
  fun initialize(
    context: IInputModeContext,
    event: LabelEditingEventArgs,
    action: LabelEditingAction,
  )

  
  companion object : InterfaceMetadata<IEditLabelHelper> {
  }
}
