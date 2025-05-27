// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [OrthogonalPatternEdgeRouter.monotonicPathRestriction]
 * @see [EdgeLayoutDescriptor.monotonicPathRestriction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MonotonicPathRestriction">Online Documentation</a>
 */
external sealed class MonotonicPathRestriction: YEnum<MonotonicPathRestriction> {
   companion object: EnumMetadata<MonotonicPathRestriction> {
       /**
 * A constant specifying that there are no monotonic edge path restrictions.
 * 
 * Value - `0`
 * @see [EdgeLayoutDescriptor.monotonicPathRestriction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MonotonicPathRestriction%23NONE">Online Documentation</a>
 */
val NONE: MonotonicPathRestriction

/**
 * A constant specifying monotonic edge path restrictions for the vertical direction.
 * 
 * Value - `1`
 * @see [EdgeLayoutDescriptor.monotonicPathRestriction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MonotonicPathRestriction%23VERTICAL">Online Documentation</a>
 */
val VERTICAL: MonotonicPathRestriction

/**
 * A constant specifying monotonic edge path restrictions for the horizontal direction.
 * 
 * Value - `2`
 * @see [EdgeLayoutDescriptor.monotonicPathRestriction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MonotonicPathRestriction%23HORIZONTAL">Online Documentation</a>
 */
val HORIZONTAL: MonotonicPathRestriction

/**
 * A constant specifying monotonic edge path restrictions for the horizontal and vertical direction.
 * 
 * Value - `3`
 * @see [EdgeLayoutDescriptor.monotonicPathRestriction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MonotonicPathRestriction%23BOTH">Online Documentation</a>
 */
val BOTH: MonotonicPathRestriction
   }
}
