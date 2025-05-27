// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import kotlin.js.Date
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * The representation of a touch point on the screen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchDevice">Online Documentation</a>
 */
external open class TouchDevice  : YObject {

/**
 * Gets the device's index
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchDevice%23deviceIndex">Online Documentation</a>
 */
final val deviceIndex: Int
/**
 * Indicates if this device is currently down or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchDevice%23isDown">Online Documentation</a>
 */
final val isDown: Boolean
/**
 * Gets a value indicating whether this device is the primary one.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchDevice%23isPrimaryDevice">Online Documentation</a>
 */
final val isPrimaryDevice: Boolean
/**
 * Gets the time of the last [event][TouchEventArgs] that was raised by this device.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchDevice%23lastEventTimeJS">Online Documentation</a>
 */
final val lastEventTimeJS: Date
/**
 * Gets the last device coordinate in the view coordinate system.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchDevice%23lastViewCoordinate">Online Documentation</a>
 */
final val lastViewCoordinate: Point

companion object : ClassMetadata<TouchDevice> {
}
}
