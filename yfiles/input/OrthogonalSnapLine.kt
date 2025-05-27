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
import yfiles.geometry.Rect
import yfiles.graph.GraphItemTypes
import yfiles.graph.IModelItem
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata

/**
 * An orthogonal snap line, in other words, one that is parallel to the x or y axis.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSnapLine">Online Documentation</a>
 * 
 * @constructor Creates a new snap line using the provided attributes.
 * @param [orientation] The orientation of the snap line. This is one of [HORIZONTAL][SnapLineOrientation] or [VERTICAL][SnapLineOrientation].
 * @param [snapType] The type of the line that describes how other items will snap to this line. This is one of [TOP][SnapLineSnapTypes], [BOTTOM][SnapLineSnapTypes], [LEFT][SnapLineSnapTypes], [RIGHT][SnapLineSnapTypes], or [CENTER][SnapLineSnapTypes].
 * @param [visualizationType] The type of the visual representation of this snap line.
 * @param [coordinates] The coordinates of the center point of the snap line.
 * @param [croppable] Whether this snap line may get cropped at obstacles if [cropSnapLines][GraphSnapContext] is set.
 * @param [weight] The weight (importance) of this snap line. If more than one snap line is snapped to, the one with the greater weight will be used.
 * @param [snappableItems] The graph item types that may snap to this snap reference.
 * @param [tag] A tag that is associated with this snap line - see [tag][SnapReference] for a typical use of this value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSnapLine%23OrthogonalSnapLine-constructor-OrthogonalSnapLine(SnapLineOrientation,SnapLineSnapTypes,SnapReferenceVisualizationType,Point,boolean,number,GraphItemTypes,any)">Online Documentation</a>
 */
open external class OrthogonalSnapLine (
  orientation: SnapLineOrientation,
  snapType: SnapLineSnapTypes,
  visualizationType: SnapReferenceVisualizationType,
  coordinates: Point,
  croppable: Boolean,
  weight: Double,
  snappableItems: GraphItemTypes  = definedExternally,
  tag: Tag?  = definedExternally,
) : SnapLine {
  /**
   * Creates a new snap line using the provided attributes.
   * @param [orientation] The orientation of the snap line. This is one of [HORIZONTAL][SnapLineOrientation] or [VERTICAL][SnapLineOrientation].
   * @param [snapType] The type of the line that describes how other items will snap to this line. This is one of [TOP][SnapLineSnapTypes], [BOTTOM][SnapLineSnapTypes], [LEFT][SnapLineSnapTypes], [RIGHT][SnapLineSnapTypes], or [CENTER][SnapLineSnapTypes].
   * @param [visualizationType] The type of the visual representation of this snap line.
   * @param [coordinates] The coordinates of the center point of the snap line.
   * @param [from] The smaller value of the coordinate that delimits this snap line.
   * @param [to] The greater value of the coordinate that delimits this snap line.
   * @param [croppable] Whether this snap line may get cropped at obstacles if [cropSnapLines][GraphSnapContext] is set.
   * @param [weight] The weight (importance) of this snap line. If more than one snap line is snapped to, the one with the greater weight will be used.
   * @param [snappableItems] The graph item types that may snap to this snap reference.
   * @param [tag] A tag that is associated with this snap line - see [tag][SnapReference] for a typical use of this value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSnapLine%23OrthogonalSnapLine-constructor-OrthogonalSnapLine(SnapLineOrientation,SnapLineSnapTypes,SnapReferenceVisualizationType,Point,number,number,boolean,number,GraphItemTypes,any)">Online Documentation</a>
   */ constructor(
    orientation: SnapLineOrientation,
    snapType: SnapLineSnapTypes,
    visualizationType: SnapReferenceVisualizationType,
    coordinates: Point,
    from: Double,
    to: Double,
    croppable: Boolean,
    weight: Double,
    snappableItems: GraphItemTypes  = definedExternally,
    tag: Tag?  = definedExternally,
  )
  /**
   * Gets if this snap line may get cropped at obstacles if [cropSnapLines][GraphSnapContext] is set.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSnapLine%23croppable">Online Documentation</a>
   */
  final val croppable: Boolean
  
  /**
   * Gets the orientation of the snap line.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSnapLine%23orientation">Online Documentation</a>
   */
  final val orientation: SnapLineOrientation
  
  /**
   * Gets the type of the line that describes how other items will snap to this line.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSnapLine%23snapType">Online Documentation</a>
   */
  final val snapType: SnapLineSnapTypes
  
  /**
   * Collects a valid [SnapResult] that snaps the `movedPoint` to this orthogonal line.
   * @param [event] The arguments describing the movement the [SnapResult] shall be created for.
   * @param [movedItem] The item that is currently moved.
   * @param [movedPoint] The location that shall be snapped to this line.
   * @return A valid snap result on this line or `null` if no such snap result could be found.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSnapLine%23OrthogonalSnapLine-method-collectPointSnapResult">Online Documentation</a>
   */
  override fun collectPointSnapResult(
    event: CollectSnapResultsEventArgs,
    movedItem: IModelItem?,
    movedPoint: Point,
  ): SnapResult?
  
  /**
   * Calculates a valid [SnapResult] that snaps the side of a reshaped rectangle described by the `snapType` to this orthogonal line.
   * @param [event] The arguments describing the movement the [SnapResult] shall be created for.
   * @param [reshapeContext] The reshape context that contains information about the nature of the resize.
   * @param [reshapedItem] The item that is currently reshaped.
   * @param [suggestedLayout] The layout of the item as it would be if the pointer location would not be snapped.
   * @param [snapType] The side of the reshaped rectangle that shall be snapped.
   * @return A valid snap result on this line or `null` if no such snap result could be found.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSnapLine%23OrthogonalSnapLine-method-collectReshapeSnapResult">Online Documentation</a>
   */
  open fun collectReshapeSnapResult(
    event: CollectSnapResultsEventArgs,
    reshapeContext: ReshapeRectangleContext,
    reshapedItem: IModelItem?,
    suggestedLayout: Rect,
    snapType: SnapLineSnapTypes,
  ): SnapResult?
  
  /**
   * Calculates a valid [SnapResult] that snaps the orthogonal segment defined by the given parameters to this orthogonal line.
   * @param [event] The arguments describing the movement the [SnapResult] shall be created for.
   * @param [movedItem] The item that is currently moved.
   * @param [from] The start value of the orthogonal segment to snap.
   * @param [to] The end value of the orthogonal segment to snap.
   * @param [orthogonalCoordinate] The coordinate in the direction orthogonal to the segment orientation.
   * @param [snapType] The side of a rectangle the orthogonal segment corresponds to.
   * @return A valid snap result on this line or `null` if no such snap result could be found.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSnapLine%23OrthogonalSnapLine-method-collectSegmentSnapResult">Online Documentation</a>
   */
  open fun collectSegmentSnapResult(
    event: CollectSnapResultsEventArgs,
    movedItem: IModelItem?,
    from: Double,
    to: Double,
    orthogonalCoordinate: Double,
    snapType: SnapLineSnapTypes,
  ): SnapResult?
  
  companion object : ClassMetadata<OrthogonalSnapLine> {
  }
}
