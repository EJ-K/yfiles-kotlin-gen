// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * The policy constants used by [IGridConstraintProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapPolicy">Online Documentation</a>
 */
external sealed class SnapPolicy: YEnum<SnapPolicy> {
   companion object: EnumMetadata<SnapPolicy> {
       /**
 * Don't perform snapping.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapPolicy%23NO_SNAPPING">Online Documentation</a>
 */
val NO_SNAPPING: SnapPolicy

/**
 * Snap to the nearest grid coordinate.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapPolicy%23TO_NEAREST">Online Documentation</a>
 */
val TO_NEAREST: SnapPolicy

/**
 * Snap to the nearest grid coordinate whose value is not less than the current coordinate.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapPolicy%23TO_GREATER">Online Documentation</a>
 */
val TO_GREATER: SnapPolicy

/**
 * Snap to the nearest grid coordinate whose value is not greater than the current coordinate.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapPolicy%23TO_SMALLER">Online Documentation</a>
 */
val TO_SMALLER: SnapPolicy
   }
}
