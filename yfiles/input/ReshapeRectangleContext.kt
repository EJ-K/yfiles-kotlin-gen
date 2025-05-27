// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IRectangle
import yfiles.geometry.ISize
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata

/**
 * Carries information about a reshape operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ReshapeRectangleContext] class.
 * @param [initialLayout] The initial layout of the node.
 * @param [minimumSize] The minimum size of the node.
 * @param [maximumSize] The maximum size of the node.
 * @param [minimumEnclosedArea] The minimum area the node's layout needs to encompass. Providing an [EMPTY][Rect] rectangle will disable this restriction.
 * @param [maximumBoundingArea] The maximum bounding area the node's layout may fill. Providing an [INFINITE][Rect] rectangle will disable this restriction.
 * @param [reshapePosition] The position of the reshape handle.
 * @param [topLeftChangeFactor] The factor by which the top left corner of the node layout changes when the handle is dragged.
 * @param [bottomRightChangeFactor] The factor by which the bottom right corner of the node layout changes when the handle is dragged.
 * @param [sizeChangeFactor] The factor by which the size of the node layout changes when the handle is dragged.
 * @param [reshapePolicy] The policy used for aspect ratio resizing.
 * @param [ratio] The aspect ratio used for aspect ratio resizing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23ReshapeRectangleContext-constructor-ReshapeRectangleContext">Online Documentation</a>
 * 
 * @property initialLayout
 * Gets the initial layout of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23initialLayout">Online Documentation</a>
 * 
 * @property minimumSize
 * Gets the minimum size of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23minimumSize">Online Documentation</a>
 * 
 * @property maximumSize
 * Gets or sets the maximum size of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23maximumSize">Online Documentation</a>
 * 
 * @property minimumEnclosedArea
 * Gets the minimum area the node's layout needs to encompass.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23minimumEnclosedArea">Online Documentation</a>
 * 
 * @property maximumBoundingArea
 * Gets the maximal rectangle the node's layout may fill.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23maximumBoundingArea">Online Documentation</a>
 * 
 * @property reshapePosition
 * Gets the position of the reshape handle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23reshapePosition">Online Documentation</a>
 * 
 * @property topLeftChangeFactor
 * Gets the factor by which the top left corner of the node layout changes when the handle is dragged.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23topLeftChangeFactor">Online Documentation</a>
 * 
 * @property bottomRightChangeFactor
 * Gets the factor by which the bottom right corner of the node layout changes when the handle is dragged.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23bottomRightChangeFactor">Online Documentation</a>
 * 
 * @property sizeChangeFactor
 * Gets the factor by which the size of the node layout changes when the handle is dragged.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23sizeChangeFactor">Online Documentation</a>
 * 
 * @property reshapePolicy
 * Gets the policy if and how the change in size of the reshapeable keeps the [ratio][ReshapeRectangleContext] during the reshape gesture.
 * @see [ratio]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23reshapePolicy">Online Documentation</a>
 * 
 * @property ratio
 * Gets the ratio between the change of the width and the change of the height that is kept during the reshape gesture.
 * @see [reshapePolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23ratio">Online Documentation</a>
 */
