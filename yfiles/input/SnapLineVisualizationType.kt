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
 * Enumeration of snap line visualization types.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineVisualizationType">Online Documentation</a>
 */
external sealed class SnapLineVisualizationType: YEnum<SnapLineVisualizationType> {
   companion object: EnumMetadata<SnapLineVisualizationType> {
       /**
 * Determines a snap line having a fixed visualization independent of the [SnapResult].
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineVisualizationType%23FIXED_LINE">Online Documentation</a>
 */
val FIXED_LINE: SnapLineVisualizationType

/**
 * Determines a decorated line between the [SnapLine.coordinates] and the snapped location.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineVisualizationType%23VARIABLE_LINE">Online Documentation</a>
 */
val VARIABLE_LINE: SnapLineVisualizationType

/**
 * Determines a snap line which snaps to a distance between different graph items.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineVisualizationType%23FIXED_DISTANCE">Online Documentation</a>
 */
val FIXED_DISTANCE: SnapLineVisualizationType

/**
 * Determines a snap line which lets an item snap in the center between two bounds of other items.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineVisualizationType%23CENTER_BETWEEN_BOUNDS">Online Documentation</a>
 */
val CENTER_BETWEEN_BOUNDS: SnapLineVisualizationType

/**
 * Determines a snap line which lets an item snap if it has an equal distance to two other items.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineVisualizationType%23EQUAL_DISTANCE_BETWEEN_BOUNDS">Online Documentation</a>
 */
val EQUAL_DISTANCE_BETWEEN_BOUNDS: SnapLineVisualizationType

/**
 * Determines a blank line between the [SnapLine.coordinates] and the snapped location.
 * 
 * Value - `16`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineVisualizationType%23BLANK_VARIABLE_LINE">Online Documentation</a>
 */
val BLANK_VARIABLE_LINE: SnapLineVisualizationType

/**
 * Determines a decorated line between the [SnapLine.coordinates] and the snapped location that is extended on both sides.
 * 
 * Value - `32`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineVisualizationType%23EXTENDED_VARIABLE_LINE">Online Documentation</a>
 */
val EXTENDED_VARIABLE_LINE: SnapLineVisualizationType

/**
 * Determines a snap line which lets an item snap in the center between two centers of other items.
 * 
 * Value - `64`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineVisualizationType%23CENTER_BETWEEN_CENTERS">Online Documentation</a>
 */
val CENTER_BETWEEN_CENTERS: SnapLineVisualizationType

/**
 * Determines a snap line which lets an item snap if its center has an equal distance to the centers' of two other items.
 * 
 * Value - `128`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineVisualizationType%23EQUAL_DISTANCE_BETWEEN_CENTERS">Online Documentation</a>
 */
val EQUAL_DISTANCE_BETWEEN_CENTERS: SnapLineVisualizationType

/**
 * Determines the snapping of a resized item if its new width is equal to another item.
 * 
 * Value - `256`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineVisualizationType%23EQUAL_WIDTH">Online Documentation</a>
 */
val EQUAL_WIDTH: SnapLineVisualizationType

/**
 * Determines the snapping of a resized item if its new height is equal to another item.
 * 
 * Value - `512`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineVisualizationType%23EQUAL_HEIGHT">Online Documentation</a>
 */
val EQUAL_HEIGHT: SnapLineVisualizationType

/**
 * Determines a snap line for an edge segment with three marks for special start, end and center positions.
 * 
 * Value - `1024`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineVisualizationType%23EDGE_SEGMENT">Online Documentation</a>
 */
val EDGE_SEGMENT: SnapLineVisualizationType

/**
 * Determines a snap line for snapping on a grid line.
 * 
 * Value - `1280`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineVisualizationType%23GRID_FIXED_LINE">Online Documentation</a>
 */
val GRID_FIXED_LINE: SnapLineVisualizationType

/**
 * Determines a snap line that doesn't have a visualization.
 * 
 * Value - `2048`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineVisualizationType%23NONE">Online Documentation</a>
 */
val NONE: SnapLineVisualizationType
   }
}
