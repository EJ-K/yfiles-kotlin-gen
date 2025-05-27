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
import yfiles.graph.ILabel
import yfiles.graph.ILabelModelParameter
import yfiles.graph.ILabelOwner
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata
import yfiles.styles.ILabelStyle

/**
 * Event arguments for the [GraphEditorInputMode.LabelAdding] and [GraphEditorInputMode.LabelEditing] events, as well as the [IEditLabelHelper] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelEditingEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [LabelEditingEventArgs] class with the given context, owner, and label.
 * @param [context] The input mode context to use.
 * @param [owner] The [ILabelOwner] whose label should be edited.
 * @param [label] The [ILabel] that should be edited.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelEditingEventArgs%23LabelEditingEventArgs-constructor-LabelEditingEventArgs">Online Documentation</a>
 * 
 * @property owner
 * Gets or sets the owner of the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelEditingEventArgs%23owner">Online Documentation</a>
 * 
 * @property label
 * Gets or sets the label to edit.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelEditingEventArgs%23label">Online Documentation</a>
 */
external  class LabelEditingEventArgs  (
 context: IInputModeContext ,
final var owner: ILabelOwner?,
final var label: ILabel?) : InputModeEventArgs {

/**
 * Gets or sets a value indicating whether the action (adding or editing a label) should be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelEditingEventArgs%23cancel">Online Documentation</a>
 */
final var cancel: Boolean
/**
 * Gets or sets a value indicating whether this event has been handled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelEditingEventArgs%23handled">Online Documentation</a>
 */
final var handled: Boolean
/**
 * Gets or sets the [ILabel.layoutParameter] of the label to add.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelEditingEventArgs%23layoutParameter">Online Documentation</a>
 */
final var layoutParameter: ILabelModelParameter?
/**
 * Gets or sets the [ILabel.preferredSize] of the label to add.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelEditingEventArgs%23preferredSize">Online Documentation</a>
 */
final var preferredSize: Size?
/**
 * Gets or sets the [ILabel.style] of the label to add.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelEditingEventArgs%23style">Online Documentation</a>
 */
final var style: ILabelStyle?
/**
 * Gets or sets the [ITagOwner.tag][yfiles.graph.ITagOwner.tag] of the label to add.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelEditingEventArgs%23tag">Online Documentation</a>
 */
final var tag: Tag?
/**
 * Gets or sets the configurator for the [TextEditorInputMode] for editing the provided label instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelEditingEventArgs%23textEditorInputModeConfigurator">Online Documentation</a>
 */
final var textEditorInputModeConfigurator: TextEditorInputModeConfigurationHandler?

companion object : ClassMetadata<LabelEditingEventArgs> {
}
}
