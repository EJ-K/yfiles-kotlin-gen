// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.YRectangle
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class describes the obstacles that are used by implementations of [IObstaclePartition] to subdivide an area into [PartitionCell]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Obstacle">Online Documentation</a>
 * 
 * @constructor Creates a new [Obstacle] instance with the given bounds and additional data.
 * @param [bounds] the bounds of the obstacle
 * @param [data] the additional data associated to the obstacle
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Obstacle%23Obstacle-constructor-Obstacle">Online Documentation</a>
 * 
 * @property bounds
 * Gets the bounds of the obstacle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Obstacle%23bounds">Online Documentation</a>
 * 
 * @property data
 * Gets the additional data related to the obstacle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Obstacle%23data">Online Documentation</a>
 */
external open class Obstacle  (
open val bounds: YRectangle,
open val data: ObstacleData) : YObject {

/**
 * Gets or sets the cost penalty for entering this obstacle during a [PathSearch].
 * 
 * Default value - `0`. Entering this obstacle does not induce any penalty.
 * @throws ArgumentError if the cost is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Obstacle%23cost">Online Documentation</a>
 */
open var cost: Double

companion object : ClassMetadata<Obstacle> {
}
}
