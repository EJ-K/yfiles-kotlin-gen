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
 * Fix point calculation policy specifying that the *center* of a rectangle containing all fixed nodes is considered the fix point.
 * @see [FixNodeLayoutStage.fixPointPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixPointPolicy">Online Documentation</a>
 */
external sealed class FixPointPolicy: YEnum<FixPointPolicy> {
   companion object: EnumMetadata<FixPointPolicy> {
       /**
 * Fix point calculation policy specifying that the *center* of a rectangle containing all fixed nodes is considered the fix point.
 * 
 * Value - `1`
 * @see [FixNodeLayoutStage.fixPointPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixPointPolicy%23CENTER">Online Documentation</a>
 */
val CENTER: FixPointPolicy

/**
 * Fix point calculation policy specifying that the *upper left corner* of a rectangle containing all fixed nodes is considered the fix point.
 * 
 * Value - `2`
 * @see [FixNodeLayoutStage.fixPointPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixPointPolicy%23UPPER_LEFT">Online Documentation</a>
 */
val UPPER_LEFT: FixPointPolicy

/**
 * Fix point calculation policy specifying that the *upper right corner* of a rectangle containing all fixed nodes is considered the fix point.
 * 
 * Value - `3`
 * @see [FixNodeLayoutStage.fixPointPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixPointPolicy%23UPPER_RIGHT">Online Documentation</a>
 */
val UPPER_RIGHT: FixPointPolicy

/**
 * Fix point calculation policy specifying that the *lower right corner* of a rectangle containing all fixed nodes is considered the fix point.
 * 
 * Value - `4`
 * @see [FixNodeLayoutStage.fixPointPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixPointPolicy%23LOWER_RIGHT">Online Documentation</a>
 */
val LOWER_RIGHT: FixPointPolicy

/**
 * Fix point calculation policy specifying that the *lower left corner* of a rectangle containing all fixed nodes is considered the fix point.
 * 
 * Value - `5`
 * @see [FixNodeLayoutStage.fixPointPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixPointPolicy%23LOWER_LEFT">Online Documentation</a>
 */
val LOWER_LEFT: FixPointPolicy
   }
}
