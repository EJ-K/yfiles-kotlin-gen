// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.YFlags

/**
 * Enumeration for text decoration for use in [Font]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextDecoration">Online Documentation</a>
 */
external class TextDecoration 
    private constructor(): YFlags<TextDecoration> {
    companion object {
    /**
 * No text decoration.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextDecoration%23NONE">Online Documentation</a>
 */
val NONE: TextDecoration
/**
 * A line beneath the text.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextDecoration%23UNDERLINE">Online Documentation</a>
 */
val UNDERLINE: TextDecoration
/**
 * A line above the text.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextDecoration%23OVERLINE">Online Documentation</a>
 */
val OVERLINE: TextDecoration
/**
 * A line through the middle of the text.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextDecoration%23LINE_THROUGH">Online Documentation</a>
 */
val LINE_THROUGH: TextDecoration
/**
 * Blinking text.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextDecoration%23BLINK">Online Documentation</a>
 */
val BLINK: TextDecoration

    }
}
