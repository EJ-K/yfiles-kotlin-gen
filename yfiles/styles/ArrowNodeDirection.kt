// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Provides constants for directions that can be used by styles.
 * @see [ArrowNodeStyle.direction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeDirection">Online Documentation</a>
 */
external sealed class ArrowNodeDirection: YEnum<ArrowNodeDirection> {
   companion object: EnumMetadata<ArrowNodeDirection> {
       /**
 * Pointing to the left.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeDirection%23LEFT">Online Documentation</a>
 */
val LEFT: ArrowNodeDirection

/**
 * Pointing up.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeDirection%23UP">Online Documentation</a>
 */
val UP: ArrowNodeDirection

/**
 * Pointing to the right.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeDirection%23RIGHT">Online Documentation</a>
 */
val RIGHT: ArrowNodeDirection

/**
 * Pointing down.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeDirection%23DOWN">Online Documentation</a>
 */
val DOWN: ArrowNodeDirection
   }
}
