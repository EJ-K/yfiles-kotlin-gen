// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable

/**
 * This class is used by [HierarchicLayoutCore] during the various phases and models a swimlane structure.
 * @see [HierarchicLayoutCore.SWIMLANE_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new [SwimlaneDescriptor] instance with a given client [Object] and a given [IComparer].
 * @param [clientObject] a client [Object] used for sorting the lanes
 * @param [comparer] a [IComparer] used for comparing the client objects
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneDescriptor%23SwimlaneDescriptor-constructor-SwimlaneDescriptor">Online Documentation</a>
 * 
 * @property clientObject
 * Gets or sets the client [object][Object].
 * @throws ArgumentError if there is currently no [comparator][IComparer] and the specified object is not a [IComparable] instance or if the given client object is `null`
 * @see [comparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneDescriptor%23clientObject">Online Documentation</a>
 * 
 * @property comparer
 * Gets or sets the [IComparer] instance used for sorting the lanes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneDescriptor%23comparer">Online Documentation</a>
 */
external open class SwimlaneDescriptor  (
open var clientObject: Any,
open var comparer: IComparer<in SwimlaneDescriptor>? = definedExternally) : IComparable<SwimlaneDescriptor> {

/**
 * Gets the computed zero-based index of the swimlane after the layout has been calculated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneDescriptor%23computedLaneIndex">Online Documentation</a>
 */
open val computedLaneIndex: Int
/**
 * Gets the computed position (smaller coordinate) of the swimlane after the layout has been calculated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneDescriptor%23computedLanePosition">Online Documentation</a>
 */
open val computedLanePosition: Double
/**
 * Gets the computed width of the swimlane after the layout has been calculated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneDescriptor%23computedLaneWidth">Online Documentation</a>
 */
open val computedLaneWidth: Double
/**
 * Gets or sets whether or not an index of a swimlane is fixed (based on the result of the comparison with the other swimlanes) or whether the index should be chosen automatically in order to minimize edge lengths.
 * 
 * Default value - `true`. The index of the swimlane will not be determined automatically.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneDescriptor%23indexFixed">Online Documentation</a>
 */
open var indexFixed: Boolean
/**
 * Gets or sets the tightness factor of the lane.
 * 
 * Default value - `0.0`. Swimlane will not be compressed.
 * @throws ArgumentError if the tightness value is outside `[0,1]` interval
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneDescriptor%23laneTightness">Online Documentation</a>
 */
open var laneTightness: Double
/**
 * Gets or sets the left insets of the swimlane in which no element will lie in the resulting layout.
 * 
 * Default value - `0.0`
 * @throws ArgumentError if the specified value is less than `0`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneDescriptor%23leftLaneInset">Online Documentation</a>
 */
open var leftLaneInset: Double
/**
 * Gets or sets the minimum width of the swimlane.
 * 
 * Default value - `0.0`
 * @throws ArgumentError if the specified value negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneDescriptor%23minimumLaneWidth">Online Documentation</a>
 */
open var minimumLaneWidth: Double
/**
 * Gets or sets the right insets of the swimlane in which no element will lie in the resulting layout.
 * 
 * Default value - `0.0`
 * @throws ArgumentError if the specified value is less than `0`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneDescriptor%23rightLaneInset">Online Documentation</a>
 */
open var rightLaneInset: Double
/**
 * Implements the [IComparable] interface using the [comparer] and [clientObject] fields.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneDescriptor%23SwimlaneDescriptor-method-compareTo">Online Documentation</a>
 */
 override  operator fun compareTo( other: SwimlaneDescriptor ):Int

companion object : ClassMetadata<SwimlaneDescriptor> {
}
}
