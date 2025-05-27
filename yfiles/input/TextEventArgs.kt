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

/**
 * Event arguments used by [TextEditorInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEventArgs">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @param [context] The context in which this text event happened.
 * @param [text] The text that was or will be edited.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEventArgs%23TextEventArgs-constructor-TextEventArgs">Online Documentation</a>
 * 
 * @property text
 * Gets the text that was or will be edited.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEventArgs%23text">Online Documentation</a>
 */
external open class TextEventArgs  (
 context: IInputModeContext ,
final val text: String) : InputModeEventArgs {

companion object : ClassMetadata<TextEventArgs> {
}
}
