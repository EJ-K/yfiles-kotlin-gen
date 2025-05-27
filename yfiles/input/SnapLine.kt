// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.graph.GraphItemTypes
import yfiles.graph.IModelItem
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata

/**
 * A snap line is a line segment in the world coordinate system to which other items (lines or points) snap during interactive movements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine">Online Documentation</a>
 * 
 * @constructor Creates a new snap line using the provided attributes.
 * @param [visualizationType] The type of the visual representation of this snap line.
 * @param [coordinates] The coordinates of the center point of the snap line.
 * @param [from] The first location that delimits this snap line.
 * @param [to] The second location that delimits this snap line.
 * @param [weight] The weight (importance) of this snap line. If more than one snap line is snapped to, the one with the greater weight will be used.
 * @param [snappableItems] The graph item types that may snap to this snap reference.
 * @param [tag] A tag that is associated with this snap line - see [tag][SnapReference] for a typical use of this value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine%23SnapLine-constructor-SnapLine">Online Documentation</a>
 * 
 * @property visualizationType
 * Gets the visualization type which determines the visual appearance of the snap line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine%23visualizationType">Online Documentation</a>
 * 
 * @property coordinates
 * Gets the coordinates of the center point of the snap line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine%23coordinates">Online Documentation</a>
 * 
 * @property from
 * Gets or sets the first location that delimits this snap line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine%23from">Online Documentation</a>
 * 
 * @property to
 * Gets or sets the second location that delimits this snap line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine%23to">Online Documentation</a>
 */
open external class SnapLine (
final val visualizationType: SnapReferenceVisualizationType,
final val coordinates: Point,
final var from: Point,
final var to: Point,
weight: Double,
snappableItems: GraphItemTypes  = definedExternally,
tag: Tag?  = definedExternally) : SnapReference {
  /**
   * Collects a valid [SnapResult] that snaps the `movedPoint` to this line.
   * @param [event] The arguments describing the movement the [SnapResult] shall be created for.
   * @param [movedItem] The item that is currently moved.
   * @param [movedPoint] The location that shall be snapped to the line.
   * @return A valid snap result on this line or `null` if no such snap result could be found.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine%23SnapLine-method-collectPointSnapResult">Online Documentation</a>
   */
  open fun collectPointSnapResult(
    event: CollectSnapResultsEventArgs,
    movedItem: IModelItem?,
    movedPoint: Point,
  ): SnapResult?
  
  companion object : ClassMetadata<SnapLine> {
  }
}