external class ReshapeRectangleContext (
final val initialLayout: Rect,
final val minimumSize: ISize,
final val maximumSize: ISize,
final val minimumEnclosedArea: IRectangle,
final val maximumBoundingArea: IRectangle,
final val reshapePosition: HandlePositions,
final val topLeftChangeFactor: Point,
final val bottomRightChangeFactor: Point,
final val sizeChangeFactor: Size,
final val reshapePolicy: ReshapePolicy,
final val ratio: Double)  {
  /**
   * Calculates a constraint for pointer locations so that the bottom side of the rectangle ends up at the `snapLocation`.
   * @param [event] The event argument to obtain the context from.
   * @param [suggestedLayout] The suggested, unsnapped layout.
   * @param [delta] The current delta of the pointer location.
   * @param [snapLocation] The y-coordinate at which the bottom rectangle side should end up.
   * @param [snapDistance] A maximum valid distance from the current pointer location.
   * @return A [SnapConstraint] for pointer locations that change the bottom side of the rectangle to end up at the `snapLocation` or `null` if there are no pointer locations in `snapDistance` that would move the bottom rectangle side to `snapLocation`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23ReshapeRectangleContext-method-calculateConstraintForBottomLocation">Online Documentation</a>
   */
  fun calculateConstraintForBottomLocation(
    event: CollectSnapResultsEventArgs,
    suggestedLayout: Rect,
    delta: Point,
    snapLocation: Double,
    snapDistance: Double,
  ): SnapConstraint?
  
  /**
   * Calculates a constraint for pointer locations so that the node height ends up to be `height`.
   * @param [event] The event argument to obtain the context from.
   * @param [suggestedLayout] The suggested, unsnapped layout.
   * @param [delta] The delta of the pointer location.
   * @param [height] The new height of the node layout.
   * @param [snapDistance] A maximum valid distance from the current pointer location.
   * @return A [SnapConstraint] for pointer locations that change the node height to `height` or `null` if there are no pointer locations in `snapDistance` satisfying the size change.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23ReshapeRectangleContext-method-calculateConstraintForHeight">Online Documentation</a>
   */
  fun calculateConstraintForHeight(
    event: CollectSnapResultsEventArgs,
    suggestedLayout: Rect,
    delta: Point,
    height: Double,
    snapDistance: Double,
  ): SnapConstraint?
  
  /**
   * Calculates a constraint for pointer locations so that the left side of the rectangle ends up at the `snapLocation`.
   * @param [event] The event argument to obtain the context from.
   * @param [suggestedLayout] The suggested, unsnapped layout.
   * @param [delta] The delta of the pointer location.
   * @param [snapLocation] The horizontal coordinate at which the left rectangle side should end up.
   * @param [snapDistance] A maximum valid distance from the current pointer location.
   * @return A [SnapConstraint] for pointer locations that change the left side of the rectangle to end up at the `snapLocation` or `null` if there are no pointer locations in `snapDistance` that would move the left rectangle side to `snapLocation`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23ReshapeRectangleContext-method-calculateConstraintForLeftLocation">Online Documentation</a>
   */
  fun calculateConstraintForLeftLocation(
    event: CollectSnapResultsEventArgs,
    suggestedLayout: Rect,
    delta: Point,
    snapLocation: Double,
    snapDistance: Double,
  ): SnapConstraint?
  
  /**
   * Calculates a constraint for pointer locations so that the right side of the rectangle ends up at the `snapLocation`.
   * @param [event] The event argument to obtain the context from.
   * @param [suggestedLayout] The suggested, unsnapped layout.
   * @param [delta] The delta of the pointer location.
   * @param [snapLocation] The horizontal coordinate at which the right rectangle side should end up.
   * @param [snapDistance] A maximum valid distance from the current pointer location.
   * @return A [SnapConstraint] for pointer locations that change the right side of the rectangle to end up at the `snapLocation` or `null` if there are no pointer locations in `snapDistance` that would move the right rectangle side to `snapLocation`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23ReshapeRectangleContext-method-calculateConstraintForRightLocation">Online Documentation</a>
   */
  fun calculateConstraintForRightLocation(
    event: CollectSnapResultsEventArgs,
    suggestedLayout: Rect,
    delta: Point,
    snapLocation: Double,
    snapDistance: Double,
  ): SnapConstraint?
  
  /**
   * Calculates a constraint for pointer locations so that the top side of the rectangle ends up at the `snapLocation`.
   * @param [event] The event argument to obtain the context from.
   * @param [suggestedLayout] The suggested, unsnapped layout.
   * @param [delta] The delta of the pointer location.
   * @param [snapLocation] The vertical coordinate at which the top rectangle side should end up.
   * @param [snapDistance] A maximum valid distance from the current pointer location.
   * @return A [SnapConstraint] for pointer locations that change the top side of the rectangle to end up at the `snapLocation` or `null` if there are no pointer locations in `snapDistance` that would move the top rectangle side to `snapLocation`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23ReshapeRectangleContext-method-calculateConstraintForTopLocation">Online Documentation</a>
   */
  fun calculateConstraintForTopLocation(
    event: CollectSnapResultsEventArgs,
    suggestedLayout: Rect,
    delta: Point,
    snapLocation: Double,
    snapDistance: Double,
  ): SnapConstraint?
  
  /**
   * Calculates a constraint for pointer locations so that the node width ends up being `width`.
   * @param [event] The event argument to obtain the context from.
   * @param [suggestedLayout] The suggested, unsnapped layout.
   * @param [delta] The delta of the pointer location.
   * @param [width] The new width of the node layout.
   * @param [snapDistance] A maximum valid distance from the current pointer location.
   * @return A [SnapConstraint] for pointer locations that change the node width to `width` or `null` if there are no pointer locations in `snapDistance` satisfying the size change.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23ReshapeRectangleContext-method-calculateConstraintForWidth">Online Documentation</a>
   */
  fun calculateConstraintForWidth(
    event: CollectSnapResultsEventArgs,
    suggestedLayout: Rect,
    delta: Point,
    width: Double,
    snapDistance: Double,
  ): SnapConstraint?
  
  /**
   * Calculates the layout of the node when the pointer would be moved `delta` from the initial location.
   * @param [delta] The delta of the pointer location.
   * @return The calculated layout if the pointer would be moved by the given `delta`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23ReshapeRectangleContext-method-calculateLayout">Online Documentation</a>
   */
  fun calculateLayout(
    delta: Point,
  ): Rect
  
  companion object : ClassMetadata<ReshapeRectangleContext> {
  }
}
