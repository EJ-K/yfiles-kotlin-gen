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
import yfiles.graph.ILabelModelParameter
import yfiles.graph.ILabelOwner
import yfiles.lang.ClassMetadata
import yfiles.styles.ILabelStyle

/**
 * An [IEditLabelHelper] implementation which provides a number of methods which can be overridden to change the default behavior.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper">Online Documentation</a>
 */
external open class EditLabelHelper  : IEditLabelHelper {

/**
 * Gets or sets the graph instance to retrieve the default values from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23graph">Online Documentation</a>
 */
final var graph: IGraph?
/**
 * Determines the label model parameter to use for the label, depending on the `owner`.
 * @param [context] The input mode context.
 * @param [owner] The label's owner.
 * @return The layout parameter to use or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-getLabelParameter">Online Documentation</a>
 */
 open protected   fun getLabelParameter( context: IInputModeContext ,
 owner: ILabelOwner ):ILabelModelParameter?
/**
 * Determines the style to use for the label, depending on the `owner`.
 * @param [context] The input mode context.
 * @param [owner] The label's owner.
 * @return The style to use or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-getLabelStyle">Online Documentation</a>
 */
 open protected   fun getLabelStyle( context: IInputModeContext ,
 owner: ILabelOwner ):ILabelStyle?
/**
 * Gets the preferred size for the label.
 * @param [context] The input mode context.
 * @param [label] The label to get the preferred size from.
 * @return The size to use or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-getPreferredSize">Online Documentation</a>
 */
 open protected   fun getPreferredSize( context: IInputModeContext ,
 label: ILabel ):Size?
/**
 * Helper method that will be called for [ILabelOwner]s.
 * @param [event] The original event arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-onLabelAdding">Online Documentation</a>
 */
 override   fun onLabelAdding( event: LabelEditingEventArgs )
/**
 * Helper method that will be called for [ILabelOwner]s.
 * @param [event] The original event arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EditLabelHelper%23EditLabelHelper-method-onLabelEditing">Online Documentation</a>
 */
 override   fun onLabelEditing( event: LabelEditingEventArgs )

companion object : ClassMetadata<EditLabelHelper> {
}
}
