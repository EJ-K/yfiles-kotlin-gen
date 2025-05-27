// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs

/**
 * Event argument base class that is used by events that are triggered by [IInputMode] implementations
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [InputModeEventArgs] class.
 * @param [context] The context to initialize the [context] property with.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeEventArgs%23InputModeEventArgs-constructor-InputModeEventArgs">Online Documentation</a>
 * 
 * @property context
 * Gets the context for the current event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeEventArgs%23context">Online Documentation</a>
 */
external open class InputModeEventArgs  (
final val context: IInputModeContext) : EventArgs {

companion object : ClassMetadata<InputModeEventArgs> {
}
}
