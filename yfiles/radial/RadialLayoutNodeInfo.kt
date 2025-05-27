// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.radial

import yfiles.algorithms.YPoint
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Info object used for retrieving information about each node from the layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutNodeInfo">Online Documentation</a>
 * 
 * @constructor Creates a new [RadialLayoutNodeInfo] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutNodeInfo%23RadialLayoutNodeInfo-constructor-RadialLayoutNodeInfo">Online Documentation</a>
 */
external open class RadialLayoutNodeInfo  () : YObject {

/**
 * Gets the offset from the center of the circle, the node is placed on, to the center of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutNodeInfo%23centerOffset">Online Documentation</a>
 */
open val centerOffset: YPoint
/**
 * Gets the index of the circle the node is placed on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutNodeInfo%23circleIndex">Online Documentation</a>
 */
open val circleIndex: Int
/**
 * Gets the radius of the circle the node is placed on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutNodeInfo%23radius">Online Documentation</a>
 */
open val radius: Double
/**
 * Gets the size in degrees of the sector the node is placed in.
 * @see [sectorStart]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutNodeInfo%23sectorSize">Online Documentation</a>
 */
open val sectorSize: Double
/**
 * Gets the start angle in degrees of the sector the node is placed in.
 * @see [sectorSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutNodeInfo%23sectorStart">Online Documentation</a>
 */
open val sectorStart: Double

companion object : ClassMetadata<RadialLayoutNodeInfo> {
}
}
