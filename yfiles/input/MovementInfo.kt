// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IPoint
import yfiles.geometry.Point
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Used in the context of [GraphSnapContext] to describe the movement of entities during the edit process.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MovementInfo">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [MovementInfo] class.
 * @param [originalLocation] The original location.
 * @param [moveType] The type of the move.
 * @param [movedItem] The item that is being moved.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MovementInfo%23MovementInfo-constructor-MovementInfo">Online Documentation</a>
 * 
 * @property originalLocation
 * Gets the original location of the element at the time the editing started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MovementInfo%23originalLocation">Online Documentation</a>
 * 
 * @property moveType
 * Gets or sets the type of the movement for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MovementInfo%23moveType">Online Documentation</a>
 * 
 * @property movedItem
 * Gets the item that is being moved.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MovementInfo%23movedItem">Online Documentation</a>
 */
external abstract class MovementInfo 
protected constructor (
final val originalLocation: Point,
final var moveType: MoveTypes,
final val movedItem: IModelItem) : YObject {

/**
 * Gets the current location as a live point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MovementInfo%23currentLocation">Online Documentation</a>
 */
abstract val currentLocation: IPoint
/**
 * Gets or sets the horizontal movement info to which this info is anchored horizontally.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MovementInfo%23horizontalAnchor">Online Documentation</a>
 */
final var horizontalAnchor: MovementInfo?
/**
 * Gets a value indicating whether the x coordinate of the item is fixed during the move operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MovementInfo%23isHorizontallyFixed">Online Documentation</a>
 */
final val isHorizontallyFixed: Boolean
/**
 * Gets a value indicating whether the y coordinate of the item is fixed during the move operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MovementInfo%23isVerticallyFixed">Online Documentation</a>
 */
final val isVerticallyFixed: Boolean
/**
 * Gets or sets the vertical movement info to which this info is anchored vertically.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MovementInfo%23verticalAnchor">Online Documentation</a>
 */
final var verticalAnchor: MovementInfo?
/**
 * Gets the new x coordinate of the element if the mouse has been moved by `dx` during the gesture.
 * @param [dx] The delta x coordinate.
 * @return The new x coordinate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MovementInfo%23MovementInfo-method-getX">Online Documentation</a>
 */
 final   fun getX( dx: Double ):Double
/**
 * Gets the new y coordinate of the element if the mouse has been moved by `dy` during the gesture.
 * @param [dy] The delta y coordinate.
 * @return The new y coordinate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MovementInfo%23MovementInfo-method-getY">Online Documentation</a>
 */
 final   fun getY( dy: Double ):Double
/**
 * Determines whether this instances moves synchronized with the provided info.
 * @param [info] The info to check.
 * @return Whether this info and the given info move horizontally synchronized.
 * @see [horizontalAnchor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MovementInfo%23MovementInfo-method-movesHorizontallySynchronizedWith">Online Documentation</a>
 */
 open   fun movesHorizontallySynchronizedWith( info: MovementInfo ):Boolean
/**
 * Determines whether this instances moves synchronized with the provided info.
 * @param [info] The info to check.
 * @return Whether this info and the given info move vertically synchronized.
 * @see [verticalAnchor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MovementInfo%23MovementInfo-method-movesVerticallySynchronizedWith">Online Documentation</a>
 */
 open   fun movesVerticallySynchronizedWith( info: MovementInfo ):Boolean

companion object : ClassMetadata<MovementInfo> {
}
}
