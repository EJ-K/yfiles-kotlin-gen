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
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Describes the state of a snapping operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapState">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [SnapState] class.
 * @param [location] The initial location.
 * @param [snapType] The current type of the snap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapState%23SnapState-constructor-SnapState">Online Documentation</a>
 * 
 * @property location
 * Gets the current location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapState%23location">Online Documentation</a>
 * 
 * @property snapType
 * Gets or sets the type of the snap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapState%23snapType">Online Documentation</a>
 */
external  class SnapState  (
final val location: Point,
final var snapType: SnapTypes = definedExternally) : YObject {

/**
 * Sets the [location] to the given point and adjusts the [snapType] accordingly.
 * @param [newLocation] The new location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapState%23SnapState-method-snapTo">Online Documentation</a>
 */
 final   fun snapTo( newLocation: Point )
/**
 * Modifies the X property of the [location] and adjusts the [snapType] accordingly.
 * @param [newX] The new X.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapState%23SnapState-method-snapX">Online Documentation</a>
 */
 final   fun snapX( newX: Double )
/**
 * Modifies the Y property of the [location] and adjusts the [snapType] accordingly.
 * @param [newY] The new Y.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapState%23SnapState-method-snapY">Online Documentation</a>
 */
 final   fun snapY( newY: Double )

companion object : ClassMetadata<SnapState> {
}
}
