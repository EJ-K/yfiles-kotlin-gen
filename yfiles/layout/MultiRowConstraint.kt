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
 * @see [LayoutGraphUtilities.arrangeRectangleMultiRows]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiRowConstraint">Online Documentation</a>
 */
external sealed class MultiRowConstraint: YEnum<MultiRowConstraint> {
   companion object: EnumMetadata<MultiRowConstraint> {
       /**
 * Constraint specifier for a multi-row rectangle arrangement that is unconstrained.
 * 
 * Value - `0`
 * @see [LayoutGraphUtilities.arrangeRectangleMultiRows]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiRowConstraint%23NONE">Online Documentation</a>
 */
val NONE: MultiRowConstraint

/**
 * Constraint specifier for a multi-row rectangle arrangement that constrains the height of the layout.
 * 
 * Value - `1`
 * @see [LayoutGraphUtilities.arrangeRectangleMultiRows]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiRowConstraint%23HEIGHT">Online Documentation</a>
 */
val HEIGHT: MultiRowConstraint

/**
 * Constraint specifier for a multi-row rectangle arrangement that constrains the width of the layout.
 * 
 * Value - `2`
 * @see [LayoutGraphUtilities.arrangeRectangleMultiRows]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiRowConstraint%23WIDTH">Online Documentation</a>
 */
val WIDTH: MultiRowConstraint
   }
}
