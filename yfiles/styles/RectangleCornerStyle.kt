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
 * Provides constants for the corner visualization style of the [RectangleNodeStyle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleCornerStyle">Online Documentation</a>
 */
external sealed class RectangleCornerStyle: YEnum<RectangleCornerStyle> {
   companion object: EnumMetadata<RectangleCornerStyle> {
       /**
 * Rounded corner style.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleCornerStyle%23ROUND">Online Documentation</a>
 */
val ROUND: RectangleCornerStyle

/**
 * Diagonally cut corner style.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleCornerStyle%23CUT">Online Documentation</a>
 */
val CUT: RectangleCornerStyle
   }
}
