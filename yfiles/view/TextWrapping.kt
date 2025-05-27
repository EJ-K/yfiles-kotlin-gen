// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Specifies how text is trimmed when it overflows its desired box.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping">Online Documentation</a>
 */
external sealed class TextWrapping: YEnum<TextWrapping> {
   companion object: EnumMetadata<TextWrapping> {
       /**
 * The text should neither be wrapped nor trimmed when it overflows its container.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping%23NONE">Online Documentation</a>
 */
val NONE: TextWrapping

/**
 * The text is wrapped character-wise when it overflows its container and if the wrapped text is bigger than the available container, then it is trimmed character by character to fit the container.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping%23CHARACTER">Online Documentation</a>
 */
val CHARACTER: TextWrapping

/**
 * The text is wrapped character-wise when it overflows its container and if the wrapped text is bigger than the available container, then it is trimmed character by character to fit the container and an ellipsis is added to indicate trimmed text.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping%23CHARACTER_ELLIPSIS">Online Documentation</a>
 */
val CHARACTER_ELLIPSIS: TextWrapping

/**
 * The text is wrapped at word boundaries when it overflows its container and if the wrapped text is bigger than the available container, then it is trimmed at word boundaries to fit the container.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping%23WORD">Online Documentation</a>
 */
val WORD: TextWrapping

/**
 * The text is wrapped at word boundaries when it overflows its container and if the wrapped text is bigger than the available container, then it is trimmed character by character to fit the container and an ellipsis is added to indicate trimmed text.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrapping%23WORD_ELLIPSIS">Online Documentation</a>
 */
val WORD_ELLIPSIS: TextWrapping
   }
}
