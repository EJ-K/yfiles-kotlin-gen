// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Row alignment specifier which defines that each row will be aligned with its center.
 * @see [LayoutGraphUtilities.arrangeRectangleMultiRows]
 * @see [LayoutGraphUtilities.arrangeRectangleRows]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowAlignment">Online Documentation</a>
 */
external sealed class RowAlignment: YEnum<RowAlignment> {
   companion object: EnumMetadata<RowAlignment> {
       /**
 * Row alignment specifier which defines that each row will be aligned with its left border.
 * 
 * Value - `1`
 * @see [LayoutGraphUtilities.arrangeRectangleRows]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowAlignment%23LEADING">Online Documentation</a>
 */
val LEADING: RowAlignment

/**
 * Row alignment specifier which defines that each row will be aligned with its right border.
 * 
 * Value - `2`
 * @see [LayoutGraphUtilities.arrangeRectangleRows]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowAlignment%23TRAILING">Online Documentation</a>
 */
val TRAILING: RowAlignment

/**
 * Row alignment specifier which defines that each row will be aligned with its left border and its right border.
 * 
 * Value - `3`
 * @see [LayoutGraphUtilities.arrangeRectangleRows]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowAlignment%23JUSTIFIED">Online Documentation</a>
 */
val JUSTIFIED: RowAlignment

/**
 * Row alignment specifier which defines that each row will be aligned with its center.
 * 
 * Value - `4`
 * @see [LayoutGraphUtilities.arrangeRectangleRows]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowAlignment%23CENTER">Online Documentation</a>
 */
val CENTER: RowAlignment
   }
}
