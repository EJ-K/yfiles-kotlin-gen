// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable

/**
 * This class represents a row of a [partition grid][PartitionGrid] structure.
 * @see [PartitionGrid]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowDescriptor">Online Documentation</a>
 */
external open class RowDescriptor  : IComparable<RowDescriptor> {

/**
 * Gets or sets the bottom inset in which no element will lie in the resulting layout.
 * 
 * Default value - `0.0`
 * @throws ArgumentError if the given bottom inset is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowDescriptor%23bottomInset">Online Documentation</a>
 */
open var bottomInset: Double
/**
 * Gets or sets the computed height of the row after the layout has been calculated.
 * 
 * Default value - `0.0`
 * @throws ArgumentError if the computed height is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowDescriptor%23computedHeight">Online Documentation</a>
 */
open var computedHeight: Double
/**
 * Gets or sets the computed position (smallest y-coordinate) of the row after the layout has been calculated.
 * 
 * Default value - `0.0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowDescriptor%23computedPosition">Online Documentation</a>
 */
open var computedPosition: Double
/**
 * Gets the index of the row within the [partition grid][PartitionGrid].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowDescriptor%23index">Online Documentation</a>
 */
open val index: Int
/**
 * Gets or sets whether the index of the row is fixed or it should be chosen automatically in order to minimize edge lengths.
 * 
 * Default value - `true`. The index of the row is fixed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowDescriptor%23indexFixed">Online Documentation</a>
 */
open var indexFixed: Boolean
/**
 * Gets or sets the minimum height of the row.
 * 
 * Default value - `0.0`
 * @throws ArgumentError if the minimum height is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowDescriptor%23minimumHeight">Online Documentation</a>
 */
open var minimumHeight: Double
/**
 * Gets or sets the original height of the row.
 * 
 * Default value - `0.0`
 * @throws ArgumentError if the original height is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowDescriptor%23originalHeight">Online Documentation</a>
 */
open var originalHeight: Double
/**
 * Gets or sets the original position (smallest y-coordinate) of the row.
 * 
 * Default value - `0.0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowDescriptor%23originalPosition">Online Documentation</a>
 */
open var originalPosition: Double
/**
 * Gets or sets the tightness factor of this row.
 * 
 * Default value - `0.0`. The row will not be compressed.
 * @throws ArgumentError if the tightness value is outside the interval `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowDescriptor%23tightness">Online Documentation</a>
 */
open var tightness: Double
/**
 * Gets or sets the top inset in which no element will lie in the resulting layout.
 * 
 * Default value - `0.0`
 * @throws ArgumentError if the given top inset is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowDescriptor%23topInset">Online Documentation</a>
 */
open var topInset: Double
/**
 * Compares this [RowDescriptor] instance with a given other [RowDescriptor] instance based on the indices of the two instances.
 * @param [other] the [RowDescriptor] to compare to
 * @return `-1`, `0` or `1` if this [RowDescriptor] is less than, equal to, or greater than the given other [RowDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RowDescriptor%23RowDescriptor-method-compareTo">Online Documentation</a>
 */
 override  operator fun compareTo( other: RowDescriptor ):Int

companion object : ClassMetadata<RowDescriptor> {
}
}
