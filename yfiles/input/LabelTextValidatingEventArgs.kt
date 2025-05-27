// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import js.promise.Promise
import js.promise.PromiseResult
import yfiles.graph.ILabel
import yfiles.lang.ClassMetadata

/**
 * Event arguments for label text validation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelTextValidatingEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [LabelTextValidatingEventArgs] class.
 * @param [context] The context.
 * @param [label] The label.
 * @param [newText] The initial new text as entered by the user.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelTextValidatingEventArgs%23LabelTextValidatingEventArgs-constructor-LabelTextValidatingEventArgs">Online Documentation</a>
 * 
 * @property label
 * Gets the label that is being edited.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelTextValidatingEventArgs%23label">Online Documentation</a>
 * 
 * @property newText
 * Gets the new text to use for the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelTextValidatingEventArgs%23newText">Online Documentation</a>
 */
external class LabelTextValidatingEventArgs (
context: IInputModeContext,
final val label: ILabel,
final val newText: String) : InputModeEventArgs {
  /**
   * Gets or sets the validated text, or a [Promise] resolving with the new text to use for the label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelTextValidatingEventArgs%23validatedText">Online Documentation</a>
   */
  final var validatedText: PromiseResult<String?> /* Promise<string | null> | string */?
  
  companion object : ClassMetadata<LabelTextValidatingEventArgs> {
  }
}
