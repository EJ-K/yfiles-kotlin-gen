// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Helper interface to customize interactive label editing.
 * @see [EditLabelHelper]
 * @see [GraphEditorInputMode.createLabel]
 * @see [GraphEditorInputMode.editLabel]
 * @see [GraphEditorInputMode.addLabel]
 * @see [GraphEditorInputMode.addLabelAddingListener]
 * @see [GraphEditorInputMode.addLabelEditingListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEditLabelHelper">Online Documentation</a>
 */
external interface IEditLabelHelper : YObject {
/**
 * Helper method that will be called when trying to add a label to an [ILabelOwner][yfiles.graph.ILabelOwner].
 * @param [event] The original event arguments.
 * @see [onLabelEditing]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEditLabelHelper%23IEditLabelHelper-method-onLabelAdding">Online Documentation</a>
 */
   fun onLabelAdding( event: LabelEditingEventArgs )
/**
 * Helper method that will be called when trying to edit a label.
 * @param [event] The original event arguments.
 * @see [onLabelAdding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEditLabelHelper%23IEditLabelHelper-method-onLabelEditing">Online Documentation</a>
 */
   fun onLabelEditing( event: LabelEditingEventArgs )

companion object : InterfaceMetadata<IEditLabelHelper> {
}
}
