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
 * This class represents a column of a [partition grid][PartitionGrid] structure.
 * @see [PartitionGrid]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ColumnDescriptor">Online Documentation</a>
 */
external open class ColumnDescriptor  : IComparable<ColumnDescriptor> {

/**
 * Gets or sets the computed position (smallest x-coordinate) of the column after the layout has been calculated.
 * 
 * Default value - `0.0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ColumnDescriptor%23computedPosition">Online Documentation</a>
 */
open var computedPosition: Double
/**
 * Gets or sets the computed width of the column after the layout has been calculated.
 * 
 * Default value - `0.0`
 * @throws ArgumentError if the computed width is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ColumnDescriptor%23computedWidth">Online Documentation</a>
 */
open var computedWidth: Double
/**
 * Gets the index of the column within the [partition grid][PartitionGrid].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ColumnDescriptor%23index">Online Documentation</a>
 */
open val index: Int
/**
 * Gets or sets whether the index of the column is fixed or it should be chosen automatically in order to minimize edge lengths.
 * 
 * Default value - `true`. The index of the column is fixed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ColumnDescriptor%23indexFixed">Online Documentation</a>
 */
open var indexFixed: Boolean
/**
 * Gets or sets the left column inset in which no element will lie in the resulting layout.
 * 
 * Default value - `0.0`
 * @throws ArgumentError if the left inset is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ColumnDescriptor%23leftInset">Online Documentation</a>
 */
open var leftInset: Double
/**
 * Gets or sets the minimum width of the column.
 * 
 * Default value - `0.0`
 * @throws ArgumentError if the minimum width is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ColumnDescriptor%23minimumWidth">Online Documentation</a>
 */
open var minimumWidth: Double
/**
 * Gets or sets the original position (smallest x-coordinate) of the column.
 * 
 * Default value - `0.0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ColumnDescriptor%23originalPosition">Online Documentation</a>
 */
open var originalPosition: Double
/**
 * Gets or sets the original width of the column.
 * 
 * Default value - `0.0`
 * @throws ArgumentError if the original width is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ColumnDescriptor%23originalWidth">Online Documentation</a>
 */
open var originalWidth: Double
/**
 * Gets or sets the right column inset in which no element will lie in the resulting layout.
 * 
 * Default value - `0.0`
 * @throws ArgumentError if the right inset is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ColumnDescriptor%23rightInset">Online Documentation</a>
 */
open var rightInset: Double
/**
 * Gets or sets the tightness factor of this column.
 * 
 * Default value - `0.0`. The column will not be compressed.
 * @throws ArgumentError if the tightness value is outside the interval `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ColumnDescriptor%23tightness">Online Documentation</a>
 */
open var tightness: Double
/**
 * Compares this [ColumnDescriptor] instance with a given other [ColumnDescriptor] instance based on the indices of the two instances.
 * @param [other] the [ColumnDescriptor] to compare to
 * @return `-1`, `0` or `1` if this [ColumnDescriptor] is less than, equal to, or greater than the given other [ColumnDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ColumnDescriptor%23ColumnDescriptor-method-compareTo">Online Documentation</a>
 */
 override  operator fun compareTo( other: ColumnDescriptor ):Int

companion object : ClassMetadata<ColumnDescriptor> {
}
}
