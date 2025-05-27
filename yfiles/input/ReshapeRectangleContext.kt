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
import yfiles.lang.YObject

/**
 * Carries information about a reshape operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ReshapeRectangleContext] class.
 * @param [initialBounds] The initial bounds of the node.
 * @param [minimumSize] The minimum size of the node.
 * @param [maximumSize] The maximum size of the node.
 * @param [minimumEnclosedArea] The minimum area the node's layout needs to encompass. Providing an [empty rectangle][Rect.EMPTY] will disable this restriction.
 * @param [maximumBoundingArea] The maximum bounding area the node's layout may fill. Providing an [infinite rectangle][Rect.INFINITE] will disable this restriction.
 * @param [reshapePosition] The position of the reshape handle.
 * @param [topLeftChangeFactor] The factor by which the top left corner of the node layout changes when the handle is dragged.
 * @param [bottomRightChangeFactor] The factor by which the bottom right corner of the node layout changes when the handle is dragged.
 * @param [sizeChangeFactor] The factor by which the size of the node layout changes when the handle is dragged.
 * @param [reshapePolicy] The policy used for aspect ratio resizing.
 * @param [ratio] The aspect ratio used for aspect ratio resizing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23ReshapeRectangleContext-constructor-ReshapeRectangleContext">Online Documentation</a>
 * 
 * @property initialBounds
 * Gets the initial bounds of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23initialBounds">Online Documentation</a>
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
 * Gets minimum area the node's layout needs to encompass
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23minimumEnclosedArea">Online Documentation</a>
 * 
 * @property maximumBoundingArea
 * Gets the maximal bounds the node's layout may fill.
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
 * Gets the policy if and how the change in size of the reshapeable keeps the [ratio] during the reshape gesture.
 * @see [ratio]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23reshapePolicy">Online Documentation</a>
 * 
 * @property ratio
 * Gets the ratio between the change of the width and the change of the height that is kept during the reshape gesture.
 * @see [reshapePolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeRectangleContext%23ratio">Online Documentation</a>
 */
external  class ReshapeRectangleContext  (
final val initialBounds: Rect,
final val minimumSize: ISize,
final val maximumSize: ISize,
final val minimumEnclosedArea: IRectangle,
final val maximumBoundingArea: IRectangle,
final val reshapePosition: HandlePositions,
final val topLeftChangeFactor: Point,
final val bottomRightChangeFactor: Point,
final val sizeChangeFactor: Size,
final val reshapePolicy: ReshapePolicy,
final val ratio: Double) : YObject {

companion object : ClassMetadata<ReshapeRectangleContext> {
}
}
