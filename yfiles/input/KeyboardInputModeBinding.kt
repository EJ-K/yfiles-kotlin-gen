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
import yfiles.lang.YObject

/**
 * A token returned by [KeyboardInputMode]'s factory methods that can be used to [remove] the binding again.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputModeBinding">Online Documentation</a>
 */
external  class KeyboardInputModeBinding 
private constructor () : YObject {

/**
 * Gets the [ICommand] that is associated with this binding.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputModeBinding%23command">Online Documentation</a>
 */
final val command: ICommand<*>
/**
 * Removes the binding represented by this instance from the [KeyboardInputMode] it has been created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputModeBinding%23KeyboardInputModeBinding-method-remove">Online Documentation</a>
 */
 final   fun remove()

companion object : ClassMetadata<KeyboardInputModeBinding> {
}
}
